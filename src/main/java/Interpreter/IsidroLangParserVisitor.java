// Generated from /Users/grayjack/Documents/Sources/JavaProjects/compiladores-2023/src/main/antlr/IsidroLangParser.g4 by ANTLR 4.12.0
package interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IsidroLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IsidroLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IsidroLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(IsidroLangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#sttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSttm(IsidroLangParser.SttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#declareSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareSttm(IsidroLangParser.DeclareSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#declareUmSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareUmSttm(IsidroLangParser.DeclareUmSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(IsidroLangParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#seSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeSttm(IsidroLangParser.SeSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#enquantoSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquantoSttm(IsidroLangParser.EnquantoSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#facaEnquantoSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacaEnquantoSttm(IsidroLangParser.FacaEnquantoSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#leiaSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeiaSttm(IsidroLangParser.LeiaSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#escrevaSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrevaSttm(IsidroLangParser.EscrevaSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#escrevaLinhaSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrevaLinhaSttm(IsidroLangParser.EscrevaLinhaSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#attrSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSttm(IsidroLangParser.AttrSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#exprSttm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSttm(IsidroLangParser.ExprSttmContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IsidroLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(IsidroLangParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#compoundExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpr(IsidroLangParser.CompoundExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#negExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(IsidroLangParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IsidroLangParser#cmpOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpOp(IsidroLangParser.CmpOpContext ctx);
}