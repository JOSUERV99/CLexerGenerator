// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: clexergenerator/CLexerSpec.flex

package clexergenerator;

import types.Token;
import types.OperatorToken;
import types.KeywordToken;
import types.LiteralToken;
import types.IdentifierToken;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class GeneratedLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\40\0\1\4\1\5\1\6\1\0\1\7\3\0\1\10"+
    "\5\0\1\11\1\12\2\0\1\13\1\14\2\0\1\15"+
    "\11\0\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\0\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\0\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\u0185\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\27\1\22\0\1\3\4\0\1\3"+
    "\171\0\1\4\6\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[180];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\114\0\162\0\230\0\276\0\344"+
    "\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344"+
    "\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\u0428\0\u044e\0\u0474"+
    "\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532\0\u0558\0\u057e\0\u05a4"+
    "\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u0662\0\u0688\0\u06ae\0\u06d4"+
    "\0\u06fa\0\u0720\0\u0746\0\114\0\u076c\0\u0792\0\u07b8\0\u07de"+
    "\0\u0804\0\u082a\0\u0850\0\u0876\0\u089c\0\u08c2\0\u08e8\0\u090e"+
    "\0\u0934\0\u095a\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u0a18\0\u0a3e"+
    "\0\u0a64\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc\0\u0b22\0\u0b48\0\u0b6e"+
    "\0\u0b94\0\u0bba\0\u0be0\0\u0c06\0\u0c2c\0\u0c52\0\u0c78\0\u0c9e"+
    "\0\u0cc4\0\u0cea\0\u0d10\0\u0d36\0\u0d5c\0\u0d82\0\u0da8\0\u0dce"+
    "\0\u0df4\0\u0e1a\0\u0e40\0\u0e66\0\u0e8c\0\u0eb2\0\u0ed8\0\u0efe"+
    "\0\u0f24\0\u0f4a\0\u0f70\0\u0f96\0\u0fbc\0\u0fe2\0\u1008\0\u102e"+
    "\0\u1054\0\u107a\0\u10a0\0\u10c6\0\u10ec\0\u1112\0\u1138\0\u115e"+
    "\0\u1184\0\u11aa\0\u11d0\0\u11f6\0\u121c\0\u1242\0\u1268\0\u128e"+
    "\0\u12b4\0\u12da\0\u1300\0\u1326\0\u134c\0\u1372\0\u1398\0\u13be"+
    "\0\u13e4\0\u140a\0\u1430\0\u1456\0\u147c\0\u14a2\0\u14c8\0\u14ee"+
    "\0\u1514\0\u153a\0\u1560\0\u1586\0\u15ac\0\u15d2\0\u15f8\0\u161e"+
    "\0\u1644\0\u166a\0\u1690\0\u16b6\0\u16dc\0\u1702\0\u1728\0\u174e"+
    "\0\u1774\0\u179a\0\u17c0\0\u17e6\0\u180c\0\u1832\0\u1858\0\u187e"+
    "\0\u18a4\0\u18ca\0\u18f0\0\u1916\0\u193c\0\114\0\u1962\0\u1988"+
    "\0\u19ae\0\u19d4\0\u19fa\0\u1a20";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[180];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\7\1\10\1\3\1\11"+
    "\1\3\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\3\1\25\1\3\1\26"+
    "\4\3\1\27\1\30\1\31\1\32\1\33\1\34\51\3"+
    "\50\0\1\4\100\0\1\35\1\36\35\0\1\37\52\0"+
    "\1\40\1\0\1\41\42\0\1\42\46\0\1\43\1\0"+
    "\1\44\32\0\1\45\2\0\1\46\42\0\1\47\60\0"+
    "\1\50\50\0\1\51\42\0\1\52\26\0\1\53\6\0"+
    "\1\54\5\0\1\55\34\0\1\56\10\0\1\57\42\0"+
    "\1\53\1\0\1\60\10\0\1\61\32\0\1\62\2\0"+
    "\1\63\45\0\1\51\35\0\1\64\6\0\1\65\46\0"+
    "\1\66\34\0\1\67\50\0\1\70\1\71\10\0\1\72"+
    "\2\0\1\73\47\0\1\74\33\0\1\75\46\0\1\76"+
    "\37\0\1\77\46\0\1\100\45\0\1\101\51\0\1\102"+
    "\44\0\1\103\47\0\1\104\50\0\1\105\35\0\1\106"+
    "\52\0\1\107\46\0\1\110\37\0\1\111\54\0\1\37"+
    "\26\0\1\112\66\0\1\113\30\0\1\114\61\0\1\115"+
    "\25\0\1\63\61\0\1\116\36\0\1\117\62\0\1\120"+
    "\45\0\1\121\44\0\1\122\41\0\1\123\47\0\1\64"+
    "\47\0\1\64\40\0\1\124\37\0\1\125\12\0\1\126"+
    "\41\0\1\127\36\0\1\130\20\0\1\131\16\0\1\132"+
    "\16\0\1\133\36\0\1\134\53\0\1\135\37\0\1\136"+
    "\7\0\1\137\35\0\1\140\1\0\1\141\43\0\1\142"+
    "\56\0\1\143\32\0\1\144\37\0\1\145\63\0\1\146"+
    "\47\0\1\147\46\0\1\150\40\0\1\151\47\0\1\144"+
    "\27\0\1\152\52\0\1\153\56\0\1\154\44\0\1\64"+
    "\30\0\1\155\51\0\1\64\61\0\1\65\1\156\24\0"+
    "\1\157\46\0\1\142\57\0\1\64\36\0\1\160\41\0"+
    "\1\65\53\0\1\64\47\0\1\161\57\0\1\160\42\0"+
    "\1\65\42\0\1\162\35\0\1\163\62\0\1\164\46\0"+
    "\1\165\44\0\1\166\30\0\1\167\56\0\1\170\40\0"+
    "\1\171\40\0\1\64\42\0\1\172\57\0\1\115\46\0"+
    "\1\173\25\0\1\174\71\0\1\175\26\0\1\176\65\0"+
    "\1\177\44\0\1\200\47\0\1\201\43\0\1\202\47\0"+
    "\1\144\42\0\1\203\40\0\1\64\44\0\1\204\57\0"+
    "\1\205\42\0\1\170\46\0\1\206\31\0\1\140\56\0"+
    "\1\207\40\0\1\210\37\0\1\65\45\0\1\211\46\0"+
    "\1\212\56\0\1\64\37\0\1\130\60\0\1\77\30\0"+
    "\1\213\57\0\1\214\55\0\1\144\36\0\1\215\14\0"+
    "\1\216\101\0\1\217\27\0\1\220\41\0\1\221\51\0"+
    "\1\222\55\0\1\223\43\0\1\65\54\0\1\224\31\0"+
    "\1\64\42\0\1\64\52\0\1\64\42\0\1\207\62\0"+
    "\1\225\30\0\1\226\45\0\1\144\61\0\1\227\27\0"+
    "\1\230\62\0\1\144\47\0\1\231\43\0\1\232\50\0"+
    "\1\115\27\0\1\63\51\0\1\233\54\0\1\234\36\0"+
    "\1\235\56\0\1\236\41\0\1\220\23\0\1\237\54\0"+
    "\1\144\43\0\1\240\34\0\1\241\16\0\1\242\47\0"+
    "\1\243\53\0\1\244\50\0\1\245\34\0\1\246\23\0"+
    "\1\247\74\0\1\250\34\0\1\251\56\0\1\252\44\0"+
    "\1\144\50\0\1\253\42\0\1\254\50\0\1\255\45\0"+
    "\1\256\36\0\1\153\26\0\1\257\54\0\1\260\61\0"+
    "\1\261\52\0\1\262\27\0\1\144\57\0\1\263\47\0"+
    "\1\264\46\0\1\256\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6726];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\30\1\22\0\1\1\4\0\1\11\171\0"+
    "\1\11\6\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[180];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
	/*class content*/


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  GeneratedLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) throws IllegalTokenException {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new IllegalTokenException(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  throws IllegalTokenException {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException, IllegalTokenException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new IllegalTokenException("Illegal character <" + yytext() + ">" + "[" + yyline + "," + yycolumn + "]");
            }
            // fall through
          case 5: break;
          case 2:
            { /* do nothing */
            }
            // fall through
          case 6: break;
          case 3:
            { return new KeywordToken(yyline, yycolumn, yytext());
            }
            // fall through
          case 7: break;
          case 4:
            { return new OperatorToken(yyline, yycolumn, yytext());
            }
            // fall through
          case 8: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
