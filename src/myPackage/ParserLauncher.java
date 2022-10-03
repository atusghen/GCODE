package myPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import GCODECompiler.GCODEParser;

public class ParserLauncher {
	public static void main (String[] args) throws FileNotFoundException, IOException, RecognitionException {		
	  	String fileName = ".\\resources\\input.file";

		System.out.println ("Parsing con ANTLR");
		
		FileReader fileIn = new FileReader (fileName);
		GCODEParser parser = new GCODEParser(fileIn);
		parser.gcode();
		
		//**
		if (parser.getErrorList().size() == 0)
			System.out.println ("Parsing completato con successo");
		else {
			int i=0;
			System.out.println ("Errori rilevati");
			for (String msg : parser.getErrorList())
				System.out.println (++i + " - " + msg);
		}
		
		//Interfaccia a=new Interfaccia();
		
	}
}