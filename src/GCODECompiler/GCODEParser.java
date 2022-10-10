// $ANTLR 3.5.1 C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g 2022-10-10 20:40:21

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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:1: gcode returns [List<String> p] : (c= config x= gcommall e= exit ) ;
	public final List<String> gcode() throws RecognitionException {
		List<String> p = null;


		List<Token> c =null;
		List<String> x =null;
		List<String> e =null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:2: ( (c= config x= gcommall e= exit ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:4: (c= config x= gcommall e= exit )
			{
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:4: (c= config x= gcommall e= exit )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:5: c= config x= gcommall e= exit
			{
			pushFollow(FOLLOW_config_in_gcode63);
			c=config();
			state._fsp--;

			pushFollow(FOLLOW_gcommall_in_gcode67);
			x=gcommall();
			state._fsp--;

			pushFollow(FOLLOW_exit_in_gcode71);
			e=exit();
			state._fsp--;

			}

			x=p; h.printConfig(c); h.printExit(e);
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



	// $ANTLR start "exit"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:1: exit returns [List<String> listMove] : mv= gcommcoordfast e= mconfig ;
	public final List<String> exit() throws RecognitionException {
		List<String> listMove = null;


		String mv =null;
		List<Token> e =null;

		 listMove = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:2: (mv= gcommcoordfast e= mconfig )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:4: mv= gcommcoordfast e= mconfig
			{
			pushFollow(FOLLOW_gcommcoordfast_in_exit97);
			mv=gcommcoordfast();
			state._fsp--;

			h.addExit (listMove, mv);
			pushFollow(FOLLOW_mconfig_in_exit109);
			e=mconfig();
			state._fsp--;

				if(e!=null){for(Token temp: e) {listMove.add(temp.getText());}}
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
	// $ANTLR end "exit"



	// $ANTLR start "config"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:84:1: config returns [List<Token> s] : a= GCODESCOORD b= TCODES c= MCODES (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )? e= mconfig ;
	public final List<Token> config() throws RecognitionException {
		List<Token> s = null;


		Token a=null;
		Token b=null;
		Token c=null;
		Token a1=null;
		Token b1=null;
		Token c1=null;
		Token d1=null;
		List<Token> e =null;

		 s = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:86:2: (a= GCODESCOORD b= TCODES c= MCODES (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )? e= mconfig )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:86:4: a= GCODESCOORD b= TCODES c= MCODES (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )? e= mconfig
			{
			a=(Token)match(input,GCODESCOORD,FOLLOW_GCODESCOORD_in_config133); 
			s.add(a);
			b=(Token)match(input,TCODES,FOLLOW_TCODES_in_config141); 
			s.add(b);
			c=(Token)match(input,MCODES,FOLLOW_MCODES_in_config150); 
			s.add(c);
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:90:3: (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==GCODESF) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:90:4: a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES
					{
					a1=(Token)match(input,GCODESF,FOLLOW_GCODESF_in_config163); 
					b1=(Token)match(input,GCODESS,FOLLOW_GCODESS_in_config167); 
					c1=(Token)match(input,FCODES,FOLLOW_FCODES_in_config171); 
					d1=(Token)match(input,SCODES,FOLLOW_SCODES_in_config175); 
					if(a1!=null && b1!=null && c1!=null && d1!=null) s.add(a1); s.add(b1); s.add(c1); s.add(d1);
					}
					break;

			}

			pushFollow(FOLLOW_mconfig_in_config185);
			e=mconfig();
			state._fsp--;

			   //if(d!=null){s.addAll(d);}  
				{if(e!=null){s.addAll(e);}} 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "config"



	// $ANTLR start "mconfig"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:97:1: mconfig returns [List<Token> list] : temp= ( MCODES )* ;
	public final List<Token> mconfig() throws RecognitionException {
		List<Token> list = null;


		Token temp=null;

		 list = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:99:2: (temp= ( MCODES )* )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:2: temp= ( MCODES )*
			{
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:7: ( MCODES )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MCODES) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:100:8: MCODES
					{
					temp=(Token)match(input,MCODES,FOLLOW_MCODES_in_mconfig214); 
					h.addMCode(list,temp);
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
	// $ANTLR end "mconfig"



	// $ANTLR start "otherconfig"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:104:1: otherconfig returns [List<Token> s] : a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES ;
	public final List<Token> otherconfig() throws RecognitionException {
		List<Token> s = null;


		Token a1=null;
		Token b1=null;
		Token c1=null;
		Token d1=null;

		 s = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:106:2: (a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:3: a1= GCODESF b1= GCODESS c1= FCODES d1= SCODES
			{
			a1=(Token)match(input,GCODESF,FOLLOW_GCODESF_in_otherconfig245); 
			b1=(Token)match(input,GCODESS,FOLLOW_GCODESS_in_otherconfig249); 
			c1=(Token)match(input,FCODES,FOLLOW_FCODES_in_otherconfig253); 
			d1=(Token)match(input,SCODES,FOLLOW_SCODES_in_otherconfig257); 
			s.add(a1); s.add(b1); s.add(c1); s.add(d1);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "otherconfig"



	// $ANTLR start "gcommall"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:112:1: gcommall returns [List<String> listMove] : mv= gcommcoordfast (mu= gcommcoordnoint |ma= gcommcoordint )+ ;
	public final List<String> gcommall() throws RecognitionException {
		List<String> listMove = null;


		String mv =null;
		String mu =null;
		String ma =null;

		 listMove = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:114:2: (mv= gcommcoordfast (mu= gcommcoordnoint |ma= gcommcoordint )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:114:4: mv= gcommcoordfast (mu= gcommcoordnoint |ma= gcommcoordint )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_gcommall283);
			mv=gcommcoordfast();
			state._fsp--;

			h.addMovement (listMove, mv);
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:115:3: (mu= gcommcoordnoint |ma= gcommcoordint )+
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
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:115:4: mu= gcommcoordnoint
					{
					pushFollow(FOLLOW_gcommcoordnoint_in_gcommall293);
					mu=gcommcoordnoint();
					state._fsp--;

					 h.addMovement (listMove, mu);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:116:5: ma= gcommcoordint
					{
					pushFollow(FOLLOW_gcommcoordint_in_gcommall303);
					ma=gcommcoordint();
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

			 h.addMovement (listMove, ma);
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



	// $ANTLR start "gcommcoordfast"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:120:1: gcommcoordfast returns [String mv] : g= GCODESFAST (x= XCOORD y= YCOORD ) ;
	public final String gcommcoordfast() throws RecognitionException {
		String mv = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:121:2: (g= GCODESFAST (x= XCOORD y= YCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:121:4: g= GCODESFAST (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESFAST,FOLLOW_GCODESFAST_in_gcommcoordfast328); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:121:17: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:121:18: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordfast333); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordfast337); 
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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:125:1: gcommcoordnoint returns [String mu] : g= GCODESINT (x= XCOORD y= YCOORD ) ;
	public final String gcommcoordnoint() throws RecognitionException {
		String mu = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:126:2: (g= GCODESINT (x= XCOORD y= YCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:126:4: g= GCODESINT (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESINT,FOLLOW_GCODESINT_in_gcommcoordnoint358); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:126:16: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:126:17: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordnoint363); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordnoint367); 
			}

			mu = h.createMovement (g, x, y);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mu;
	}
	// $ANTLR end "gcommcoordnoint"



	// $ANTLR start "gcommcoordint"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:129:1: gcommcoordint returns [String mz] : g= GCODESINTCIRC (x= XCOORD y= YCOORD ) (i= ICOORD j= JCOORD ) ;
	public final String gcommcoordint() throws RecognitionException {
		String mz = null;


		Token g=null;
		Token x=null;
		Token y=null;
		Token i=null;
		Token j=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:130:2: (g= GCODESINTCIRC (x= XCOORD y= YCOORD ) (i= ICOORD j= JCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:130:4: g= GCODESINTCIRC (x= XCOORD y= YCOORD ) (i= ICOORD j= JCOORD )
			{
			g=(Token)match(input,GCODESINTCIRC,FOLLOW_GCODESINTCIRC_in_gcommcoordint388); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:130:20: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:130:21: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordint393); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordint397); 
			}

			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:130:40: (i= ICOORD j= JCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:130:41: i= ICOORD j= JCOORD
			{
			i=(Token)match(input,ICOORD,FOLLOW_ICOORD_in_gcommcoordint403); 
			j=(Token)match(input,JCOORD,FOLLOW_JCOORD_in_gcommcoordint407); 
			}

			mz = h.createMovement(g,x,y,i,y);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mz;
	}
	// $ANTLR end "gcommcoordint"

	// Delegated rules



	public static final BitSet FOLLOW_config_in_gcode63 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_gcommall_in_gcode67 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_exit_in_gcode71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_exit97 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_mconfig_in_exit109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESCOORD_in_config133 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TCODES_in_config141 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_MCODES_in_config150 = new BitSet(new long[]{0x0000000010020000L});
	public static final BitSet FOLLOW_GCODESF_in_config163 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_GCODESS_in_config167 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FCODES_in_config171 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SCODES_in_config175 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_mconfig_in_config185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MCODES_in_mconfig214 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_GCODESF_in_otherconfig245 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_GCODESS_in_otherconfig249 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FCODES_in_otherconfig253 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SCODES_in_otherconfig257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_gcommall283 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_gcommcoordnoint_in_gcommall293 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gcommcoordint_in_gcommall303 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_GCODESFAST_in_gcommcoordfast328 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordfast333 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordfast337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINT_in_gcommcoordnoint358 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordnoint363 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordnoint367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINTCIRC_in_gcommcoordint388 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordint393 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordint397 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ICOORD_in_gcommcoordint403 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JCOORD_in_gcommcoordint407 = new BitSet(new long[]{0x0000000000000002L});
}
