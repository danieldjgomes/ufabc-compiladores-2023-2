// Generated from /Users/grayjack/Documents/Sources/JavaProjects/compiladores-2023/src/main/antlr/IsidroLangParser.g4 by ANTLR 4.12.0
package interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsidroLangParser}.
 */
public interface IsidroLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IsidroLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IsidroLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsidroLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsidroLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#sttm}.
	 * @param ctx the parse tree
	 */
	void enterSttm(IsidroLangParser.SttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#sttm}.
	 * @param ctx the parse tree
	 */
	void exitSttm(IsidroLangParser.SttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#declareSttm}.
	 * @param ctx the parse tree
	 */
	void enterDeclareSttm(IsidroLangParser.DeclareSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#declareSttm}.
	 * @param ctx the parse tree
	 */
	void exitDeclareSttm(IsidroLangParser.DeclareSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#declareUmSttm}.
	 * @param ctx the parse tree
	 */
	void enterDeclareUmSttm(IsidroLangParser.DeclareUmSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#declareUmSttm}.
	 * @param ctx the parse tree
	 */
	void exitDeclareUmSttm(IsidroLangParser.DeclareUmSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(IsidroLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(IsidroLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#seSttm}.
	 * @param ctx the parse tree
	 */
	void enterSeSttm(IsidroLangParser.SeSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#seSttm}.
	 * @param ctx the parse tree
	 */
	void exitSeSttm(IsidroLangParser.SeSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#enquantoSttm}.
	 * @param ctx the parse tree
	 */
	void enterEnquantoSttm(IsidroLangParser.EnquantoSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#enquantoSttm}.
	 * @param ctx the parse tree
	 */
	void exitEnquantoSttm(IsidroLangParser.EnquantoSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#facaEnquantoSttm}.
	 * @param ctx the parse tree
	 */
	void enterFacaEnquantoSttm(IsidroLangParser.FacaEnquantoSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#facaEnquantoSttm}.
	 * @param ctx the parse tree
	 */
	void exitFacaEnquantoSttm(IsidroLangParser.FacaEnquantoSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#leiaSttm}.
	 * @param ctx the parse tree
	 */
	void enterLeiaSttm(IsidroLangParser.LeiaSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#leiaSttm}.
	 * @param ctx the parse tree
	 */
	void exitLeiaSttm(IsidroLangParser.LeiaSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#escrevaSttm}.
	 * @param ctx the parse tree
	 */
	void enterEscrevaSttm(IsidroLangParser.EscrevaSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#escrevaSttm}.
	 * @param ctx the parse tree
	 */
	void exitEscrevaSttm(IsidroLangParser.EscrevaSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#escrevaLinhaSttm}.
	 * @param ctx the parse tree
	 */
	void enterEscrevaLinhaSttm(IsidroLangParser.EscrevaLinhaSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#escrevaLinhaSttm}.
	 * @param ctx the parse tree
	 */
	void exitEscrevaLinhaSttm(IsidroLangParser.EscrevaLinhaSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#attrSttm}.
	 * @param ctx the parse tree
	 */
	void enterAttrSttm(IsidroLangParser.AttrSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#attrSttm}.
	 * @param ctx the parse tree
	 */
	void exitAttrSttm(IsidroLangParser.AttrSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#exprSttm}.
	 * @param ctx the parse tree
	 */
	void enterExprSttm(IsidroLangParser.ExprSttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#exprSttm}.
	 * @param ctx the parse tree
	 */
	void exitExprSttm(IsidroLangParser.ExprSttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsidroLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsidroLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(IsidroLangParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(IsidroLangParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#compoundExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpr(IsidroLangParser.CompoundExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#compoundExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpr(IsidroLangParser.CompoundExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#negExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(IsidroLangParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#negExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(IsidroLangParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsidroLangParser#cmpOp}.
	 * @param ctx the parse tree
	 */
	void enterCmpOp(IsidroLangParser.CmpOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsidroLangParser#cmpOp}.
	 * @param ctx the parse tree
	 */
	void exitCmpOp(IsidroLangParser.CmpOpContext ctx);
}