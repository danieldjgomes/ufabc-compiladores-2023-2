lexer grammar IsidroLangLexer;

KW_DECLARE: 'declare';
KW_PROGRAMA: 'programa';
KW_FIMPROG: 'fimprog';
KW_INICIO: 'inicio';
KW_FIM: 'fim';
KW_LEIA: 'leia';
KW_ESCREVA: 'escreva';
KW_ESCREVALINHA: 'escrevaLinha';
KW_SE: 'se';
KW_SENAO: 'senao';
KW_VERDADE: 'verdade';
KW_FALSO: 'falso';
KW_ENQUANTO: 'enquanto';
KW_PARE: 'pare';
KW_CONTINUE: 'continue';
KW_FACA: 'faça';

KW_TY_INT: 'int';
KW_TY_REAL: 'real';
KW_TY_TXT: 'txt';
KW_TY_BOOL: 'bool';

KW_E: 'e';
KW_OU: 'ou';
KW_NEG: 'neg';

LINE_COMMENT: ('#' (~[/!] | '#') ~[\r\n]* | '#') -> skip;

INT_LITERAL:
	DEC_LITERAL
	| OCT_LITERAL
	| HEX_LITERAL
	| BIN_LITERAL;

FLOAT_LITERAL: DEC_LITERAL ( COMMA DEC_LITERAL)? FLOAT_EXPONENT?;

STR_LITERAL: '"' (~["])* '"';

DEC_LITERAL: DEC_DIGIT (DEC_DIGIT | '_')*;
HEX_LITERAL: '0x' '_'* HEX_DIGIT (HEX_DIGIT | '_')*;
OCT_LITERAL: '0o' '_'* OCT_DIGIT (OCT_DIGIT | '_')*;
BIN_LITERAL: '0b' '_'* [01] [01_]*;

fragment OCT_DIGIT: [0-7];
fragment DEC_DIGIT: [0-9];
fragment HEX_DIGIT: [0-9a-fA-F];
fragment FLOAT_EXPONENT: [eE] [+-]? '_'* DEC_LITERAL;

PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';

DOT: '.';
COLON: ':';
COLONCOLON: '::';
COMMA: ',';
SEMI: ';';

EQ: '=';
NOTEQ: '!=';
MAIOR: '>';
MENOR: '<';
MAIOREQ: '>=';
MENOREQ: '<=';
ATTR: ':=';

LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';

ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\n\r\f]+ -> skip;