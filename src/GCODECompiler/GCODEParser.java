// $ANTLR 3.5.1 C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g 2022-10-18 23:28:35

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
		"GCODESS", "HEX_DIGIT", "ICOORD", "INT", "JCOORD", "LB", "LP", "MCODES", 
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
	public static final int INT=24;
	public static final int JCOORD=25;
	public static final int LB=26;
	public static final int LP=27;
	public static final int MCODES=28;
	public static final int MUL=29;
	public static final int OCTAL_ESC=30;
	public static final int PACKAGE=31;
	public static final int RB=32;
	public static final int RP=33;
	public static final int SC=34;
	public static final int SCAN_ERROR=35;
	public static final int SCODES=36;
	public static final int STRING=37;
	public static final int SUB=38;
	public static final int TCODES=39;
	public static final int UNICODE_ESC=40;
	public static final int WS=41;
	public static final int XCOORD=42;
	public static final int YCOORD=43;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g"; }


			GCODEHandler h;

		  public GCODEParser(BufferedReader fileIn) throws IOException {			
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




	// $ANTLR start "gCode"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:71:1: gCode : (c= config mov= gCommAll e= exit ) ;
	public final void gCode() throws RecognitionException {
		List<String> c =null;
		List<String> mov =null;
		List<String> e =null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:2: ( (c= config mov= gCommAll e= exit ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:4: (c= config mov= gCommAll e= exit )
			{
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:4: (c= config mov= gCommAll e= exit )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:5: c= config mov= gCommAll e= exit
			{
			pushFollow(FOLLOW_config_in_gCode58);
			c=config();
			state._fsp--;

			h.printConfig(c);
			pushFollow(FOLLOW_gCommAll_in_gCode66);
			mov=gCommAll();
			state._fsp--;

			h.printCommand(mov);
			pushFollow(FOLLOW_exit_in_gCode74);
			e=exit();
			state._fsp--;

			h.printExit(e);
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
	// $ANTLR end "gCode"



	// $ANTLR start "exit"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:78:1: exit returns [List<String> list] : mv= gCommCoordFast a= mConfig ;
	public final List<String> exit() throws RecognitionException {
		List<String> list = null;


		String mv =null;
		List<String> a =null;

		 list = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:80:2: (mv= gCommCoordFast a= mConfig )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:80:4: mv= gCommCoordFast a= mConfig
			{
			pushFollow(FOLLOW_gCommCoordFast_in_exit105);
			mv=gCommCoordFast();
			state._fsp--;

			h.addMovement (list, mv);
			pushFollow(FOLLOW_mConfig_in_exit114);
			a=mConfig();
			state._fsp--;

			h.addListToStringList(list,a);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "exit"



	// $ANTLR start "config"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:84:1: config returns [List<String> list] : a= GCODESCOORD b= TCODES c= MCODES (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )? d= mConfig ;
	public final List<String> config() throws RecognitionException {
		List<String> list = null;


		Token a=null;
		Token b=null;
		Token c=null;
		Token a1=null;
		Token b1=null;
		Token c1=null;
		Token d1=null;
		List<String> d =null;

		 list = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:86:2: (a= GCODESCOORD b= TCODES c= MCODES (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )? d= mConfig )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:86:4: a= GCODESCOORD b= TCODES c= MCODES (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )? d= mConfig
			{
			a=(Token)match(input,GCODESCOORD,FOLLOW_GCODESCOORD_in_config140); 
			h.addTokenToStringList(list,a);
			b=(Token)match(input,TCODES,FOLLOW_TCODES_in_config148); 
			h.addTokenToStringList(list,b);
			c=(Token)match(input,MCODES,FOLLOW_MCODES_in_config157); 
			h.addTokenToStringList(list,c);
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:89:3: (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==GCODESF) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:89:5: a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES
					{
					a1=(Token)match(input,GCODESF,FOLLOW_GCODESF_in_config168); 
					h.addTokenToStringList(list,a1);
					b1=(Token)match(input,GCODESS,FOLLOW_GCODESS_in_config177); 
					h.addTokenToStringList(list,b1);
					c1=(Token)match(input,FCODES,FOLLOW_FCODES_in_config186); 
					h.addTokenToStringList(list,c1);
					d1=(Token)match(input,SCODES,FOLLOW_SCODES_in_config195); 
					h.addTokenToStringList(list,d1);
					}
					break;

			}

			pushFollow(FOLLOW_mConfig_in_config209);
			d=mConfig();
			state._fsp--;

			h.addListToStringList(list,d);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "config"



	// $ANTLR start "mConfig"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:98:1: mConfig returns [List<String> list] : (a= MCODES )* ;
	public final List<String> mConfig() throws RecognitionException {
		List<String> list = null;


		Token a=null;

		 list = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:2: ( (a= MCODES )* )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:4: (a= MCODES )*
			{
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:4: (a= MCODES )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MCODES) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:6: a= MCODES
					{
					a=(Token)match(input,MCODES,FOLLOW_MCODES_in_mConfig238); 
					h.addTokenToStringList(list,a);
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
		return list;
	}
	// $ANTLR end "mConfig"



	// $ANTLR start "gCommAll"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:105:1: gCommAll returns [List<String> listMove] : mv= gCommCoordFast (mw= gCommCoordNoInt |mx= gCommCoordInt )+ ;
	public final List<String> gCommAll() throws RecognitionException {
		List<String> listMove = null;


		String mv =null;
		String mw =null;
		String mx =null;

		 listMove = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:2: (mv= gCommCoordFast (mw= gCommCoordNoInt |mx= gCommCoordInt )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:4: mv= gCommCoordFast (mw= gCommCoordNoInt |mx= gCommCoordInt )+
			{
			pushFollow(FOLLOW_gCommCoordFast_in_gCommAll270);
			mv=gCommCoordFast();
			state._fsp--;

			h.addMovement (listMove, mv);
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:108:3: (mw= gCommCoordNoInt |mx= gCommCoordInt )+
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
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:108:5: mw= gCommCoordNoInt
					{
					pushFollow(FOLLOW_gCommCoordNoInt_in_gCommAll281);
					mw=gCommCoordNoInt();
					state._fsp--;

					h.addMovement (listMove, mw);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:109:5: mx= gCommCoordInt
					{
					pushFollow(FOLLOW_gCommCoordInt_in_gCommAll291);
					mx=gCommCoordInt();
					state._fsp--;

					h.addMovement (listMove, mx);
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
	// $ANTLR end "gCommAll"



	// $ANTLR start "gCommCoordFast"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:114:1: gCommCoordFast returns [String mv] : g= GCODESFAST (x= XCOORD y= YCOORD ) ;
	public final String gCommCoordFast() throws RecognitionException {
		String mv = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:115:2: (g= GCODESFAST (x= XCOORD y= YCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:115:4: g= GCODESFAST (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESFAST,FOLLOW_GCODESFAST_in_gCommCoordFast320); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:115:17: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:115:18: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gCommCoordFast325); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gCommCoordFast329); 
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
	// $ANTLR end "gCommCoordFast"



	// $ANTLR start "gCommCoordNoInt"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:119:1: gCommCoordNoInt returns [String mw] : g= GCODESINT (x= XCOORD y= YCOORD ) ;
	public final String gCommCoordNoInt() throws RecognitionException {
		String mw = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:120:2: (g= GCODESINT (x= XCOORD y= YCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:120:4: g= GCODESINT (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESINT,FOLLOW_GCODESINT_in_gCommCoordNoInt350); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:120:16: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:120:17: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gCommCoordNoInt355); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gCommCoordNoInt359); 
			}

			mw = h.createMovement (g, x, y);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mw;
	}
	// $ANTLR end "gCommCoordNoInt"



	// $ANTLR start "gCommCoordInt"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:123:1: gCommCoordInt returns [String mx] : g= GCODESINTCIRC (x= XCOORD y= YCOORD ) (i= ICOORD j= JCOORD ) ;
	public final String gCommCoordInt() throws RecognitionException {
		String mx = null;


		Token g=null;
		Token x=null;
		Token y=null;
		Token i=null;
		Token j=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:124:2: (g= GCODESINTCIRC (x= XCOORD y= YCOORD ) (i= ICOORD j= JCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:124:4: g= GCODESINTCIRC (x= XCOORD y= YCOORD ) (i= ICOORD j= JCOORD )
			{
			g=(Token)match(input,GCODESINTCIRC,FOLLOW_GCODESINTCIRC_in_gCommCoordInt380); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:124:20: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:124:21: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gCommCoordInt385); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gCommCoordInt389); 
			}

			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:124:40: (i= ICOORD j= JCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:124:41: i= ICOORD j= JCOORD
			{
			i=(Token)match(input,ICOORD,FOLLOW_ICOORD_in_gCommCoordInt395); 
			j=(Token)match(input,JCOORD,FOLLOW_JCOORD_in_gCommCoordInt399); 
			}

			mx = h.createMovement(g,x,y,i,j);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mx;
	}
	// $ANTLR end "gCommCoordInt"

	// Delegated rules



	public static final BitSet FOLLOW_config_in_gCode58 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_gCommAll_in_gCode66 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_exit_in_gCode74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gCommCoordFast_in_exit105 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_mConfig_in_exit114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESCOORD_in_config140 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TCODES_in_config148 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_MCODES_in_config157 = new BitSet(new long[]{0x0000000010020000L});
	public static final BitSet FOLLOW_GCODESF_in_config168 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_GCODESS_in_config177 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FCODES_in_config186 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SCODES_in_config195 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_mConfig_in_config209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MCODES_in_mConfig238 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_gCommCoordFast_in_gCommAll270 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_gCommCoordNoInt_in_gCommAll281 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gCommCoordInt_in_gCommAll291 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_GCODESFAST_in_gCommCoordFast320 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gCommCoordFast325 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gCommCoordFast329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINT_in_gCommCoordNoInt350 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gCommCoordNoInt355 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gCommCoordNoInt359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINTCIRC_in_gCommCoordInt380 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gCommCoordInt385 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gCommCoordInt389 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ICOORD_in_gCommCoordInt395 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JCOORD_in_gCommCoordInt399 = new BitSet(new long[]{0x0000000000000002L});
}
