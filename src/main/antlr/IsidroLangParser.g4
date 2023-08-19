parser grammar IsidroLangParser;

options {
	tokenVocab = IsidroLangLexer;
}

// entry point
prog: KW_PROGRAMA (sttm)* KW_FIMPROG;

bloco: COLON (sttm)* KW_FIM;

sttm:
	DOT
	| declareUmSttm
	| declareSttm
	| seSttm
	| facaEnquantoSttm
	| enquantoSttm
	| leiaSttm
	| escrevaSttm
	| escrevaLinhaSttm
	| attrSttm
	| exprSttm
	| KW_CONTINUE DOT // continue
    | KW_PARE DOT; // pare;

declareSttm: KW_DECLARE ID (COMMA ID)* (ATTR expr)? DOT;

declareUmSttm: KW_DECLARE ID (COLONCOLON tipo)? (ATTR expr)? DOT;

tipo: KW_TY_BOOL | KW_TY_INT | KW_TY_REAL | KW_TY_TXT;

seSttm:
	KW_SE LPAREN expr RPAREN COLON (sttm)* (
		KW_SENAO (COLON (sttm)* KW_FIM | seSttm)
		| KW_FIM
	)*;

enquantoSttm: KW_ENQUANTO LPAREN expr RPAREN COLON (sttm)* KW_FIM;

facaEnquantoSttm: KW_FACA COLON (sttm)* KW_FIM KW_ENQUANTO LPAREN expr RPAREN DOT;

leiaSttm: KW_LEIA LPAREN ID RPAREN DOT;
escrevaSttm: KW_ESCREVA LPAREN expr RPAREN DOT;
escrevaLinhaSttm: KW_ESCREVALINHA LPAREN expr RPAREN DOT;
attrSttm: ID ATTR expr DOT;

exprSttm: expr DOT;

expr:
	literalExpr
	| negExpr // Negação
	| expr (STAR | SLASH) expr // Expressão matemática: mult e div
	| expr (PLUS | MINUS) expr // Expressão matemática: soma e sub
	| expr cmpOp expr // Expressão de comparação
	| expr KW_E expr // Expressão Lógica E
	| expr KW_OU expr // Expressão Lógica OU
	| compoundExpr // Expressão entre parênteses/composta
	| ID; // Identificador

literalExpr:
	FLOAT_LITERAL
	| INT_LITERAL
	| STR_LITERAL
	| KW_VERDADE
	| KW_FALSO;

compoundExpr:  LPAREN expr RPAREN;

negExpr: KW_NEG expr;

cmpOp: EQ | NOTEQ | MAIOR | MENOR | MAIOREQ | MENOREQ;