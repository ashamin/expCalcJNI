package testing;

import org.antlr.runtime.*;
import parser.exprLexer;
import parser.exprParser;

public class ExpressionCalculator {
	
    public static void main(String[] args) throws Exception {
        //init of input stream
    	ANTLRStringStream in = new ANTLRStringStream("12*(5-6)+9/7+6");
        
    	//init of lexer and parser
        exprLexer lexer = new exprLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        exprParser parser = new exprParser(tokens);
        
        //print result of parsing and computing expression
        System.out.println(parser.expression());
    }
    
}
