grammar decaf;

prog: ID;
ID: LETTER (LETTER|DIGIT)*;
NUM: DIGIT DIGIT*;
CHAR: LETTER;
fragment DIGIT: [0-9];
fragment LETTER: ('a'..'z')|('A'..'Z');


PROGRAM:
            'class' 'Program' '{' DECLARATION* '}';
DECLARATION:
            STRUCTDECLARATION
           |VARDECLARATION
           |METHODDECLARATION;
VARDECLARATION:
            VARTYPE ID ';'
           |VARTYPE ID '[' NUM ']' ';';
STRUCTDECLARATION:
            'struct' ID '{' VARDECLARATION* '}';
VARTYPE:
            'int'
           |'char'
           |'boolean'
           |'struct' ID
           |STRUCTDECLARATION
           |'void';
METHODDECLARATION:
            METHODTYPE ID '(' PARAMETER* ')' BLOCK;
METHODTYPE:
            'int'
           |'char'
           |'boolean'
           |'void';
PARAMETER:
            PARAMETERTYPE ID
           |PARAMETERTYPE ID '[' ']';
PARAMETERTYPE:
            'int'
           |'char'
           |'boolean';
BLOCK:
            '{' VARDECLARATION* STATEMENT* '}';
STATEMENT:
            'if' '(' EXPRESSION* ')' BLOCK |'if' '(' EXPRESSION* ')' BLOCK 'else' BLOCK
           |'while' '(' EXPRESSION ')' BLOCK
           |'return' ';' |'return' EXPRESSION ';'
           |METHODCALL ';'
           |BLOCK
           |LOCATION '=' EXPRESSION
           |';' |EXPRESSION ';';
LOCATION:
            (ID | ID '[' EXPRESSION ']')
           |(ID | ID '[' EXPRESSION ']') '.' LOCATION;
EXPRESSION:
            LOCATION COMPLEMENTOEXPRESSION
           |METHODCALL COMPLEMENTOEXPRESSION
           |LITERAL COMPLEMENTOEXPRESSION
           |'-' EXPRESSION COMPLEMENTOEXPRESSION
           |'!' EXPRESSION COMPLEMENTOEXPRESSION
           |'(' EXPRESSION ')' COMPLEMENTOEXPRESSION;
COMPLEMENTOEXPRESSION:
            OP EXPRESSION
           |WS;
METHODCALL:
            ID '(' ARG (','ARG)*')' | ID '(' ')';
ARG:
            EXPRESSION;
OP:
            ARITH_OP
           |REL_OP
           |EQ_OP
           |COND_OP;
ARITH_OP:
            '+'
           |'-'
           |'*'
           |'/'
           |'%';
REL_OP:
           '<'
           |'>'
           |'<='
           |'>=';
EQ_OP:
            '=='
           |'!=';
COND_OP:
            '&&'
           |'||';
LITERAL:
            INT_LITERAL
           |CHAR_LITERAL
           |BOOL_LITERAL;
INT_LITERAL:
            NUM;
CHAR_LITERAL:
            '\'' CHAR '\'';
BOOL_LITERAL:
            'true'
           |'false';

WS : [ \t\r\n]+ -> skip;