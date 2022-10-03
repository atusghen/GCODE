// $ANTLR 3.5.1 C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g 2022-10-03 15:55:18

	package GCODECompiler;
	import GCODECompiler.GCODEHandler;
	import java.io.IOException;
	import java.io.StringReader;
	import java.io.FileReader;
	import java.io.BufferedReader;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GCODEParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "CHAR", "COMMA", "COMMENT", 
		"DIV", "DOT", "EQ", "ESC_SEQ", "EXPONENT", "FCODES", "FLOAT", "GCODESCOMP", 
		"GCODESCOORD", "GCODESF", "GCODESFAST", "GCODESINT", "GCODESINTCIRC", 
		"GCODESS", "HEX_DIGIT", "ICOORD", "ID", "INT", "JCOORD", "LB", "LP", "MCODES", 
		"MUL", "OCTAL_ESC", "PACKAGE", "RB", "RP", "SC", "SCAN_ERROR", "SCODES", 
		"STRING", "SUB", "TCODES", "UNICODE_ESC", "WS", "XCOORD", "YCOORD", "ZCOORD"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int CHAR=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIV=8;
	public static final int DOT=9;
	public static final int EQ=10;
	public static final int ESC_SEQ=11;
	public static final int EXPONENT=12;
	public static final int FCODES=13;
	public static final int FLOAT=14;
	public static final int GCODESCOMP=15;
	public static final int GCODESCOORD=16;
	public static final int GCODESF=17;
	public static final int GCODESFAST=18;
	public static final int GCODESINT=19;
	public static final int GCODESINTCIRC=20;
	public static final int GCODESS=21;
	public static final int HEX_DIGIT=22;
	public static final int ICOORD=23;
	public static final int ID=24;
	public static final int INT=25;
	public static final int JCOORD=26;
	public static final int LB=27;
	public static final int LP=28;
	public static final int MCODES=29;
	public static final int MUL=30;
	public static final int OCTAL_ESC=31;
	public static final int PACKAGE=32;
	public static final int RB=33;
	public static final int RP=34;
	public static final int SC=35;
	public static final int SCAN_ERROR=36;
	public static final int SCODES=37;
	public static final int STRING=38;
	public static final int SUB=39;
	public static final int TCODES=40;
	public static final int UNICODE_ESC=41;
	public static final int WS=42;
	public static final int XCOORD=43;
	public static final int YCOORD=44;
	public static final int ZCOORD=45;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GCODEParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GCODEParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GCODEParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g"; }


			GCODEHandler h;

		  //public SimpleID3Parser(FileReader fileIn) throws IOException {
		  public GCODEParser(FileReader fileIn) throws IOException {			
				this(new CommonTokenStream(
								new GCODELexer(
										new ANTLRReaderStream(fileIn))));
				h = new GCODEHandler (input);
			}
		  public GCODEParser(String docIn) throws IOException {		
				this(new CommonTokenStream(
								new GCODELexer(
									new ANTLRReaderStream(
												new StringReader (docIn))))); 
				h = new GCODEHandler (input);
			}

	  public GCODEHandler getHandler() {
	    return h;
	  }
	  
	  public List<String> getErrorList () {
	    return h.getErrorList();
	  }

	  public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			h.handleError(tokenNames, e, hdr, msg);
	  }




	// $ANTLR start "gcode"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:72:1: gcode : config gcommall exit ;
	public final void gcode() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:73:2: ( config gcommall exit )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:73:4: config gcommall exit
			{
			pushFollow(FOLLOW_config_in_gcode55);
			config();
			state._fsp--;

			pushFollow(FOLLOW_gcommall_in_gcode57);
			gcommall();
			state._fsp--;

			pushFollow(FOLLOW_exit_in_gcode59);
			exit();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcode"



	// $ANTLR start "config"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:76:1: config : GCODESCOORD TCODES MCODES ( GCODESF GCODESS FCODES SCODES )? ( MCODES )* ;
	public final void config() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:77:2: ( GCODESCOORD TCODES MCODES ( GCODESF GCODESS FCODES SCODES )? ( MCODES )* )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:77:4: GCODESCOORD TCODES MCODES ( GCODESF GCODESS FCODES SCODES )? ( MCODES )*
			{
			match(input,GCODESCOORD,FOLLOW_GCODESCOORD_in_config71); 
			match(input,TCODES,FOLLOW_TCODES_in_config73); 
			match(input,MCODES,FOLLOW_MCODES_in_config75); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:77:30: ( GCODESF GCODESS FCODES SCODES )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==GCODESF) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:77:31: GCODESF GCODESS FCODES SCODES
					{
					match(input,GCODESF,FOLLOW_GCODESF_in_config78); 
					match(input,GCODESS,FOLLOW_GCODESS_in_config80); 
					match(input,FCODES,FOLLOW_FCODES_in_config82); 
					match(input,SCODES,FOLLOW_SCODES_in_config84); 
					}
					break;

			}

			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:77:63: ( MCODES )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MCODES) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:77:63: MCODES
					{
					match(input,MCODES,FOLLOW_MCODES_in_config88); 
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "config"



	// $ANTLR start "gcommall"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:80:1: gcommall : gcommcoordfast ( gcommcoordnoint | gcommcoordint )+ ;
	public final void gcommall() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:81:2: ( gcommcoordfast ( gcommcoordnoint | gcommcoordint )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:81:4: gcommcoordfast ( gcommcoordnoint | gcommcoordint )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_gcommall100);
			gcommcoordfast();
			state._fsp--;

			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:81:19: ( gcommcoordnoint | gcommcoordint )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==GCODESINT) ) {
					alt3=1;
				}
				else if ( (LA3_0==GCODESINTCIRC) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:81:20: gcommcoordnoint
					{
					pushFollow(FOLLOW_gcommcoordnoint_in_gcommall103);
					gcommcoordnoint();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:81:38: gcommcoordint
					{
					pushFollow(FOLLOW_gcommcoordint_in_gcommall107);
					gcommcoordint();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcommall"



	// $ANTLR start "exit"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:84:1: exit : gcommcoordfast ( MCODES )+ ;
	public final void exit() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:85:2: ( gcommcoordfast ( MCODES )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:85:4: gcommcoordfast ( MCODES )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_exit121);
			gcommcoordfast();
			state._fsp--;

			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:85:19: ( MCODES )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==MCODES) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:85:19: MCODES
					{
					match(input,MCODES,FOLLOW_MCODES_in_exit123); 
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exit"



	// $ANTLR start "gcommcoordfast"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:88:1: gcommcoordfast : GCODESFAST ( XCOORD YCOORD ( ZCOORD )? ) ;
	public final void gcommcoordfast() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:89:2: ( GCODESFAST ( XCOORD YCOORD ( ZCOORD )? ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:89:4: GCODESFAST ( XCOORD YCOORD ( ZCOORD )? )
			{
			match(input,GCODESFAST,FOLLOW_GCODESFAST_in_gcommcoordfast136); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:89:15: ( XCOORD YCOORD ( ZCOORD )? )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:89:16: XCOORD YCOORD ( ZCOORD )?
			{
			match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordfast139); 
			match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordfast141); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:89:30: ( ZCOORD )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ZCOORD) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:89:30: ZCOORD
					{
					match(input,ZCOORD,FOLLOW_ZCOORD_in_gcommcoordfast143); 
					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcommcoordfast"



	// $ANTLR start "gcommcoordnoint"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:92:1: gcommcoordnoint : GCODESINT ( XCOORD YCOORD ( ZCOORD )? ) ;
	public final void gcommcoordnoint() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:93:2: ( GCODESINT ( XCOORD YCOORD ( ZCOORD )? ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:93:4: GCODESINT ( XCOORD YCOORD ( ZCOORD )? )
			{
			match(input,GCODESINT,FOLLOW_GCODESINT_in_gcommcoordnoint156); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:93:14: ( XCOORD YCOORD ( ZCOORD )? )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:93:15: XCOORD YCOORD ( ZCOORD )?
			{
			match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordnoint159); 
			match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordnoint161); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:93:29: ( ZCOORD )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ZCOORD) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:93:29: ZCOORD
					{
					match(input,ZCOORD,FOLLOW_ZCOORD_in_gcommcoordnoint163); 
					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcommcoordnoint"



	// $ANTLR start "gcommcoordint"
	// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:96:1: gcommcoordint : GCODESINTCIRC ( XCOORD YCOORD ( ZCOORD )? ) ( ICOORD JCOORD ) ;
	public final void gcommcoordint() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:2: ( GCODESINTCIRC ( XCOORD YCOORD ( ZCOORD )? ) ( ICOORD JCOORD ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:4: GCODESINTCIRC ( XCOORD YCOORD ( ZCOORD )? ) ( ICOORD JCOORD )
			{
			match(input,GCODESINTCIRC,FOLLOW_GCODESINTCIRC_in_gcommcoordint177); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:18: ( XCOORD YCOORD ( ZCOORD )? )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:19: XCOORD YCOORD ( ZCOORD )?
			{
			match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordint180); 
			match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordint182); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:33: ( ZCOORD )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ZCOORD) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:33: ZCOORD
					{
					match(input,ZCOORD,FOLLOW_ZCOORD_in_gcommcoordint184); 
					}
					break;

			}

			}

			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:42: ( ICOORD JCOORD )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:97:43: ICOORD JCOORD
			{
			match(input,ICOORD,FOLLOW_ICOORD_in_gcommcoordint189); 
			match(input,JCOORD,FOLLOW_JCOORD_in_gcommcoordint191); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gcommcoordint"

	// Delegated rules



	public static final BitSet FOLLOW_config_in_gcode55 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_gcommall_in_gcode57 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_exit_in_gcode59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESCOORD_in_config71 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_TCODES_in_config73 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_MCODES_in_config75 = new BitSet(new long[]{0x0000000020020002L});
	public static final BitSet FOLLOW_GCODESF_in_config78 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_GCODESS_in_config80 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FCODES_in_config82 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SCODES_in_config84 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_MCODES_in_config88 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_gcommall100 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_gcommcoordnoint_in_gcommall103 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gcommcoordint_in_gcommall107 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_exit121 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_MCODES_in_exit123 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_GCODESFAST_in_gcommcoordfast136 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordfast139 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordfast141 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ZCOORD_in_gcommcoordfast143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINT_in_gcommcoordnoint156 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordnoint159 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordnoint161 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_ZCOORD_in_gcommcoordnoint163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINTCIRC_in_gcommcoordint177 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordint180 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordint182 = new BitSet(new long[]{0x0000200000800000L});
	public static final BitSet FOLLOW_ZCOORD_in_gcommcoordint184 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ICOORD_in_gcommcoordint189 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_JCOORD_in_gcommcoordint191 = new BitSet(new long[]{0x0000000000000002L});
}
