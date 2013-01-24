package parser;

// $ANTLR 3.4 generated parser

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import math.CMath;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class exprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DoubleConst", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'"
    }; 

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int DoubleConst=4;
    public static final int WS=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public exprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public exprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return exprParser.tokenNames; }
    public String getGrammarFileName() { return "expr.g"; }


    	CMath cmath = new CMath();



    // $ANTLR start "expression"
    //  expression returns [double expr] : expR= a1 ;
    public final double expression() throws RecognitionException {
        double expr = 0.0;


        double expR =0.0;


        try {
            //  (expR= a1 )
            //  expR= a1
            {
            pushFollow(FOLLOW_a1_in_expression31);
            expR=a1();

            state._fsp--;


            expr = expR;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "expression"



    // $ANTLR start "a1"
    //  a1 returns [double expr] : exp1= a2 ( '+' expTmp= a2 | '-' expTmp= a2 )* ;
    public final double a1() throws RecognitionException {
        double expr = 0.0;


        double exp1 =0.0;

        double expTmp =0.0;


        try {
            //  (exp1= a2 ( '+' expTmp= a2 | '-' expTmp= a2 )* )
            //  exp1= a2 ( '+' expTmp= a2 | '-' expTmp= a2 )*
            {
            pushFollow(FOLLOW_a2_in_a161);
            exp1=a2();

            state._fsp--;


            expr =  exp1;

            //  ( '+' expTmp= a2 | '-' expTmp= a2 )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }
                else if ( (LA1_0==10) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    //  '+' expTmp= a2
            	    {
            	    match(input,9,FOLLOW_9_in_a185); 

            	    pushFollow(FOLLOW_a2_in_a189);
            	    expTmp=a2();

            	    state._fsp--;


            	    expr = cmath.plus(expr, expTmp);

            	    }
            	    break;
            	case 2 :
            	    //  '-' expTmp= a2
            	    {
            	    match(input,10,FOLLOW_10_in_a1107); 

            	    pushFollow(FOLLOW_a2_in_a1111);
            	    expTmp=a2();

            	    state._fsp--;


            	    expr = cmath.minus(expr, expTmp);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "a1"



    // $ANTLR start "a2"
    //  a2 returns [double expr] : exp2= simpleExpr ( '*' expTmp= simpleExpr | '/' expTmp= simpleExpr )* ;
    public final double a2() throws RecognitionException {
        double expr = 0.0;


        double exp2 =0.0;

        double expTmp =0.0;


        try {
            //  (exp2= simpleExpr ( '*' expTmp= simpleExpr | '/' expTmp= simpleExpr )* )
            //  exp2= simpleExpr ( '*' expTmp= simpleExpr | '/' expTmp= simpleExpr )*
            {
            pushFollow(FOLLOW_simpleExpr_in_a2158);
            exp2=simpleExpr();

            state._fsp--;


            expr =  exp2;

            //  ( '*' expTmp= simpleExpr | '/' expTmp= simpleExpr )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==8) ) {
                    alt2=1;
                }
                else if ( (LA2_0==11) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    //  '*' expTmp= simpleExpr
            	    {
            	    match(input,8,FOLLOW_8_in_a2179); 

            	    pushFollow(FOLLOW_simpleExpr_in_a2183);
            	    expTmp=simpleExpr();

            	    state._fsp--;


            	    expr = cmath.mult(expr, expTmp);

            	    }
            	    break;
            	case 2 :
            	    //  '/' expTmp= simpleExpr
            	    {
            	    match(input,11,FOLLOW_11_in_a2200); 

            	    pushFollow(FOLLOW_simpleExpr_in_a2204);
            	    expTmp=simpleExpr();

            	    state._fsp--;


            	    expr = cmath.div(expr, expTmp);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "a2"



    // $ANTLR start "simpleExpr"
    // simpleExpr returns [double expr] : (sExpr= DoubleConst | '(' exp= a1 ')' );
    public final double simpleExpr() throws RecognitionException {
        double expr = 0.0;


        Token sExpr=null;
        double exp =0.0;


        try {
            //  (sExpr= DoubleConst | '(' exp= a1 ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DoubleConst) ) {
                alt3=1;
            }
            else if ( (LA3_0==6) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    //  sExpr= DoubleConst
                    {
                    sExpr=(Token)match(input,DoubleConst,FOLLOW_DoubleConst_in_simpleExpr247); 

                    expr = Double.parseDouble((sExpr!=null?sExpr.getText():null));

                    }
                    break;
                case 2 :
                    // '(' exp= a1 ')'
                    {
                    match(input,6,FOLLOW_6_in_simpleExpr265); 

                    pushFollow(FOLLOW_a1_in_simpleExpr269);
                    exp=a1();

                    state._fsp--;


                    match(input,7,FOLLOW_7_in_simpleExpr271); 

                    expr = exp;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "simpleExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_a1_in_expression31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_a2_in_a161 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_9_in_a185 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_a2_in_a189 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_10_in_a1107 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_a2_in_a1111 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_simpleExpr_in_a2158 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_8_in_a2179 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_simpleExpr_in_a2183 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_11_in_a2200 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_simpleExpr_in_a2204 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_DoubleConst_in_simpleExpr247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_simpleExpr265 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_a1_in_simpleExpr269 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_simpleExpr271 = new BitSet(new long[]{0x0000000000000002L});

}