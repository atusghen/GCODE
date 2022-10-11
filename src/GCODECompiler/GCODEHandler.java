package GCODECompiler;

import myPackage.Graphic;



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
	public static final int ALL_SLOT_LENGTH= 11;
	public static final int TITLE_LENGTH= 12;
	public static final int ARTIST_LENGTH= 13;
	public static final int ALBUM_LENGTH= 14;
	public static final int YEAR_LENGTH= 15;
	public static final int COMMENT_LENGTH= 16;
	//serve per lo stampa slot nel caso leggiamo la grammatica senza header
	public int conta = 0;

	List<String> errorList;
	TokenStream lexerStream;

	public GCODEHandler (TokenStream ls) {
		System.out.println ("Handler Inizializzato");
		errorList = new ArrayList<String>();
		lexerStream = ls;
	}

	public List<String> getErrorList() {
		return errorList;
	}
	
	// h contiene le coordinate, m il messaggio d'errore standard
	void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		String type = "";
		String st;
		if (e.token.getType() >=0)
			type = tokenNames[e.token.getType()]; 
		if (e.token.getType() == GCODELexer.SCAN_ERROR)
			st = "Lexical Error " + TOKEN_ERROR + " at ";
		else
			st = "Syntax Error " + ERR_ON_SYNTAX + " at ";
		st +=	"[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine()+1) + "]: " + 
				"Found ";
		st += type;
		

		if (e instanceof MissingTokenException)
		   st = st + m;		
		else /*if(e.token.getType() == MISSING_CHAR)*/
			st += " ('" + e.token.getText() + "')" + m;
		errorList.add(st); 
	}

	// Gestione errori semantici
	void myErrorHandler(int code, Token tk) {
		String st;
		if (code == TOKEN_ERROR)
			st = "Lexical Error " + code;
		else if (code < LAST_SYNTAX_ERROR)  //è 10
			st = "Syntax Error " + code;
		else
			st = "Errore semantico " + code; 
		
		//output in base al'errore semantico
		switch(code)
		{
			case 11: st=st+" (Data length error)"; break;
			case 12: st=st+" (TITLE length > 30 char)"; break;
			case 13: st=st+" (TITLE length < 30 char)"; break;
			case 14: st=st+" (ARTIST length > 30 char)"; break;
			case 15: st=st+" (ARTIST length < 30 char)"; break;
			case 16: st=st+" (ALBUM length > 30 char)"; break;
			case 17: st=st+" (ALBUM length < 30 char)"; break;
			case 18: st=st+" (YEAR number of digits > 4)"; break;
			case 19: st=st+" (YEAR number of digits < 4)"; break;
			case 20: st=st+" (Wrong YEAR format 1900-CURRENT YEAR)"; break;
			case 21: st=st+" (COMMENT length > 30 char)"; break;
			case 22: st=st+" (COMMENT length < 30 char)"; break;
		}
		
		
		if (tk != null)
			st += " avvenuto qui: "+tk.getText()+" @"+tk.getTokenIndex()+" [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		st += ". ";

		if (code == TOKEN_ERROR)
			st += "Unrecognized token '" + tk.getText() + "'";
							
		errorList.add(st); 
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
			System.out.println("madonna merda:" + g.getText() + ";" + x.getText() + ";" + y.getText() +";"+i.getText()+";"+j.getText());
			return g.getText() + ";" + x.getText() + ";" + y.getText() +";"+i.getText()+";"+j.getText();
		}
		return null;
	}


	public void addExit (List<String> list, String pd) {
		//System.out.println("Movimento-> "+pd);
		list.add(pd);
	}
	
	public void addMovement (List<String> list, String pd) {
		//System.out.println("Movimento-> "+pd);
		list.add(pd);
	}
	
	public void addMCode(List<String> list, Token temp) {
		//System.out.println("MConfig-> "+temp.getText());
		list.add(temp.getText());
	}
	
	public void printConfig(List<String> c)
	{
		System.out.println("Configurazione-> ");
		for(String config:c){
			System.out.print(config+"	");
			System.out.println(recognizeConfig(config));
		}
		System.out.println();
	}
	

	public void printCommand(List<String> listcom) {
		for(String com:listcom){
			System.out.print("Movimento-> "+com+"	");
			System.out.println(recognizeComm(com));
			Graphic.Graphic(listcom);
		}
		System.out.println();
	}
	

	public void printExit(List<String> e) {
		System.out.print("Uscita-> ");
		for(String config:e){
			System.out.print(config+"	");
			System.out.println(recognizeExit(config));
		}
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
				return "Selezionate coordinate assolute";
			case "G91":
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
				res.append("Taglio circolare antiorario "); 
				res.append("a punto "+prop[1]+" "+prop[2]);
				res.append("di centro "+prop[3]+" "+prop[4]);
				break;
			case "G03":
				res.append("Taglio circolare orario "); 
				res.append("a punto "+prop[1]+" "+prop[2]);
				res.append(" di centro "+prop[3]+" "+prop[4]);
				break;
		}
		
		return res.toString();
	}


}


