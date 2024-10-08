package compiler.frontend;


//----------------------------------------------------
// The following code was generated by CUP v0.11b 20140808 (SVN rev 54)
//----------------------------------------------------

/** CUP generated interface containing symbol constants. */
public interface sym {
  /* terminals */
  public static final int SLASH_DOT = 12;
  public static final int PLUS_DOT = 10;
  public static final int prec_app = 35;
  public static final int LESS_MINUS = 28;
  public static final int LPAREN = 30;
  public static final int GREATER = 18;
  public static final int INT = 3;
  public static final int LESS = 17;
  public static final int MINUS = 7;
  public static final int prec_unary_minus = 34;
  public static final int LESS_GREATER = 14;
  public static final int REC = 24;
  public static final int RPAREN = 31;
  public static final int NOT = 6;
  public static final int SEMICOLON = 29;
  public static final int MINUS_DOT = 9;
  public static final int IN = 23;
  public static final int BOOL = 2;
  public static final int COMMA = 25;
  public static final int prec_let = 32;
  public static final int LESS_EQUAL = 15;
  public static final int PLUS = 8;
  public static final int IF = 19;
  public static final int DOT = 27;
  public static final int AST_DOT = 11;
  public static final int EOF = 0;
  public static final int EQUAL = 13;
  public static final int GREATER_EQUAL = 16;
  public static final int error = 1;
  public static final int ARRAY_CREATE = 26;
  public static final int IDENT = 5;
  public static final int ELSE = 21;
  public static final int prec_if = 33;
  public static final int LET = 22;
  public static final int FLOAT = 4;
  public static final int THEN = 20;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "BOOL",
  "INT",
  "FLOAT",
  "IDENT",
  "NOT",
  "MINUS",
  "PLUS",
  "MINUS_DOT",
  "PLUS_DOT",
  "AST_DOT",
  "SLASH_DOT",
  "EQUAL",
  "LESS_GREATER",
  "LESS_EQUAL",
  "GREATER_EQUAL",
  "LESS",
  "GREATER",
  "IF",
  "THEN",
  "ELSE",
  "LET",
  "IN",
  "REC",
  "COMMA",
  "ARRAY_CREATE",
  "DOT",
  "LESS_MINUS",
  "SEMICOLON",
  "LPAREN",
  "RPAREN",
  "prec_let",
  "prec_if",
  "prec_unary_minus",
  "prec_app"
  };

  /* non terminals */
  static final int elems = 0;
  static final int pat = 3;
  static final int fundef = 4;
  static final int simple_exp = 5;
  static final int formal_args = 2;
  static final int exp = 6;
  static final int actual_args = 1;
}

