grammar expr;

@parser::members{
	CMath cmath = new CMath();
}

expression returns [double expr]
    :    expR=a1 		{$expr = $expR.expr;}
    ;

a1 returns [double expr]
    :    exp1=a2       		{$expr =  $exp1.expr;} 
         ( '+' expTmp=a2 		{$expr = cmath.plus($expr, $expTmp.expr);} 
         | '-' expTmp=a2 		{$expr = cmath.minus($expr, $expTmp.expr);}
         )* 
    ;
    
a2 returns [double expr]
    :    exp2=simpleExpr      	{$expr =  $exp2.expr;}
         ( '*' expTmp=simpleExpr 	{$expr = cmath.mult($expr, $expTmp.expr);} 
         | '/' expTmp=simpleExpr 	{$expr = cmath.div($expr, $expTmp.expr);}
         )* 
    ;


simpleExpr returns [double expr]
    :    sExpr=DoubleConst      {$expr = Double.parseDouble($sExpr.text);}
    |    '(' exp=a1 ')' 	{$expr = $exp.expr;}
    ;

DoubleConst
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;

WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;