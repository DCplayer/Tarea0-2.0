grammar decaf;

ID: LETTER (LETTER|DIGIT)*;
NUM: DIGIT DIGIT*;
CHAR: LETTER;
fragment DIGIT: [0-9];
fragment LETTER: ('a'..'z')|('A'..'Z');


program:
            'class' 'Program' '{' declaration* '}';
declaration:
            structDeclaration
           |varDeclaration
           |methodDeclaration;
varDeclaration:
            varType ID ';'
           |varType ID '[' NUM ']' ';';
structDeclaration:
            'struct' ID '{' varDeclaration* '}';
varType:
            'int'
           |'char'
           |'boolean'
           |'struct' ID
           |structDeclaration
           |'void';
methodDeclaration:
            methodType ID '(' parameter* ')' block;
methodType:
            'int'
           |'char'
           |'boolean'
           |'void';
parameter:
            parameterType ID
           |parameterType ID '[' ']';
parameterType:
            'int'
           |'char'
           |'boolean';
block:
            '{' varDeclaration* statement* '}';
statement:
            'if' '(' expression* ')' block |'if' '(' expression* ')' block 'else' block
           |'while' '(' expression')' block
           |'return' ';' |'return' expression';'
           |methodCall ';'
           |block
           |location '=' expression
           |';' |expression ';';
location:
            (ID | ID '[' expression']')
           |(ID | ID '[' expression ']') '.' location;

expression:
            location
           |methodCall
           |literal
           |expression op=('*'|'/'|'%') expression
           |expression op=('+'|'-') expression
           |expression op=('<'|'>'|'<='|'>=') expression
           |expression op=('=='|'!=') expression
           |expression op=('&&'|'||') expression
           |'-' expression
           |'!' expression
           |'(' expression ')';

methodCall:
            ID '(' arg (','arg)*')' | ID '(' ')';
arg:
            expression;

literal:
            int_literal
           |char_literal
           |bool_literal;
int_literal:
            NUM;
char_literal:
            '\'' CHAR '\'';
bool_literal:
            'true'
           |'false';

WS : [ \t\r\n]+ -> skip;
