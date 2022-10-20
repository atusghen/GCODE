package myPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.RecognitionException;

import GCODECompiler.GCODEHandler;
import GCODECompiler.GCODEParser;

public class ParserLauncher {
	
	private static GCODEParser parser;
	
	public static GCODEParser getParser()
	{
		return parser;
	}
	
	public static InputStreamReader setReaderNoSearch(Interfaccia a) throws FileNotFoundException, IOException
	{
		InputStreamReader fileIn = new InputStreamReader(new FileInputStream(a.fileChooser()));
		return fileIn;
	}
	
	public static void avvio(Interfaccia a) throws FileNotFoundException, IOException, RecognitionException {
		
			parser= new GCODEParser(new BufferedReader(setReaderNoSearch(a)));
			System.out.println ("Parsing con ANTLR");
			parser.gCode();
			if (parser.getErrorList().size() == 0)
				System.out.println ("Parsing completato con successo");
			else {
				int i=0;
				System.out.println ("Errori rilevati");
				for (String msg : parser.getErrorList())
					System.out.println (++i + " - " + msg);
				
				/*int j = 0;
				for(String d:GCODEHandler.getErrorList()) {
					System.out.println(++j + d);
					//Interfaccia.setData(d + "\n");
		        }*/
//questo dovrebbe andare alla fine del disegno visto che il programma genera i warning durante la pittura
//perchè qui stampa solo gli errori al momento della fine del parsing
				//parser.getErrorList().forEach(error -> {
				/*GCODEHandler.getErrorList().forEach(error -> {
					int j=0;
					System.out.println (++j + " strano " + error);
					Interfaccia.setData("\n"+ ++j + " - "+error.toString());
					});
				
				}*/
				
				int j = 0;
				Interfaccia.setData("Lista di errori e warning rilevati:\n");
				for(String s:GCODEHandler.getErrorList()) {
					Interfaccia.setData(s + "\n\n");
				}
			}
	}
	
	public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException {		
	
		Interfaccia a=new Interfaccia();
		
	}
}