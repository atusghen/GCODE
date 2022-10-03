// $ANTLR 3.5.1 C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g 2022-10-03 16:57:29

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
		"STRING", "SUB", "TCODES", "UNICODE_ESC", "WS", "XCOORD", "YCOORD"
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
	@Override public String getGrammarFileName() { return "C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g"; }


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
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:1: gcode returns [List<String> p] : config x= gcommall exit ;
	public final List<String> gcode() throws RecognitionException {
		List<String> p = null;


		List<String> x =null;

		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:73:2: ( config x= gcommall exit )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:73:4: config x= gcommall exit
			{
			pushFollow(FOLLOW_config_in_gcode58);
			config();
			state._fsp--;

			pushFollow(FOLLOW_gcommall_in_gcode62);
			x=gcommall();
			state._fsp--;

			p=x;
			pushFollow(FOLLOW_exit_in_gcode65);
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
		return p;
	}
	// $ANTLR end "gcode"



	// $ANTLR start "config"
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:76:1: config : GCODESCOORD TCODES MCODES ( GCODESF GCODESS FCODES SCODES )? ( MCODES )* ;
	public final void config() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:2: ( GCODESCOORD TCODES MCODES ( GCODESF GCODESS FCODES SCODES )? ( MCODES )* )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:4: GCODESCOORD TCODES MCODES ( GCODESF GCODESS FCODES SCODES )? ( MCODES )*
			{
			match(input,GCODESCOORD,FOLLOW_GCODESCOORD_in_config77); 
			match(input,TCODES,FOLLOW_TCODES_in_config79); 
			match(input,MCODES,FOLLOW_MCODES_in_config81); 
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:30: ( GCODESF GCODESS FCODES SCODES )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==GCODESF) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:31: GCODESF GCODESS FCODES SCODES
					{
					match(input,GCODESF,FOLLOW_GCODESF_in_config84); 
					match(input,GCODESS,FOLLOW_GCODESS_in_config86); 
					match(input,FCODES,FOLLOW_FCODES_in_config88); 
					match(input,SCODES,FOLLOW_SCODES_in_config90); 
					}
					break;

			}

			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:63: ( MCODES )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MCODES) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:63: MCODES
					{
					match(input,MCODES,FOLLOW_MCODES_in_config94); 
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
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:80:1: gcommall returns [List<String> listMove] : mv= gcommcoordfast ( gcommcoordnoint | gcommcoordint )+ ;
	public final List<String> gcommall() throws RecognitionException {
		List<String> listMove = null;


		String mv =null;

		 listMove = new ArrayList<String>();
		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:82:2: (mv= gcommcoordfast ( gcommcoordnoint | gcommcoordint )+ )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:82:4: mv= gcommcoordfast ( gcommcoordnoint | gcommcoordint )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_gcommall117);
			mv=gcommcoordfast();
			state._fsp--;

			h.addMovement (listMove, mv);
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:83:3: ( gcommcoordnoint | gcommcoordint )+
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
					// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:83:4: gcommcoordnoint
					{
					pushFollow(FOLLOW_gcommcoordnoint_in_gcommall124);
					gcommcoordnoint();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:84:5: gcommcoordint
					{
					pushFollow(FOLLOW_gcommcoordint_in_gcommall131);
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
		return listMove;
	}
	// $ANTLR end "gcommall"



	// $ANTLR start "exit"
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:87:1: exit : gcommcoordfast ( MCODES )+ ;
	public final void exit() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:88:2: ( gcommcoordfast ( MCODES )+ )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:88:4: gcommcoordfast ( MCODES )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_exit145);
			gcommcoordfast();
			state._fsp--;

			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:88:19: ( MCODES )+
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
					// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:88:19: MCODES
					{
					match(input,MCODES,FOLLOW_MCODES_in_exit147); 
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
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:91:1: gcommcoordfast returns [String mv] : g= GCODESFAST (x= XCOORD y= YCOORD ) ;
	public final String gcommcoordfast() throws RecognitionException {
		String mv = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:92:2: (g= GCODESFAST (x= XCOORD y= YCOORD ) )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:92:4: g= GCODESFAST (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESFAST,FOLLOW_GCODESFAST_in_gcommcoordfast166); 
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:92:17: (x= XCOORD y= YCOORD )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:92:18: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordfast171); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordfast175); 
			}

			mv = h.createMovement (g, x, y);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mv;
	}
	// $ANTLR end "gcommcoordfast"



	// $ANTLR start "gcommcoordnoint"
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:95:1: gcommcoordnoint : GCODESINT ( XCOORD YCOORD ) ;
	public final void gcommcoordnoint() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:96:2: ( GCODESINT ( XCOORD YCOORD ) )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:96:4: GCODESINT ( XCOORD YCOORD )
			{
			match(input,GCODESINT,FOLLOW_GCODESINT_in_gcommcoordnoint189); 
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:96:14: ( XCOORD YCOORD )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:96:15: XCOORD YCOORD
			{
			match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordnoint192); 
			match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordnoint194); 
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
	// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:99:1: gcommcoordint : GCODESINTCIRC ( XCOORD YCOORD ) ( ICOORD JCOORD ) ;
	public final void gcommcoordint() throws RecognitionException {
		try {
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:2: ( GCODESINTCIRC ( XCOORD YCOORD ) ( ICOORD JCOORD ) )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:4: GCODESINTCIRC ( XCOORD YCOORD ) ( ICOORD JCOORD )
			{
			match(input,GCODESINTCIRC,FOLLOW_GCODESINTCIRC_in_gcommcoordint207); 
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:18: ( XCOORD YCOORD )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:19: XCOORD YCOORD
			{
			match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordint210); 
			match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordint212); 
			}

			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:34: ( ICOORD JCOORD )
			// C:\\Users\\fabio\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:35: ICOORD JCOORD
			{
			match(input,ICOORD,FOLLOW_ICOORD_in_gcommcoordint216); 
			match(input,JCOORD,FOLLOW_JCOORD_in_gcommcoordint218); 
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



	public static final BitSet FOLLOW_config_in_gcode58 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_gcommall_in_gcode62 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_exit_in_gcode65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESCOORD_in_config77 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_TCODES_in_config79 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_MCODES_in_config81 = new BitSet(new long[]{0x0000000020020002L});
	public static final BitSet FOLLOW_GCODESF_in_config84 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_GCODESS_in_config86 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FCODES_in_config88 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SCODES_in_config90 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_MCODES_in_config94 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_gcommall117 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_gcommcoordnoint_in_gcommall124 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gcommcoordint_in_gcommall131 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_exit145 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_MCODES_in_exit147 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_GCODESFAST_in_gcommcoordfast166 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordfast171 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordfast175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINT_in_gcommcoordnoint189 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordnoint192 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordnoint194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINTCIRC_in_gcommcoordint207 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordint210 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordint212 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ICOORD_in_gcommcoordint216 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_JCOORD_in_gcommcoordint218 = new BitSet(new long[]{0x0000000000000002L});
}
