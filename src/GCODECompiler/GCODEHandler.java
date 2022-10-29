package GCODECompiler;

import myPackage.Graphic;
import myPackage.Interfaccia;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

//import myPackage.Interfaccia;
;

public class GCODEHandler {

	public static final int UNDEFINED = -1;	
	public static final int TOKEN_ERROR = 0;	
	public static final int ERR_ON_SYNTAX = 1;	
	public static final int LAST_SYNTAX_ERROR = 10;		
	public static final int MISSING_CHAR = 7;
	//codici di errore semantici aggiunti
	public static final int LAST_SEMANTIC_ERROR = 20;
	//codici di warning
	public static final int CIRCLE_NOT_CONNECTING = 21;
	public static final int LAST_WARNING = 30;

	static List<String> errorList;
	TokenStream lexerStream;
	public static boolean mode = false;

	public GCODEHandler (TokenStream ls) {
		System.out.println ("Handler Inizializzato");
		errorList = new ArrayList<String>();
		lexerStream = ls;
	}

	public static List<String> getErrorList() {
		return errorList;
	}
	
	// h contiene le coordinate, m il messaggio d'errore standard
	void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		String type = "";
		String st;
		if (e.token.getType() >=0)
			type = tokenNames[e.token.getType()]; 
		if (e.token.getType() == GCODELexer.SCAN_ERROR)
			st = "Errore lessicale " + TOKEN_ERROR + " a ";
		else
			st = "Errore sintattico " + ERR_ON_SYNTAX + " a ";
		st +=	"[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine()+1) + "]: " + 
				"rilevato ";
		st += type;
		
		//System.out.println(m);
		//System.out.println(m.substring(m.indexOf("expecting") + 10 , m.length()));
		
		m = " è stato rilevato '" + e.token.getText() + "' invece del comando " + m.substring(m.indexOf("expecting") + 10 , m.length()) + ".";

		if (e instanceof MissingTokenException)
		   st = st + m;		
		else /*if(e.token.getType() == MISSING_CHAR)*/
			st += " ('" + e.token.getText() + "')" + m;
		
		//Interfaccia.setData(st + "\n");
		errorList.add(st);
		
	}
	
	public void myErrorHandler(int code, String tk) {
		this.myErrorHandler(code, null, tk);
	}
	

	// Gestione errori semantici
	private void myErrorHandler(int code, Token tk, String warning) {
		String st;
		if (code == TOKEN_ERROR)
			st = "Lexical Error " + code;
		else if (code < LAST_SYNTAX_ERROR)  //è 10
			st = "Syntax Error " + code;
		else if (code < LAST_SEMANTIC_ERROR)
			st = "Errore semantico " + code;
		else 
			st = "Warning " + code;
		
		//output in base al codice
		switch(code){
		case 21:
			if(warning!=null) st+=": "+warning;
			st+="\nIl disegno potrebbe non essere visualizzato correttamente";
			default:
				break;
		}
		
		
		if (tk != null)
			st += " avvenuto qui: "+tk.getText()+" @"+tk.getTokenIndex()+" [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		st += ".\n ";

		if (code == TOKEN_ERROR)
			st += "Unrecognized token '" + tk.getText() + "'";
		
		
		
		if(!errorList.contains(st)) {
			//System.out.println("questo è il comp che cicla: " + s  + " questo è quello da aggiungere: " + st);
			Interfaccia.setData(st + "\n\n");
			errorList.add(st);
		}
		
		
		
		//System.out.println(st);
	
	}

//utilizzato per creare movimenti e tagli G00 G01
	public String createMovement (Token g, Token x, Token y) {
		if (g != null && x != null && y != null) {
			//System.out.println(g.getText() + ";" + x.getText() + ";" + y.getText());
			return g.getText() + ";" + x.getText() + ";" + y.getText();
		}
		return null;
	}
	
//utilizzato per creare stringe di tagli G02 G03
	public String createMovement(Token g, Token x, Token y, Token i, Token j) {
		if (g != null && x != null && y != null && i!=null & j!=null) {
			//System.out.println(g.getText() + ";" + x.getText() + ";" + y.getText() +";"+i.getText()+";"+j.getText());
			return g.getText() + ";" + x.getText() + ";" + y.getText() +";"+i.getText()+";"+j.getText();
		}
		return null;
	}

	
	public void addMovement (List<String> list, String pd) {
		//System.out.println("Movimento-> "+pd);
		if(pd!=null) list.add(pd);
	}
	
	public void addMCode(List<String> list, Token temp) {
		//System.out.println("MConfig-> "+temp.getText());
		if(temp!=null) list.add(temp.getText());
	}
	
	public void addTokenToStringList(List<String> list, Token temp) {
		if(temp!=null) list.add(temp.getText());
	}
	
	public void addListToStringList(List<String> list, List<String> list2) {
		if(list2!=null) list.addAll(list2);
	}
	
	public void printConfig(List<String> c)
	{
		String data = null;
		System.out.println("Configurazione-> ");
		Interfaccia.setData("Configurazione-> " + "\n");
		for(String config:c){
			data = "";
			System.out.print(config+"	");
			System.out.println(recognizeConfig(config));
			data = config + "	" + recognizeConfig(config) + "\n";
			Interfaccia.setData(data);
		}
		Interfaccia.setData("\n");
		System.out.println();
	}
	

	public void printCommand(List<String> listcom) {
		String data = null;
		for(String com:listcom){
			data = "";
			System.out.print("Movimento-> "+com+"	");
			System.out.println(recognizeComm(com));
			Graphic.setArray(listcom);
			data = "Movimento-> "+com+"	" + recognizeComm(com) + "\n";
			Interfaccia.setData(data);
		}
		Interfaccia.setData("\n");
		System.out.println();
	}
	

	public void printExit(List<String> e) {
		String data = null;
		System.out.print("Uscita-> ");
		Interfaccia.setData("Uscita-> ");
		for(String config:e){
			data = "";
			System.out.print(config+"	");
			System.out.println(recognizeExit(config));
			data = config + "	" + recognizeExit(config) + "\n";
			Interfaccia.setData(data);
		}
		Interfaccia.setData("\n");
		System.out.println();
	}
	

	private String recognizeExit(String config) {
		if(config.charAt(0)=='G')
			return recognizeComm(config);
		else
			return recognizeConfig(config);
	}

	private String recognizeConfig(String c) {
		switch(c) {
			case "G90":
				mode = false;
				return "Selezionate coordinate assolute";
			case "G91":
				mode = true;
				return "Selezionate coordinate relative";
			case "M00":
				return "M00";
			case "M03":
				return "Avvio rotazione oraria del mandrino";
			case "M04":
				return "Avvio rotazione antioraria del mandrino";
			case "M05":
				return "Arresto del mandrino";
			case "M06":
				return "Cambio utensile";
			case "M08":
				return "Attiva lubrificante";
			case "M09":
				return "Disattiva lubrificante";
			case "M10":
				return "M10";
			case "M11":
				return "M11";
			case "M30":
				return "Fine del programma";
			case "M60":
				return "M60";
			case "M72":
				return "M72";
			case "G94":
				return "Velocità movimento in [mm/min]";
			case "G95":
				return "Velocità movimento in [mm/giro]";
			case "G96":
				return "Velocità rotazione o taglio in [m/min]";
			case "G97":
				return "Velocità rotazione o taglio in [giri/min]";
			
		}
		if(c.charAt(0)=='T')
			return recognizeCNC(c);
		if(c.charAt(0)=='F')
			return recognizeF(c);
		if(c.charAt(0)=='S')
			return recognizeS(c);
		return "error";
	}
	
	private String recognizeF(String c) {
		return "Velocità di movimento impostata a "+c.substring(1);
	}
	
	private String recognizeS(String c) {
		return "Velocità di rotazione o taglio impostata a "+c.substring(1);
	}


	private String recognizeCNC(String c) {
		String temp =c.substring(1);
		int numMachine = Integer.parseInt(temp.substring(0, temp.length()/2));
		int numUtensil = Integer.parseInt(temp.substring(temp.length()/2, temp.length()));
		return "selezionata Macchina "+String.valueOf(numMachine)+" con utensile Numero "+String.valueOf(numUtensil);
	}
	
	private String recognizeComm(String com) {
		StringBuilder res=new StringBuilder();
		String[] prop = com.split(";");
		switch(prop[0]) {
			case "G00":
				res.append("	Movimento rapido ");
				res.append("a punto "+prop[1]+" "+prop[2]); break;
			case "G01":
				res.append("	Taglio Lineare "); 
				res.append("a punto "+prop[1]+" "+prop[2]); break;
			case "G02":
				res.append("Taglio circolare orario "); 
				res.append("a punto "+prop[1]+" "+prop[2]);
				res.append("di centro "+prop[3]+" "+prop[4]);
				break;
			case "G03":
				res.append("Taglio circolare antiorario "); 
				res.append("a punto "+prop[1]+" "+prop[2]);
				res.append(" di centro "+prop[3]+" "+prop[4]);
				break;
		}
		
		return res.toString();
	}


}


