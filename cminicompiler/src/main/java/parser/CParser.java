
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150930 (SVN rev 66)
//----------------------------------------------------

package parser;

import java_cup.runtime.*;
import lexer.CLexer;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150930 (SVN rev 66) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class CParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public CParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public CParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\010\000\002\004" +
    "\005\000\002\004\003\000\002\005\004\000\002\005\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\014\011\004\026\012\027\010\032\006\043" +
    "\005\001\002\000\004\005\ufffa\001\002\000\004\005\ufff7" +
    "\001\002\000\004\005\ufff8\001\002\000\004\005\014\001" +
    "\002\000\004\005\ufff9\001\002\000\004\002\013\001\002" +
    "\000\004\005\ufffb\001\002\000\004\002\001\001\002\000" +
    "\004\113\015\001\002\000\016\004\016\011\004\026\012" +
    "\027\010\032\006\043\005\001\002\000\006\053\ufffc\120" +
    "\ufffc\001\002\000\004\005\026\001\002\000\006\053\024" +
    "\120\ufffe\001\002\000\004\120\022\001\002\000\004\121" +
    "\023\001\002\000\004\002\000\001\002\000\016\004\016" +
    "\011\004\026\012\027\010\032\006\043\005\001\002\000" +
    "\004\120\uffff\001\002\000\006\053\ufffd\120\ufffd\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\006\002\010\003\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\016\004\020" +
    "\005\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\016\004\024\005\017\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$CParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
  
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return this.s.next_token(); 
    }


    // Connect this parser to a scanner!
    CLexer s;
    CParser() {}

    public void setLexer(CLexer lexer) {
        this.s = lexer;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$CParser$actions {
  private final CParser parser;

  /** Constructor */
  CUP$CParser$actions(CParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$CParser$do_action_part00000000(
    int                        CUP$CParser$act_num,
    java_cup.runtime.lr_parser CUP$CParser$parser,
    java.util.Stack            CUP$CParser$stack,
    int                        CUP$CParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CParser$result;

      /* select the action based on the action number */
      switch (CUP$CParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= function_declaration EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$CParser$stack.elementAt(CUP$CParser$top-1)).value;
		RESULT = start_val;
              CUP$CParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-1)), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CParser$parser.done_parsing();
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // function_declaration ::= keyword_types IDENT OP_WRAPPERPARENTHESISLEFT parameters OP_WRAPPERKEYPARENTHESISRIGHT OP_INSTRUCTIONENDOPERATOR 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-2)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$CParser$stack.elementAt(CUP$CParser$top-2)).value;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("function_declaration",0, ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-5)), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // parameters ::= parameter OP_COMMA parameters 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("parameters",2, ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-2)), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // parameters ::= parameter 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("parameters",2, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // parameter ::= keyword_types IDENT 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$CParser$stack.peek()).value;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("parameter",3, ((java_cup.runtime.Symbol)CUP$CParser$stack.elementAt(CUP$CParser$top-1)), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // parameter ::= EPSYLON 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("parameter",3, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // keyword_types ::= KW_INT 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("keyword_types",1, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // keyword_types ::= KW_CHAR 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("keyword_types",1, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // keyword_types ::= KW_LONG 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("keyword_types",1, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // keyword_types ::= KW_SHORT 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("keyword_types",1, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // keyword_types ::= KW_VOID 
            {
              Object RESULT =null;

              CUP$CParser$result = parser.getSymbolFactory().newSymbol("keyword_types",1, ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CParser$stack.peek()), RESULT);
            }
          return CUP$CParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$CParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$CParser$do_action(
    int                        CUP$CParser$act_num,
    java_cup.runtime.lr_parser CUP$CParser$parser,
    java.util.Stack            CUP$CParser$stack,
    int                        CUP$CParser$top)
    throws java.lang.Exception
    {
              return CUP$CParser$do_action_part00000000(
                               CUP$CParser$act_num,
                               CUP$CParser$parser,
                               CUP$CParser$stack,
                               CUP$CParser$top);
    }
}

}
