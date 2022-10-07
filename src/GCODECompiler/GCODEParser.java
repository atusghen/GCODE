// $ANTLR 3.5.1 C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g 2022-10-07 17:02:30

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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:72:1: gcode returns [List<String> p] : (uno= config x= gcommall exit ) ;
	public final List<String> gcode() throws RecognitionException {
		List<String> p = null;


		List<Token> uno =null;
		List<String> x =null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:2: ( (uno= config x= gcommall exit ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:4: (uno= config x= gcommall exit )
			{
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:4: (uno= config x= gcommall exit )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:74:5: uno= config x= gcommall exit
			{
			pushFollow(FOLLOW_config_in_gcode63);
			uno=config();
			state._fsp--;

			pushFollow(FOLLOW_gcommall_in_gcode67);
			x=gcommall();
			state._fsp--;

			pushFollow(FOLLOW_exit_in_gcode69);
			exit();
			state._fsp--;

			}

			x=p; h.printConfig(uno);
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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:77:1: config returns [List<Token> s] : a= GCODESCOORD b= TCODES c= MCODES (d= otherconfig )? (e= MCODES )* ;
	public final List<Token> config() throws RecognitionException {
		List<Token> s = null;


		Token a=null;
		Token b=null;
		Token c=null;
		Token e=null;
		List<Token> d =null;

		 s = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:2: (a= GCODESCOORD b= TCODES c= MCODES (d= otherconfig )? (e= MCODES )* )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:4: a= GCODESCOORD b= TCODES c= MCODES (d= otherconfig )? (e= MCODES )*
			{
			a=(Token)match(input,GCODESCOORD,FOLLOW_GCODESCOORD_in_config94); 
			b=(Token)match(input,TCODES,FOLLOW_TCODES_in_config98); 
			c=(Token)match(input,MCODES,FOLLOW_MCODES_in_config102); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:37: (d= otherconfig )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==GCODESF) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:37: d= otherconfig
					{
					pushFollow(FOLLOW_otherconfig_in_config106);
					d=otherconfig();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:53: (e= MCODES )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MCODES) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:79:53: e= MCODES
					{
					e=(Token)match(input,MCODES,FOLLOW_MCODES_in_config112); 
					}
					break;

				default :
					break loop2;
				}
			}

			s.add(a); s.add(b); s.add(c); if(d!=null){s.addAll(d);} if(e!=null){s.add(e);}
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



	// $ANTLR start "otherconfig"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:84:1: otherconfig returns [List<Token> s] : a= GCODESF b= GCODESS c= FCODES d= SCODES ;
	public final List<Token> otherconfig() throws RecognitionException {
		List<Token> s = null;


		Token a=null;
		Token b=null;
		Token c=null;
		Token d=null;

		 s = new ArrayList<Token>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:86:2: (a= GCODESF b= GCODESS c= FCODES d= SCODES )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:87:3: a= GCODESF b= GCODESS c= FCODES d= SCODES
			{
			a=(Token)match(input,GCODESF,FOLLOW_GCODESF_in_otherconfig140); 
			b=(Token)match(input,GCODESS,FOLLOW_GCODESS_in_otherconfig144); 
			c=(Token)match(input,FCODES,FOLLOW_FCODES_in_otherconfig148); 
			d=(Token)match(input,SCODES,FOLLOW_SCODES_in_otherconfig152); 
			s.add(a); s.add(b); s.add(c); s.add(d);
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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:92:1: gcommall returns [List<String> listMove] : mv= gcommcoordfast (mu= gcommcoordnoint | gcommcoordint )+ ;
	public final List<String> gcommall() throws RecognitionException {
		List<String> listMove = null;


		String mv =null;
		String mu =null;

		 listMove = new ArrayList<String>();
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:94:2: (mv= gcommcoordfast (mu= gcommcoordnoint | gcommcoordint )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:94:4: mv= gcommcoordfast (mu= gcommcoordnoint | gcommcoordint )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_gcommall178);
			mv=gcommcoordfast();
			state._fsp--;

			h.addMovement (listMove, mv);
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:95:3: (mu= gcommcoordnoint | gcommcoordint )+
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
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:95:4: mu= gcommcoordnoint
					{
					pushFollow(FOLLOW_gcommcoordnoint_in_gcommall188);
					mu=gcommcoordnoint();
					state._fsp--;

					 h.addMovement (listMove, mu);
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:96:5: gcommcoordint
					{
					pushFollow(FOLLOW_gcommcoordint_in_gcommall196);
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



	// $ANTLR start "gcommcoordfast"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:101:1: gcommcoordfast returns [String mv] : g= GCODESFAST (x= XCOORD y= YCOORD ) ;
	public final String gcommcoordfast() throws RecognitionException {
		String mv = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:102:4: (g= GCODESFAST (x= XCOORD y= YCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:102:4: g= GCODESFAST (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESFAST,FOLLOW_GCODESFAST_in_gcommcoordfast220); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:102:17: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:102:18: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordfast225); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordfast229); 
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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:106:1: gcommcoordnoint returns [String mu] : g= GCODESINT (x= XCOORD y= YCOORD ) ;
	public final String gcommcoordnoint() throws RecognitionException {
		String mu = null;


		Token g=null;
		Token x=null;
		Token y=null;

		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:2: (g= GCODESINT (x= XCOORD y= YCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:4: g= GCODESINT (x= XCOORD y= YCOORD )
			{
			g=(Token)match(input,GCODESINT,FOLLOW_GCODESINT_in_gcommcoordnoint250); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:16: (x= XCOORD y= YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:107:17: x= XCOORD y= YCOORD
			{
			x=(Token)match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordnoint255); 
			y=(Token)match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordnoint259); 
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
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:110:1: gcommcoordint : GCODESINTCIRC ( XCOORD YCOORD ) ( ICOORD JCOORD ) ;
	public final void gcommcoordint() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:111:2: ( GCODESINTCIRC ( XCOORD YCOORD ) ( ICOORD JCOORD ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:111:4: GCODESINTCIRC ( XCOORD YCOORD ) ( ICOORD JCOORD )
			{
			match(input,GCODESINTCIRC,FOLLOW_GCODESINTCIRC_in_gcommcoordint274); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:111:18: ( XCOORD YCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:111:19: XCOORD YCOORD
			{
			match(input,XCOORD,FOLLOW_XCOORD_in_gcommcoordint277); 
			match(input,YCOORD,FOLLOW_YCOORD_in_gcommcoordint279); 
			}

			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:111:34: ( ICOORD JCOORD )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:111:35: ICOORD JCOORD
			{
			match(input,ICOORD,FOLLOW_ICOORD_in_gcommcoordint283); 
			match(input,JCOORD,FOLLOW_JCOORD_in_gcommcoordint285); 
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



	// $ANTLR start "exit"
	// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:178:1: exit : gcommcoordfast ( MCODES )+ ;
	public final void exit() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:179:2: ( gcommcoordfast ( MCODES )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:179:4: gcommcoordfast ( MCODES )+
			{
			pushFollow(FOLLOW_gcommcoordfast_in_exit611);
			gcommcoordfast();
			state._fsp--;

			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:179:19: ( MCODES )+
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
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:179:19: MCODES
					{
					match(input,MCODES,FOLLOW_MCODES_in_exit613); 
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

	// Delegated rules



	public static final BitSet FOLLOW_config_in_gcode63 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_gcommall_in_gcode67 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_exit_in_gcode69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESCOORD_in_config94 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_TCODES_in_config98 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_MCODES_in_config102 = new BitSet(new long[]{0x0000000010020002L});
	public static final BitSet FOLLOW_otherconfig_in_config106 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_MCODES_in_config112 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_GCODESF_in_otherconfig140 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_GCODESS_in_otherconfig144 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FCODES_in_otherconfig148 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SCODES_in_otherconfig152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_gcommall178 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_gcommcoordnoint_in_gcommall188 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_gcommcoordint_in_gcommall196 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_GCODESFAST_in_gcommcoordfast220 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordfast225 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordfast229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINT_in_gcommcoordnoint250 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordnoint255 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordnoint259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GCODESINTCIRC_in_gcommcoordint274 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_XCOORD_in_gcommcoordint277 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_YCOORD_in_gcommcoordint279 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ICOORD_in_gcommcoordint283 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JCOORD_in_gcommcoordint285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gcommcoordfast_in_exit611 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_MCODES_in_exit613 = new BitSet(new long[]{0x0000000010000002L});
}
