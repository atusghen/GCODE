// $ANTLR 3.5.1 C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g 2022-10-03 15:55:18

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
	@Override public String getGrammarFileName() { return "C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g"; }

	// $ANTLR start "GCODESCOORD"
	public final void mGCODESCOORD() throws RecognitionException {
		try {
			int _type = GCODESCOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:105:2: ( 'G' ( '90' | '91' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:105:4: 'G' ( '90' | '91' )
			{
			match('G'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:105:8: ( '90' | '91' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:105:9: '90'
					{
					match("90"); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:105:14: '91'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:109:2: ( 'G' '00' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:109:4: 'G' '00'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:113:2: ( 'G' ( '01' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:113:4: 'G' ( '01' )
			{
			match('G'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:113:8: ( '01' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:113:9: '01'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:117:2: ( 'G' ( '02' | '03' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:117:4: 'G' ( '02' | '03' )
			{
			match('G'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:117:8: ( '02' | '03' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:117:9: '02'
					{
					match("02"); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:117:14: '03'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:121:2: ( 'G' ( '40' | '41' | '42' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:121:4: 'G' ( '40' | '41' | '42' )
			{
			match('G'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:121:8: ( '40' | '41' | '42' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:121:9: '40'
					{
					match("40"); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:121:14: '41'
					{
					match("41"); 

					}
					break;
				case 3 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:121:19: '42'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:125:2: ( 'G' ( '94' | '95' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:125:4: 'G' ( '94' | '95' )
			{
			match('G'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:125:8: ( '94' | '95' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:125:9: '94'
					{
					match("94"); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:125:14: '95'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:129:2: ( 'G' ( '96' | '97' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:129:4: 'G' ( '96' | '97' )
			{
			match('G'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:129:8: ( '96' | '97' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:129:9: '96'
					{
					match("96"); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:129:14: '97'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:133:2: ( 'T' ( '0' .. '9' '0' .. '9' )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:133:4: 'T' ( '0' .. '9' '0' .. '9' )+
			{
			match('T'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:133:8: ( '0' .. '9' '0' .. '9' )+
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:133:9: '0' .. '9' '0' .. '9'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:2: ( 'M' ( '00' | '03' | '04' | '05' | '06' | '08' | '09' | '10' | '11' | '30' | '60' | '72' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:4: 'M' ( '00' | '03' | '04' | '05' | '06' | '08' | '09' | '10' | '11' | '30' | '60' | '72' )
			{
			match('M'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:8: ( '00' | '03' | '04' | '05' | '06' | '08' | '09' | '10' | '11' | '30' | '60' | '72' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:9: '00'
					{
					match("00"); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:14: '03'
					{
					match("03"); 

					}
					break;
				case 3 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:19: '04'
					{
					match("04"); 

					}
					break;
				case 4 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:24: '05'
					{
					match("05"); 

					}
					break;
				case 5 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:29: '06'
					{
					match("06"); 

					}
					break;
				case 6 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:34: '08'
					{
					match("08"); 

					}
					break;
				case 7 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:39: '09'
					{
					match("09"); 

					}
					break;
				case 8 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:44: '10'
					{
					match("10"); 

					}
					break;
				case 9 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:49: '11'
					{
					match("11"); 

					}
					break;
				case 10 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:54: '30'
					{
					match("30"); 

					}
					break;
				case 11 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:59: '60'
					{
					match("60"); 

					}
					break;
				case 12 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:137:64: '72'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:141:2: ( 'X' ( '+' | '-' )? INT )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:141:4: 'X' ( '+' | '-' )? INT
			{
			match('X'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:141:8: ( '+' | '-' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='+'||LA8_0=='-') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:145:2: ( 'Y' ( ADD | SUB )? INT )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:145:4: 'Y' ( ADD | SUB )? INT
			{
			match('Y'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:145:8: ( ADD | SUB )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='+'||LA9_0=='-') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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

	// $ANTLR start "ZCOORD"
	public final void mZCOORD() throws RecognitionException {
		try {
			int _type = ZCOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:149:2: ( 'Z' ( ADD | SUB )? INT )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:149:4: 'Z' ( ADD | SUB )? INT
			{
			match('Z'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:149:8: ( ADD | SUB )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='+'||LA10_0=='-') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
	// $ANTLR end "ZCOORD"

	// $ANTLR start "ICOORD"
	public final void mICOORD() throws RecognitionException {
		try {
			int _type = ICOORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:153:2: ( 'I' ( ADD | SUB )? INT )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:153:4: 'I' ( ADD | SUB )? INT
			{
			match('I'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:153:8: ( ADD | SUB )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='+'||LA11_0=='-') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:157:2: ( 'J' ( ADD | SUB )? INT )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:157:4: 'J' ( ADD | SUB )? INT
			{
			match('J'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:157:8: ( ADD | SUB )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='+'||LA12_0=='-') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:161:2: ( 'S' ( '0' .. '9' )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:161:4: 'S' ( '0' .. '9' )+
			{
			match('S'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:161:8: ( '0' .. '9' )+
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
	// $ANTLR end "SCODES"

	// $ANTLR start "FCODES"
	public final void mFCODES() throws RecognitionException {
		try {
			int _type = FCODES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:165:2: ( 'F' ( '0' .. '9' )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:165:4: 'F' ( '0' .. '9' )+
			{
			match('F'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:165:8: ( '0' .. '9' )+
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
	// $ANTLR end "FCODES"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:169:5: ( '+' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:169:7: '+'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:170:5: ( '-' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:170:7: '-'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:171:5: ( '*' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:171:7: '*'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:172:5: ( '/' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:172:7: '/'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:173:7: ( ',' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:173:9: ','
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:174:5: ( ';' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:174:7: ';'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:175:5: ( '.' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:175:7: '.'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:176:5: ( '{' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:176:7: '{'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:177:5: ( '}' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:177:7: '}'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:178:5: ( '=' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:178:7: '='
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:179:4: ( '(' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:179:6: '('
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:180:4: ( ')' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:180:6: ')'
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:182:9: ( 'package' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:182:11: 'package'
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:184:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:184:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:184:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'Z')||LA15_0=='_'||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop15;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:186:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:186:7: ( '0' .. '9' )+
			{
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:186:7: ( '0' .. '9' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:190:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt23=3;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:190:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:190:9: ( '0' .. '9' )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match('.'); 
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:190:25: ( '0' .. '9' )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
							break loop18;
						}
					}

					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:190:37: ( EXPONENT )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='E'||LA19_0=='e') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:190:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:191:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:191:13: ( '0' .. '9' )+
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
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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

					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:191:25: ( EXPONENT )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0=='E'||LA21_0=='e') ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:191:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:192:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:192:9: ( '0' .. '9' )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:196:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='/') ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1=='/') ) {
					alt27=1;
				}
				else if ( (LA27_1=='*') ) {
					alt27=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:196:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:196:14: (~ ( '\\n' | '\\r' ) )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '\u0000' && LA24_0 <= '\t')||(LA24_0 >= '\u000B' && LA24_0 <= '\f')||(LA24_0 >= '\u000E' && LA24_0 <= '\uFFFF')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
							break loop24;
						}
					}

					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:196:28: ( '\\r' )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='\r') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:196:28: '\\r'
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:197:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:197:14: ( options {greedy=false; } : . )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0=='*') ) {
							int LA26_1 = input.LA(2);
							if ( (LA26_1=='/') ) {
								alt26=2;
							}
							else if ( ((LA26_1 >= '\u0000' && LA26_1 <= '.')||(LA26_1 >= '0' && LA26_1 <= '\uFFFF')) ) {
								alt26=1;
							}

						}
						else if ( ((LA26_0 >= '\u0000' && LA26_0 <= ')')||(LA26_0 >= '+' && LA26_0 <= '\uFFFF')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:197:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop26;
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:200:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:200:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:208:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:208:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:208:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0=='\\') ) {
					alt28=1;
				}
				else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '!')||(LA28_0 >= '#' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:208:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:208:24: ~ ( '\\\\' | '\"' )
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
					break loop28;
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:211:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:211:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:211:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='\\') ) {
				alt29=1;
			}
			else if ( ((LA29_0 >= '\u0000' && LA29_0 <= '&')||(LA29_0 >= '(' && LA29_0 <= '[')||(LA29_0 >= ']' && LA29_0 <= '\uFFFF')) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:211:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:211:25: ~ ( '\\'' | '\\\\' )
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:216:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:216:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:216:22: ( '+' | '-' )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='+'||LA30_0=='-') ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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

			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:216:33: ( '0' .. '9' )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:219:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:223:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='\\') ) {
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
					alt32=1;
					}
					break;
				case 'u':
					{
					alt32=2;
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
					alt32=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:223:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:224:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:225:9: OCTAL_ESC
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:230:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='\\') ) {
				int LA33_1 = input.LA(2);
				if ( ((LA33_1 >= '0' && LA33_1 <= '3')) ) {
					int LA33_2 = input.LA(3);
					if ( ((LA33_2 >= '0' && LA33_2 <= '7')) ) {
						int LA33_4 = input.LA(4);
						if ( ((LA33_4 >= '0' && LA33_4 <= '7')) ) {
							alt33=1;
						}

						else {
							alt33=2;
						}

					}

					else {
						alt33=3;
					}

				}
				else if ( ((LA33_1 >= '4' && LA33_1 <= '7')) ) {
					int LA33_3 = input.LA(3);
					if ( ((LA33_3 >= '0' && LA33_3 <= '7')) ) {
						alt33=2;
					}

					else {
						alt33=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:230:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:231:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:232:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:237:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:237:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:239:12: ( . )
			// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:239:14: .
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
		// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:8: ( GCODESCOORD | GCODESFAST | GCODESINT | GCODESINTCIRC | GCODESCOMP | GCODESF | GCODESS | TCODES | MCODES | XCOORD | YCOORD | ZCOORD | ICOORD | JCOORD | SCODES | FCODES | ADD | SUB | MUL | DIV | COMMA | SC | DOT | LB | RB | EQ | LP | RP | PACKAGE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | SCAN_ERROR )
		int alt34=37;
		alt34 = dfa34.predict(input);
		switch (alt34) {
			case 1 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:10: GCODESCOORD
				{
				mGCODESCOORD(); 

				}
				break;
			case 2 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:22: GCODESFAST
				{
				mGCODESFAST(); 

				}
				break;
			case 3 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:33: GCODESINT
				{
				mGCODESINT(); 

				}
				break;
			case 4 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:43: GCODESINTCIRC
				{
				mGCODESINTCIRC(); 

				}
				break;
			case 5 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:57: GCODESCOMP
				{
				mGCODESCOMP(); 

				}
				break;
			case 6 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:68: GCODESF
				{
				mGCODESF(); 

				}
				break;
			case 7 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:76: GCODESS
				{
				mGCODESS(); 

				}
				break;
			case 8 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:84: TCODES
				{
				mTCODES(); 

				}
				break;
			case 9 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:91: MCODES
				{
				mMCODES(); 

				}
				break;
			case 10 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:98: XCOORD
				{
				mXCOORD(); 

				}
				break;
			case 11 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:105: YCOORD
				{
				mYCOORD(); 

				}
				break;
			case 12 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:112: ZCOORD
				{
				mZCOORD(); 

				}
				break;
			case 13 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:119: ICOORD
				{
				mICOORD(); 

				}
				break;
			case 14 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:126: JCOORD
				{
				mJCOORD(); 

				}
				break;
			case 15 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:133: SCODES
				{
				mSCODES(); 

				}
				break;
			case 16 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:140: FCODES
				{
				mFCODES(); 

				}
				break;
			case 17 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:147: ADD
				{
				mADD(); 

				}
				break;
			case 18 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:151: SUB
				{
				mSUB(); 

				}
				break;
			case 19 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:155: MUL
				{
				mMUL(); 

				}
				break;
			case 20 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:159: DIV
				{
				mDIV(); 

				}
				break;
			case 21 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:163: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 22 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:169: SC
				{
				mSC(); 

				}
				break;
			case 23 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:172: DOT
				{
				mDOT(); 

				}
				break;
			case 24 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:176: LB
				{
				mLB(); 

				}
				break;
			case 25 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:179: RB
				{
				mRB(); 

				}
				break;
			case 26 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:182: EQ
				{
				mEQ(); 

				}
				break;
			case 27 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:185: LP
				{
				mLP(); 

				}
				break;
			case 28 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:188: RP
				{
				mRP(); 

				}
				break;
			case 29 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:191: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 30 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:199: ID
				{
				mID(); 

				}
				break;
			case 31 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:202: INT
				{
				mINT(); 

				}
				break;
			case 32 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:206: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 33 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:212: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 34 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:220: WS
				{
				mWS(); 

				}
				break;
			case 35 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:223: STRING
				{
				mSTRING(); 

				}
				break;
			case 36 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:230: CHAR
				{
				mCHAR(); 

				}
				break;
			case 37 :
				// C:\\Users\\fabio\\eclipse-workspace\\GCode\\src\\GCodeCompiler\\GCODE.g:1:235: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA23 dfa23 = new DFA23(this);
	protected DFA34 dfa34 = new DFA34(this);
	static final String DFA23_eotS =
		"\5\uffff";
	static final String DFA23_eofS =
		"\5\uffff";
	static final String DFA23_minS =
		"\2\56\3\uffff";
	static final String DFA23_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA23_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA23_specialS =
		"\5\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "189:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA34_eotS =
		"\1\uffff\12\41\3\uffff\1\70\2\uffff\1\73\5\uffff\1\41\1\uffff\1\103\1"+
		"\uffff\2\35\1\uffff\3\41\1\uffff\6\41\1\uffff\1\50\1\uffff\1\52\1\uffff"+
		"\1\54\1\uffff\1\56\1\uffff\1\60\1\142\1\143\16\uffff\1\41\1\uffff\1\103"+
		"\3\uffff\1\145\1\146\2\147\2\150\2\151\2\152\3\153\1\154\14\155\2\uffff"+
		"\1\41\11\uffff\3\41\1\162\1\uffff";
	static final String DFA34_eofS =
		"\163\uffff";
	static final String DFA34_minS =
		"\1\0\3\60\5\53\2\60\3\uffff\1\52\2\uffff\1\60\5\uffff\1\141\1\uffff\1"+
		"\56\1\uffff\2\0\1\uffff\3\60\1\uffff\5\60\1\62\1\uffff\1\60\1\uffff\1"+
		"\60\1\uffff\1\60\1\uffff\1\60\1\uffff\3\60\16\uffff\1\143\1\uffff\1\56"+
		"\3\uffff\32\60\2\uffff\1\153\11\uffff\1\141\1\147\1\145\1\60\1\uffff";
	static final String DFA34_maxS =
		"\1\uffff\2\71\1\67\7\71\3\uffff\1\57\2\uffff\1\71\5\uffff\1\141\1\uffff"+
		"\1\145\1\uffff\2\uffff\1\uffff\1\63\1\67\1\62\1\uffff\2\71\1\61\2\60\1"+
		"\62\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3"+
		"\172\16\uffff\1\143\1\uffff\1\145\3\uffff\32\172\2\uffff\1\153\11\uffff"+
		"\1\141\1\147\1\145\1\172\1\uffff";
	static final String DFA34_acceptS =
		"\13\uffff\1\21\1\22\1\23\1\uffff\1\25\1\26\1\uffff\1\30\1\31\1\32\1\33"+
		"\1\34\1\uffff\1\36\1\uffff\1\42\2\uffff\1\45\3\uffff\1\36\6\uffff\1\12"+
		"\1\uffff\1\13\1\uffff\1\14\1\uffff\1\15\1\uffff\1\16\3\uffff\1\21\1\22"+
		"\1\23\1\41\1\24\1\25\1\26\1\27\1\40\1\30\1\31\1\32\1\33\1\34\1\uffff\1"+
		"\37\1\uffff\1\42\1\43\1\44\32\uffff\1\17\1\20\1\uffff\1\2\1\3\1\4\1\1"+
		"\1\6\1\7\1\5\1\10\1\11\4\uffff\1\35";
	static final String DFA34_specialS =
		"\1\2\32\uffff\1\1\1\0\126\uffff}>";
	static final String[] DFA34_transitionS = {
			"\11\35\2\32\2\35\1\32\22\35\1\32\1\35\1\33\4\35\1\34\1\25\1\26\1\15\1"+
			"\13\1\17\1\14\1\21\1\16\12\31\1\35\1\20\1\35\1\24\3\35\5\30\1\12\1\1"+
			"\1\30\1\7\1\10\2\30\1\3\5\30\1\11\1\2\3\30\1\4\1\5\1\6\4\35\1\30\1\35"+
			"\17\30\1\27\12\30\1\22\1\35\1\23\uff82\35",
			"\1\36\3\uffff\1\40\4\uffff\1\37",
			"\12\42",
			"\1\43\1\44\1\uffff\1\45\2\uffff\1\46\1\47",
			"\1\50\1\uffff\1\50\2\uffff\12\51",
			"\1\52\1\uffff\1\52\2\uffff\12\53",
			"\1\54\1\uffff\1\54\2\uffff\12\55",
			"\1\56\1\uffff\1\56\2\uffff\12\57",
			"\1\60\1\uffff\1\60\2\uffff\12\61",
			"\12\62",
			"\12\63",
			"",
			"",
			"",
			"\1\67\4\uffff\1\67",
			"",
			"",
			"\12\74",
			"",
			"",
			"",
			"",
			"",
			"\1\102",
			"",
			"\1\74\1\uffff\12\104\13\uffff\1\74\37\uffff\1\74",
			"",
			"\0\106",
			"\47\107\1\uffff\uffd8\107",
			"",
			"\1\110\1\111\1\112\1\113",
			"\1\114\1\115\2\uffff\1\116\1\117\1\120\1\121",
			"\1\122\1\123\1\124",
			"",
			"\12\125",
			"\1\126\2\uffff\1\127\1\130\1\131\1\132\1\uffff\1\133\1\134",
			"\1\135\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\12\51\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\53\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\55\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\57\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\61\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\62\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\63\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
			"\1\144",
			"",
			"\1\74\1\uffff\12\104\13\uffff\1\74\37\uffff\1\74",
			"",
			"",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\42\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\1\156",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\157",
			"\1\160",
			"\1\161",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			""
	};

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( GCODESCOORD | GCODESFAST | GCODESINT | GCODESINTCIRC | GCODESCOMP | GCODESF | GCODESS | TCODES | MCODES | XCOORD | YCOORD | ZCOORD | ICOORD | JCOORD | SCODES | FCODES | ADD | SUB | MUL | DIV | COMMA | SC | DOT | LB | RB | EQ | LP | RP | PACKAGE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA34_28 = input.LA(1);
						s = -1;
						if ( ((LA34_28 >= '\u0000' && LA34_28 <= '&')||(LA34_28 >= '(' && LA34_28 <= '\uFFFF')) ) {s = 71;}
						else s = 29;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA34_27 = input.LA(1);
						s = -1;
						if ( ((LA34_27 >= '\u0000' && LA34_27 <= '\uFFFF')) ) {s = 70;}
						else s = 29;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA34_0 = input.LA(1);
						s = -1;
						if ( (LA34_0=='G') ) {s = 1;}
						else if ( (LA34_0=='T') ) {s = 2;}
						else if ( (LA34_0=='M') ) {s = 3;}
						else if ( (LA34_0=='X') ) {s = 4;}
						else if ( (LA34_0=='Y') ) {s = 5;}
						else if ( (LA34_0=='Z') ) {s = 6;}
						else if ( (LA34_0=='I') ) {s = 7;}
						else if ( (LA34_0=='J') ) {s = 8;}
						else if ( (LA34_0=='S') ) {s = 9;}
						else if ( (LA34_0=='F') ) {s = 10;}
						else if ( (LA34_0=='+') ) {s = 11;}
						else if ( (LA34_0=='-') ) {s = 12;}
						else if ( (LA34_0=='*') ) {s = 13;}
						else if ( (LA34_0=='/') ) {s = 14;}
						else if ( (LA34_0==',') ) {s = 15;}
						else if ( (LA34_0==';') ) {s = 16;}
						else if ( (LA34_0=='.') ) {s = 17;}
						else if ( (LA34_0=='{') ) {s = 18;}
						else if ( (LA34_0=='}') ) {s = 19;}
						else if ( (LA34_0=='=') ) {s = 20;}
						else if ( (LA34_0=='(') ) {s = 21;}
						else if ( (LA34_0==')') ) {s = 22;}
						else if ( (LA34_0=='p') ) {s = 23;}
						else if ( ((LA34_0 >= 'A' && LA34_0 <= 'E')||LA34_0=='H'||(LA34_0 >= 'K' && LA34_0 <= 'L')||(LA34_0 >= 'N' && LA34_0 <= 'R')||(LA34_0 >= 'U' && LA34_0 <= 'W')||LA34_0=='_'||(LA34_0 >= 'a' && LA34_0 <= 'o')||(LA34_0 >= 'q' && LA34_0 <= 'z')) ) {s = 24;}
						else if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {s = 25;}
						else if ( ((LA34_0 >= '\t' && LA34_0 <= '\n')||LA34_0=='\r'||LA34_0==' ') ) {s = 26;}
						else if ( (LA34_0=='\"') ) {s = 27;}
						else if ( (LA34_0=='\'') ) {s = 28;}
						else if ( ((LA34_0 >= '\u0000' && LA34_0 <= '\b')||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||(LA34_0 >= '\u000E' && LA34_0 <= '\u001F')||LA34_0=='!'||(LA34_0 >= '#' && LA34_0 <= '&')||LA34_0==':'||LA34_0=='<'||(LA34_0 >= '>' && LA34_0 <= '@')||(LA34_0 >= '[' && LA34_0 <= '^')||LA34_0=='`'||LA34_0=='|'||(LA34_0 >= '~' && LA34_0 <= '\uFFFF')) ) {s = 29;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 34, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
