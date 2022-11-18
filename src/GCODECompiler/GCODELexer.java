// $ANTLR 3.5.1 C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g 2022-11-18 15:23:17

	package GCODECompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GCODELexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GCODELexer() {} 
	public GCODELexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GCODELexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g"; }

	// $ANTLR start "GCODESCOORD"
	public final void mGCODESCOORD() throws RecognitionException {
		try {
			int _type = GCODESCOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:129:2: ( 'G' ( '90' | '91' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:129:4: 'G' ( '90' | '91' )
			{
			match('G'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:129:8: ( '90' | '91' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='9') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='0') ) {
					alt1=1;
				}
				else if ( (LA1_1=='1') ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:129:9: '90'
					{
					match("90"); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:129:14: '91'
					{
					match("91"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESCOORD"

	// $ANTLR start "GCODESFAST"
	public final void mGCODESFAST() throws RecognitionException {
		try {
			int _type = GCODESFAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:133:2: ( 'G' '00' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:133:4: 'G' '00'
			{
			match('G'); 
			match("00"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESFAST"

	// $ANTLR start "GCODESINT"
	public final void mGCODESINT() throws RecognitionException {
		try {
			int _type = GCODESINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:137:2: ( 'G' ( '01' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:137:4: 'G' ( '01' )
			{
			match('G'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:137:8: ( '01' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:137:9: '01'
			{
			match("01"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESINT"

	// $ANTLR start "GCODESINTCIRC"
	public final void mGCODESINTCIRC() throws RecognitionException {
		try {
			int _type = GCODESINTCIRC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:141:2: ( 'G' ( '02' | '03' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:141:4: 'G' ( '02' | '03' )
			{
			match('G'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:141:8: ( '02' | '03' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='2') ) {
					alt2=1;
				}
				else if ( (LA2_1=='3') ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:141:9: '02'
					{
					match("02"); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:141:14: '03'
					{
					match("03"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESINTCIRC"

	// $ANTLR start "GCODESCOMP"
	public final void mGCODESCOMP() throws RecognitionException {
		try {
			int _type = GCODESCOMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:145:2: ( 'G' ( '40' | '41' | '42' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:145:4: 'G' ( '40' | '41' | '42' )
			{
			match('G'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:145:8: ( '40' | '41' | '42' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='4') ) {
				switch ( input.LA(2) ) {
				case '0':
					{
					alt3=1;
					}
					break;
				case '1':
					{
					alt3=2;
					}
					break;
				case '2':
					{
					alt3=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:145:9: '40'
					{
					match("40"); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:145:14: '41'
					{
					match("41"); 

					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:145:19: '42'
					{
					match("42"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESCOMP"

	// $ANTLR start "GCODESF"
	public final void mGCODESF() throws RecognitionException {
		try {
			int _type = GCODESF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:149:2: ( 'G' ( '94' | '95' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:149:4: 'G' ( '94' | '95' )
			{
			match('G'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:149:8: ( '94' | '95' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='9') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='4') ) {
					alt4=1;
				}
				else if ( (LA4_1=='5') ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:149:9: '94'
					{
					match("94"); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:149:14: '95'
					{
					match("95"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESF"

	// $ANTLR start "GCODESS"
	public final void mGCODESS() throws RecognitionException {
		try {
			int _type = GCODESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:153:2: ( 'G' ( '96' | '97' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:153:4: 'G' ( '96' | '97' )
			{
			match('G'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:153:8: ( '96' | '97' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='9') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='6') ) {
					alt5=1;
				}
				else if ( (LA5_1=='7') ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:153:9: '96'
					{
					match("96"); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:153:14: '97'
					{
					match("97"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GCODESS"

	// $ANTLR start "TCODES"
	public final void mTCODES() throws RecognitionException {
		try {
			int _type = TCODES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:157:2: ( 'T' ( '0' .. '9' '0' .. '9' )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:157:4: 'T' ( '0' .. '9' '0' .. '9' )+
			{
			match('T'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:157:8: ( '0' .. '9' '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:157:9: '0' .. '9' '0' .. '9'
					{
					matchRange('0','9'); 
					matchRange('0','9'); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TCODES"

	// $ANTLR start "MCODES"
	public final void mMCODES() throws RecognitionException {
		try {
			int _type = MCODES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:2: ( 'M' ( '00' | '03' | '04' | '05' | '06' | '08' | '09' | '10' | '11' | '30' | '60' | '72' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:4: 'M' ( '00' | '03' | '04' | '05' | '06' | '08' | '09' | '10' | '11' | '30' | '60' | '72' )
			{
			match('M'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:8: ( '00' | '03' | '04' | '05' | '06' | '08' | '09' | '10' | '11' | '30' | '60' | '72' )
			int alt7=12;
			switch ( input.LA(1) ) {
			case '0':
				{
				switch ( input.LA(2) ) {
				case '0':
					{
					alt7=1;
					}
					break;
				case '3':
					{
					alt7=2;
					}
					break;
				case '4':
					{
					alt7=3;
					}
					break;
				case '5':
					{
					alt7=4;
					}
					break;
				case '6':
					{
					alt7=5;
					}
					break;
				case '8':
					{
					alt7=6;
					}
					break;
				case '9':
					{
					alt7=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '1':
				{
				int LA7_2 = input.LA(2);
				if ( (LA7_2=='0') ) {
					alt7=8;
				}
				else if ( (LA7_2=='1') ) {
					alt7=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '3':
				{
				alt7=10;
				}
				break;
			case '6':
				{
				alt7=11;
				}
				break;
			case '7':
				{
				alt7=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:9: '00'
					{
					match("00"); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:14: '03'
					{
					match("03"); 

					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:19: '04'
					{
					match("04"); 

					}
					break;
				case 4 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:24: '05'
					{
					match("05"); 

					}
					break;
				case 5 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:29: '06'
					{
					match("06"); 

					}
					break;
				case 6 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:34: '08'
					{
					match("08"); 

					}
					break;
				case 7 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:39: '09'
					{
					match("09"); 

					}
					break;
				case 8 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:44: '10'
					{
					match("10"); 

					}
					break;
				case 9 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:49: '11'
					{
					match("11"); 

					}
					break;
				case 10 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:54: '30'
					{
					match("30"); 

					}
					break;
				case 11 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:59: '60'
					{
					match("60"); 

					}
					break;
				case 12 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:161:64: '72'
					{
					match("72"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MCODES"

	// $ANTLR start "XCOORD"
	public final void mXCOORD() throws RecognitionException {
		try {
			int _type = XCOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:165:2: ( 'X' ( '+' | '-' )? INT )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:165:4: 'X' ( '+' | '-' )? INT
			{
			match('X'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:165:8: ( '+' | '-' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='+'||LA8_0=='-') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XCOORD"

	// $ANTLR start "YCOORD"
	public final void mYCOORD() throws RecognitionException {
		try {
			int _type = YCOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:169:2: ( 'Y' ( '+' | '-' )? INT )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:169:4: 'Y' ( '+' | '-' )? INT
			{
			match('Y'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:169:8: ( '+' | '-' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='+'||LA9_0=='-') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YCOORD"

	// $ANTLR start "ICOORD"
	public final void mICOORD() throws RecognitionException {
		try {
			int _type = ICOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:173:2: ( 'I' ( ADD | SUB )? INT )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:173:4: 'I' ( ADD | SUB )? INT
			{
			match('I'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:173:8: ( ADD | SUB )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='+'||LA10_0=='-') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ICOORD"

	// $ANTLR start "JCOORD"
	public final void mJCOORD() throws RecognitionException {
		try {
			int _type = JCOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:177:2: ( 'J' ( ADD | SUB )? INT )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:177:4: 'J' ( ADD | SUB )? INT
			{
			match('J'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:177:8: ( ADD | SUB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='+'||LA11_0=='-') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JCOORD"

	// $ANTLR start "SCODES"
	public final void mSCODES() throws RecognitionException {
		try {
			int _type = SCODES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:181:2: ( 'S' ( '0' .. '9' )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:181:4: 'S' ( '0' .. '9' )+
			{
			match('S'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:181:8: ( '0' .. '9' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCODES"

	// $ANTLR start "FCODES"
	public final void mFCODES() throws RecognitionException {
		try {
			int _type = FCODES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:185:2: ( 'F' ( '0' .. '9' )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:185:4: 'F' ( '0' .. '9' )+
			{
			match('F'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:185:8: ( '0' .. '9' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FCODES"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:190:5: ( '+' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:190:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:191:5: ( '-' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:191:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:192:5: ( '*' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:192:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:193:5: ( '/' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:193:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:194:7: ( ',' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:194:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:195:5: ( ';' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:195:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:196:5: ( '.' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:196:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:197:5: ( '{' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:197:7: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:198:5: ( '}' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:198:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:199:5: ( '=' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:199:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:200:4: ( '(' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:200:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:201:4: ( ')' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:201:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:203:9: ( 'package' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:203:11: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:207:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:207:7: ( '0' .. '9' )+
			{
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:207:7: ( '0' .. '9' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:211:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt21=3;
			alt21 = dfa21.predict(input);
			switch (alt21) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:211:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:211:9: ( '0' .. '9' )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match('.'); 
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:211:25: ( '0' .. '9' )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:211:37: ( EXPONENT )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='E'||LA17_0=='e') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:211:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:212:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:212:13: ( '0' .. '9' )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:212:25: ( EXPONENT )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='E'||LA19_0=='e') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:212:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:213:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:213:9: ( '0' .. '9' )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:217:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='/') ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1=='/') ) {
					alt25=1;
				}
				else if ( (LA25_1=='*') ) {
					alt25=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:217:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:217:14: (~ ( '\\n' | '\\r' ) )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\uFFFF')) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop22;
						}
					}

					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:217:28: ( '\\r' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0=='\r') ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:217:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:218:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:218:14: ( options {greedy=false; } : . )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0=='*') ) {
							int LA24_1 = input.LA(2);
							if ( (LA24_1=='/') ) {
								alt24=2;
							}
							else if ( ((LA24_1 >= '\u0000' && LA24_1 <= '.')||(LA24_1 >= '0' && LA24_1 <= '\uFFFF')) ) {
								alt24=1;
							}

						}
						else if ( ((LA24_0 >= '\u0000' && LA24_0 <= ')')||(LA24_0 >= '+' && LA24_0 <= '\uFFFF')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:218:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop24;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:221:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:221:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:229:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:229:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:229:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='\\') ) {
					alt26=1;
				}
				else if ( ((LA26_0 >= '\u0000' && LA26_0 <= '!')||(LA26_0 >= '#' && LA26_0 <= '[')||(LA26_0 >= ']' && LA26_0 <= '\uFFFF')) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:229:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:229:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop26;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:232:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:232:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:232:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='\\') ) {
				alt27=1;
			}
			else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '&')||(LA27_0 >= '(' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '\uFFFF')) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:232:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:232:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:237:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:237:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:237:22: ( '+' | '-' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='+'||LA28_0=='-') ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:237:33: ( '0' .. '9' )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= '0' && LA29_0 <= '9')) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:240:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:244:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt30=3;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt30=1;
					}
					break;
				case 'u':
					{
					alt30=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt30=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:244:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:245:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:246:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:251:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='\\') ) {
				int LA31_1 = input.LA(2);
				if ( ((LA31_1 >= '0' && LA31_1 <= '3')) ) {
					int LA31_2 = input.LA(3);
					if ( ((LA31_2 >= '0' && LA31_2 <= '7')) ) {
						int LA31_4 = input.LA(4);
						if ( ((LA31_4 >= '0' && LA31_4 <= '7')) ) {
							alt31=1;
						}

						else {
							alt31=2;
						}

					}

					else {
						alt31=3;
					}

				}
				else if ( ((LA31_1 >= '4' && LA31_1 <= '7')) ) {
					int LA31_3 = input.LA(3);
					if ( ((LA31_3 >= '0' && LA31_3 <= '7')) ) {
						alt31=2;
					}

					else {
						alt31=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:251:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:252:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:253:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:258:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:258:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:260:12: ( . )
			// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:260:14: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:8: ( GCODESCOORD | GCODESFAST | GCODESINT | GCODESINTCIRC | GCODESCOMP | GCODESF | GCODESS | TCODES | MCODES | XCOORD | YCOORD | ICOORD | JCOORD | SCODES | FCODES | ADD | SUB | MUL | DIV | COMMA | SC | DOT | LB | RB | EQ | LP | RP | PACKAGE | INT | FLOAT | COMMENT | WS | STRING | CHAR | SCAN_ERROR )
		int alt32=35;
		alt32 = dfa32.predict(input);
		switch (alt32) {
			case 1 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:10: GCODESCOORD
				{
				mGCODESCOORD(); 

				}
				break;
			case 2 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:22: GCODESFAST
				{
				mGCODESFAST(); 

				}
				break;
			case 3 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:33: GCODESINT
				{
				mGCODESINT(); 

				}
				break;
			case 4 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:43: GCODESINTCIRC
				{
				mGCODESINTCIRC(); 

				}
				break;
			case 5 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:57: GCODESCOMP
				{
				mGCODESCOMP(); 

				}
				break;
			case 6 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:68: GCODESF
				{
				mGCODESF(); 

				}
				break;
			case 7 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:76: GCODESS
				{
				mGCODESS(); 

				}
				break;
			case 8 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:84: TCODES
				{
				mTCODES(); 

				}
				break;
			case 9 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:91: MCODES
				{
				mMCODES(); 

				}
				break;
			case 10 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:98: XCOORD
				{
				mXCOORD(); 

				}
				break;
			case 11 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:105: YCOORD
				{
				mYCOORD(); 

				}
				break;
			case 12 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:112: ICOORD
				{
				mICOORD(); 

				}
				break;
			case 13 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:119: JCOORD
				{
				mJCOORD(); 

				}
				break;
			case 14 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:126: SCODES
				{
				mSCODES(); 

				}
				break;
			case 15 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:133: FCODES
				{
				mFCODES(); 

				}
				break;
			case 16 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:140: ADD
				{
				mADD(); 

				}
				break;
			case 17 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:144: SUB
				{
				mSUB(); 

				}
				break;
			case 18 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:148: MUL
				{
				mMUL(); 

				}
				break;
			case 19 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:152: DIV
				{
				mDIV(); 

				}
				break;
			case 20 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:156: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 21 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:162: SC
				{
				mSC(); 

				}
				break;
			case 22 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:165: DOT
				{
				mDOT(); 

				}
				break;
			case 23 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:169: LB
				{
				mLB(); 

				}
				break;
			case 24 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:172: RB
				{
				mRB(); 

				}
				break;
			case 25 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:175: EQ
				{
				mEQ(); 

				}
				break;
			case 26 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:178: LP
				{
				mLP(); 

				}
				break;
			case 27 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:181: RP
				{
				mRP(); 

				}
				break;
			case 28 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:184: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 29 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:192: INT
				{
				mINT(); 

				}
				break;
			case 30 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:196: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 31 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:202: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 32 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:210: WS
				{
				mWS(); 

				}
				break;
			case 33 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:213: STRING
				{
				mSTRING(); 

				}
				break;
			case 34 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:220: CHAR
				{
				mCHAR(); 

				}
				break;
			case 35 :
				// C:\\Users\\greco\\git\\GCODE\\src\\GCODECompiler\\GCODE.g:1:225: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA21 dfa21 = new DFA21(this);
	protected DFA32 dfa32 = new DFA32(this);
	static final String DFA21_eotS =
		"\5\uffff";
	static final String DFA21_eofS =
		"\5\uffff";
	static final String DFA21_minS =
		"\2\56\3\uffff";
	static final String DFA21_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA21_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA21_specialS =
		"\5\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "210:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA32_eotS =
		"\1\uffff\11\33\3\uffff\1\53\2\uffff\1\56\5\uffff\1\33\1\66\1\uffff\2\33"+
		"\34\uffff\1\66\11\uffff";
	static final String DFA32_eofS =
		"\101\uffff";
	static final String DFA32_minS =
		"\1\0\3\60\4\53\2\60\3\uffff\1\52\2\uffff\1\60\5\uffff\1\141\1\56\1\uffff"+
		"\2\0\1\uffff\2\60\31\uffff\1\56\11\uffff";
	static final String DFA32_maxS =
		"\1\uffff\2\71\1\67\6\71\3\uffff\1\57\2\uffff\1\71\5\uffff\1\141\1\145"+
		"\1\uffff\2\uffff\1\uffff\1\63\1\67\31\uffff\1\145\11\uffff";
	static final String DFA32_acceptS =
		"\12\uffff\1\20\1\21\1\22\1\uffff\1\24\1\25\1\uffff\1\27\1\30\1\31\1\32"+
		"\1\33\2\uffff\1\40\2\uffff\1\43\2\uffff\1\5\1\10\1\11\1\12\1\13\1\14\1"+
		"\15\1\16\1\17\1\20\1\21\1\22\1\37\1\23\1\24\1\25\1\26\1\36\1\27\1\30\1"+
		"\31\1\32\1\33\1\34\1\35\1\uffff\1\40\1\41\1\42\1\2\1\3\1\4\1\1\1\6\1\7";
	static final String DFA32_specialS =
		"\1\0\30\uffff\1\1\1\2\46\uffff}>";
	static final String[] DFA32_transitionS = {
			"\11\33\2\30\2\33\1\30\22\33\1\30\1\33\1\31\4\33\1\32\1\24\1\25\1\14\1"+
			"\12\1\16\1\13\1\20\1\15\12\27\1\33\1\17\1\33\1\23\10\33\1\11\1\1\1\33"+
			"\1\6\1\7\2\33\1\3\5\33\1\10\1\2\3\33\1\4\1\5\26\33\1\26\12\33\1\21\1"+
			"\33\1\22\uff82\33",
			"\1\34\3\uffff\1\36\4\uffff\1\35",
			"\12\37",
			"\2\40\1\uffff\1\40\2\uffff\2\40",
			"\1\41\1\uffff\1\41\2\uffff\12\41",
			"\1\42\1\uffff\1\42\2\uffff\12\42",
			"\1\43\1\uffff\1\43\2\uffff\12\43",
			"\1\44\1\uffff\1\44\2\uffff\12\44",
			"\12\45",
			"\12\46",
			"",
			"",
			"",
			"\1\52\4\uffff\1\52",
			"",
			"",
			"\12\57",
			"",
			"",
			"",
			"",
			"",
			"\1\65",
			"\1\57\1\uffff\12\67\13\uffff\1\57\37\uffff\1\57",
			"",
			"\0\71",
			"\47\72\1\uffff\uffd8\72",
			"",
			"\1\73\1\74\2\75",
			"\2\76\2\uffff\2\77\2\100",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57\1\uffff\12\67\13\uffff\1\57\37\uffff\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GCODESCOORD | GCODESFAST | GCODESINT | GCODESINTCIRC | GCODESCOMP | GCODESF | GCODESS | TCODES | MCODES | XCOORD | YCOORD | ICOORD | JCOORD | SCODES | FCODES | ADD | SUB | MUL | DIV | COMMA | SC | DOT | LB | RB | EQ | LP | RP | PACKAGE | INT | FLOAT | COMMENT | WS | STRING | CHAR | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA32_0 = input.LA(1);
						s = -1;
						if ( (LA32_0=='G') ) {s = 1;}
						else if ( (LA32_0=='T') ) {s = 2;}
						else if ( (LA32_0=='M') ) {s = 3;}
						else if ( (LA32_0=='X') ) {s = 4;}
						else if ( (LA32_0=='Y') ) {s = 5;}
						else if ( (LA32_0=='I') ) {s = 6;}
						else if ( (LA32_0=='J') ) {s = 7;}
						else if ( (LA32_0=='S') ) {s = 8;}
						else if ( (LA32_0=='F') ) {s = 9;}
						else if ( (LA32_0=='+') ) {s = 10;}
						else if ( (LA32_0=='-') ) {s = 11;}
						else if ( (LA32_0=='*') ) {s = 12;}
						else if ( (LA32_0=='/') ) {s = 13;}
						else if ( (LA32_0==',') ) {s = 14;}
						else if ( (LA32_0==';') ) {s = 15;}
						else if ( (LA32_0=='.') ) {s = 16;}
						else if ( (LA32_0=='{') ) {s = 17;}
						else if ( (LA32_0=='}') ) {s = 18;}
						else if ( (LA32_0=='=') ) {s = 19;}
						else if ( (LA32_0=='(') ) {s = 20;}
						else if ( (LA32_0==')') ) {s = 21;}
						else if ( (LA32_0=='p') ) {s = 22;}
						else if ( ((LA32_0 >= '0' && LA32_0 <= '9')) ) {s = 23;}
						else if ( ((LA32_0 >= '\t' && LA32_0 <= '\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 24;}
						else if ( (LA32_0=='\"') ) {s = 25;}
						else if ( (LA32_0=='\'') ) {s = 26;}
						else if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\b')||(LA32_0 >= '\u000B' && LA32_0 <= '\f')||(LA32_0 >= '\u000E' && LA32_0 <= '\u001F')||LA32_0=='!'||(LA32_0 >= '#' && LA32_0 <= '&')||LA32_0==':'||LA32_0=='<'||(LA32_0 >= '>' && LA32_0 <= 'E')||LA32_0=='H'||(LA32_0 >= 'K' && LA32_0 <= 'L')||(LA32_0 >= 'N' && LA32_0 <= 'R')||(LA32_0 >= 'U' && LA32_0 <= 'W')||(LA32_0 >= 'Z' && LA32_0 <= 'o')||(LA32_0 >= 'q' && LA32_0 <= 'z')||LA32_0=='|'||(LA32_0 >= '~' && LA32_0 <= '\uFFFF')) ) {s = 27;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA32_25 = input.LA(1);
						s = -1;
						if ( ((LA32_25 >= '\u0000' && LA32_25 <= '\uFFFF')) ) {s = 57;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA32_26 = input.LA(1);
						s = -1;
						if ( ((LA32_26 >= '\u0000' && LA32_26 <= '&')||(LA32_26 >= '(' && LA32_26 <= '\uFFFF')) ) {s = 58;}
						else s = 27;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 32, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
