grammar decaf;

ID: LETTER (LETTER|DIGIT)*;
NUM: DIGIT DIGIT*;
CHAR: LETTER;
fragment DIGIT: [0-9];
fragment LETTER: ('a'..'z')|('A'..'Z');


program:
            'class' 'Program' '{' declaration* '}'      # initProgram ;
declaration:
            structDeclaration                           # declaraionStruct
           |varDeclaration                              # declarationVar
           |methodDeclaration                           # declarationMethod ;
varDeclaration:
            varType ID ';'                              # notValuedVar
           |varType ID '[' NUM ']' ';'                  # notValuedList;
structDeclaration:
            'struct' ID '{' varDeclaration* '}'         # structDecl;
varType:
            'int'                                       # intVar
           |'char'                                      # charVar
           |'boolean'                                   # boolVar
           |'struct' ID                                 # structVar
           |structDeclaration                           # structDeclVar
           |'void'                                      # voidVar ;
methodDeclaration:
            methodType ID '(' parameter* ')' block      # methodDecl;
methodType:
            'int'                                       # intMeth
           |'char'                                      # charMeth
           |'boolean'                                   # boolMeth
           |'void'                                      # voidMeth;
parameter:
            parameterType ID                            # paramType
           |parameterType ID '[' ']'                    # paramListType;
parameterType:
            'int'                                       # intParam
           |'char'                                      # charParam
           |'boolean'                                   # boolParam;
block:
            '{' varDeclaration* statement* '}'          # blockDecl;
statement:
            'if' '(' expression* ')' block              # ifDeclStm
           |'if' '(' expression* ')' block 'else' block # ifElseDeclStm
           |'while' '(' expression')' block             # whileDeclStm
           |'return' ';'                                # returnStm
           |'return' expression';'                      # returnTypeStm
           |methodCall ';'                              # callMethodStm
           |block                                       # blockStm
           |location '=' expression                     # assignStm
           |';'                                         # endStm
           |expression ';'                              # expressionStm;
location:
            (ID | ID '[' expression']')                 # expressionLoc
           |(ID | ID '[' expression ']') '.' location   # expressionLocLoc;

expression:
            location                                    # locationExp
           |methodCall                                  # methodExp
           |literal                                     # literalExp
           |expression op=('*'|'/'|'%') expression      # firstArithOpExp
           |expression op=('+'|'-') expression          # secondArithOpExp
           |expression op=('<'|'>'|'<='|'>=') expression# relOpExp
           |expression op=('=='|'!=') expression        # eqOpExp
           |expression op=('&&'|'||') expression        # condOpExp
           |'-' expression                              # dashExp
           |'!' expression                              # notExp
           |'(' expression ')'                          # parentExp;

methodCall:
            ID '(' arg (','arg)*')'                     # methodWithParam
           |ID '(' ')'                                  # methodNoParam ;
arg:
            expression                                  # expressionArg ;

literal:
            int_literal                                 # literalInt
           |char_literal                                # literalChar
           |bool_literal                                # literalBool ;
int_literal:
            NUM                                         # literalIntDef;
char_literal:
            '\'' CHAR '\''                              # literalCharDef;
bool_literal:
            'true'                                      # trueLiteralBoolDef
           |'false'                                     # falseLiteralBoolDef;

WS : [ \t\r\n]+ -> skip;
