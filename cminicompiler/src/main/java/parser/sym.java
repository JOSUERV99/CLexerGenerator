
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package parser;

/** CUP generated interface containing symbol constants. */
public interface sym {
  /* terminals */
  public static final int KW_DOUBLE = 20;
  public static final int KW_SIZEOF = 26;
  public static final int KW_VOLATILE = 33;
  public static final int OP_MULT = 38;
  public static final int NEWLINE = 88;
  public static final int OP_MOD = 39;
  public static final int KW_STRUCT = 28;
  public static final int OP_MINUS = 37;
  public static final int KW_CASE = 4;
  public static final int OP_SHIFTLEFTASSIGN = 66;
  public static final int KW_AUTO = 3;
  public static final int OP_WRAPPERPARENTHESISLEFT = 72;
  public static final int OP_GT = 44;
  public static final int OP_DIV = 35;
  public static final int KW_SHORT = 24;
  public static final int LIT_FLOATVALUE = 82;
  public static final int KW_FOR = 12;
  public static final int OP_LTE = 42;
  public static final int KW_REGISTER = 22;
  public static final int KW_EXTERN = 11;
  public static final int OP_WRAPPERSQUAREPARENTHESISRIGHT = 75;
  public static final int KW_CONST = 16;
  public static final int OP_WRAPPERKEYPARENTHESISRIGHT = 77;
  public static final int KW_INT = 15;
  public static final int OP_POINTEROPERATOR = 79;
  public static final int LIT_DECIMALVALUE = 87;
  public static final int OP_ASIG = 70;
  public static final int LIT_CHARVALUE = 83;
  public static final int KW_ENUM = 10;
  public static final int OP_SHIFTRIGHTASSIGN = 67;
  public static final int KW_SWITCH = 29;
  public static final int OP_WRAPPERPARENTHESISRIGHT = 73;
  public static final int KW_DEFAULT = 5;
  public static final int OP_LT = 43;
  public static final int KW_RETURN = 23;
  public static final int OP_GTE = 41;
  public static final int OP_MINUSMINUSASSIGN = 53;
  public static final int OP_PLUSPLUSASSIGN = 54;
  public static final int OP_PLUSASSIGN = 49;
  public static final int OP_TERNARYOPERATORQUESTIONMARK = 68;
  public static final int KW_FLOAT = 17;
  public static final int KW_GOTO = 13;
  public static final int OP_NOTASSIGN = 64;
  public static final int LIT_STRINGDEF = 85;
  public static final int OP_COMMA = 40;
  public static final int OP_NEGATION = 48;
  public static final int OP_WRAPPERSQUAREPARENTHESISLEFT = 74;
  public static final int EOF = 0;
  public static final int OP_AND = 58;
  public static final int OP_ORCOMP = 46;
  public static final int OP_XOR = 59;
  public static final int OP_TERNARYOPERATIONDOUBLEDOT = 69;
  public static final int OP_POINTEROPERATORASTERISC = 80;
  public static final int KW_DO = 6;
  public static final int OP_MINUSASSIGN = 50;
  public static final int OP_INSTRUCTIONENDOPERATOR = 78;
  public static final int OP_ORASSIGN = 65;
  public static final int LIT_EXPONENTIALDEF = 86;
  public static final int KW_LONG = 21;
  public static final int OP_ANDCOMP = 47;
  public static final int IDENT = 2;
  public static final int error = 1;
  public static final int KW_WHILE = 34;
  public static final int KW_UNION = 31;
  public static final int KW_TYPEDEF = 30;
  public static final int KW_CHAR = 18;
  public static final int OP_DIVASSIGN = 52;
  public static final int OP_MULTASSIGN = 51;
  public static final int KW_VOID = 19;
  public static final int OP_SHIFTOPLEFT = 56;
  public static final int KW_STATIC = 27;
  public static final int KW_ELSE = 7;
  public static final int OP_WRAPPERKEYPARENTHESISLEFT = 76;
  public static final int KW_BREAK = 9;
  public static final int OP_NOTEQUALCOMP = 45;
  public static final int OP_SHIFTOPRIGHT = 55;
  public static final int LIT_OCTALVALUE = 84;
  public static final int KW_SIGNED = 25;
  public static final int OP_EQUALCOMP = 57;
  public static final int OP_ANDASSIGN = 63;
  public static final int KW_IF = 14;
  public static final int KW_CONTINUE = 8;
  public static final int OP_OR = 60;
  public static final int KW_UNSIGNED = 32;
  public static final int LIT_HEXVALUE = 81;
  public static final int OP_PROPOPERATOR = 71;
  public static final int OP_NOT = 61;
  public static final int OP_PLUS = 36;
  public static final int OP_MODASSIGN = 62;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "IDENT",
  "KW_AUTO",
  "KW_CASE",
  "KW_DEFAULT",
  "KW_DO",
  "KW_ELSE",
  "KW_CONTINUE",
  "KW_BREAK",
  "KW_ENUM",
  "KW_EXTERN",
  "KW_FOR",
  "KW_GOTO",
  "KW_IF",
  "KW_INT",
  "KW_CONST",
  "KW_FLOAT",
  "KW_CHAR",
  "KW_VOID",
  "KW_DOUBLE",
  "KW_LONG",
  "KW_REGISTER",
  "KW_RETURN",
  "KW_SHORT",
  "KW_SIGNED",
  "KW_SIZEOF",
  "KW_STATIC",
  "KW_STRUCT",
  "KW_SWITCH",
  "KW_TYPEDEF",
  "KW_UNION",
  "KW_UNSIGNED",
  "KW_VOLATILE",
  "KW_WHILE",
  "OP_DIV",
  "OP_PLUS",
  "OP_MINUS",
  "OP_MULT",
  "OP_MOD",
  "OP_COMMA",
  "OP_GTE",
  "OP_LTE",
  "OP_LT",
  "OP_GT",
  "OP_NOTEQUALCOMP",
  "OP_ORCOMP",
  "OP_ANDCOMP",
  "OP_NEGATION",
  "OP_PLUSASSIGN",
  "OP_MINUSASSIGN",
  "OP_MULTASSIGN",
  "OP_DIVASSIGN",
  "OP_MINUSMINUSASSIGN",
  "OP_PLUSPLUSASSIGN",
  "OP_SHIFTOPRIGHT",
  "OP_SHIFTOPLEFT",
  "OP_EQUALCOMP",
  "OP_AND",
  "OP_XOR",
  "OP_OR",
  "OP_NOT",
  "OP_MODASSIGN",
  "OP_ANDASSIGN",
  "OP_NOTASSIGN",
  "OP_ORASSIGN",
  "OP_SHIFTLEFTASSIGN",
  "OP_SHIFTRIGHTASSIGN",
  "OP_TERNARYOPERATORQUESTIONMARK",
  "OP_TERNARYOPERATIONDOUBLEDOT",
  "OP_ASIG",
  "OP_PROPOPERATOR",
  "OP_WRAPPERPARENTHESISLEFT",
  "OP_WRAPPERPARENTHESISRIGHT",
  "OP_WRAPPERSQUAREPARENTHESISLEFT",
  "OP_WRAPPERSQUAREPARENTHESISRIGHT",
  "OP_WRAPPERKEYPARENTHESISLEFT",
  "OP_WRAPPERKEYPARENTHESISRIGHT",
  "OP_INSTRUCTIONENDOPERATOR",
  "OP_POINTEROPERATOR",
  "OP_POINTEROPERATORASTERISC",
  "LIT_HEXVALUE",
  "LIT_FLOATVALUE",
  "LIT_CHARVALUE",
  "LIT_OCTALVALUE",
  "LIT_STRINGDEF",
  "LIT_EXPONENTIALDEF",
  "LIT_DECIMALVALUE",
  "NEWLINE"
  };
}

