package isilang;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.TerminalNode;

import interpreter.IsidroLangParser.AttrSttmContext;
import interpreter.IsidroLangParser.DeclareUmSttmContext;
import interpreter.IsidroLangParser.EscrevaLinhaSttmContext;
import interpreter.IsidroLangParser.EscrevaSttmContext;
import interpreter.IsidroLangParser.ExprContext;
import interpreter.IsidroLangParser.LeiaSttmContext;
import interpreter.IsidroLangParser.ProgContext;
import interpreter.IsidroLangParserBaseListener;

/**
 * Essa classe é reponsável para gerar o código em Java. Essa classe assume que
 * não possui erros, a Listener reponsável com isso é a
 * IsidroLangCheckerLisener.
 *
 * Esta classe deve ser usada depois que a árvore sintática foi criada
 */
public class IsidroLang2JavaListener extends IsidroLangParserBaseListener {
    StringBuilder outFile = new StringBuilder();
    String outputFileName;
    HashMap<String, VariableMetadata> variableMap;

    /**
     * Create new transpilation listener.
     *
     * @param outputFileName
     * @param variableMap
     */
    public IsidroLang2JavaListener(String outputFileName, HashMap<String, VariableMetadata> variableMap) {
        this.outputFileName = outputFileName;
        this.variableMap = variableMap;
    }

    @Override
    public void enterProg(ProgContext ctx) {
        // cria base inicial do programa em Java
        outFile.append("// Java program to demonstrate working of Scanner in Java\n");
        outFile.append("import java.util.Scanner;\n\n");
        outFile.append("class Main {\n");
        outFile.append("\tpublic static void main(String args[]) {\n");
        outFile.append("\t\tScanner in = new Scanner(System.in);\n\n");
        outFile.append("\t\ttry {\n");
    }

    @Override
    public void exitProg(ProgContext ctx) {
        outFile.append("\t\t} catch (Exception err) {\n");
        outFile.append("\t\t\tSystem.err.println(err.getMessage());\n");
        outFile.append("\t\t\tin.close();\n");
        outFile.append("\t\t\tSystem.exit(1);\n");
        outFile.append("\t\t}\n");
        outFile.append("\t\tin.close();\n");
        outFile.append("\t}\n");
        outFile.append("}\n");

        try {
            var file = new FileWriter(this.outputFileName, false);
            file.write(this.outFile.toString());

            file.close();
        } catch (IOException err) {
            System.out.println(err);
        }
    }

    @Override
    public void exitExpr(ExprContext ctx) {

        // Apenas lida com a pontas terminais da expressão, já que expressões compostas
        // por mais de uma subexpressão chamam esse método quando chegam em cada
        // subexpressão. Além disso, operadores são lidados no método visitTerminal

        if (ctx.literalExpr() != null) {
            var lit_ctx = ctx.literalExpr();

            if (lit_ctx.KW_FALSO() != null) {
                outFile.append("false");
            } else if (lit_ctx.KW_VERDADE() != null) {
                outFile.append("true");
            } else if (lit_ctx.STR_LITERAL() != null) {
                outFile.append(lit_ctx.STR_LITERAL().getText());
            } else if (lit_ctx.FLOAT_LITERAL() != null) {
                var float_str = lit_ctx.FLOAT_LITERAL().getText();
                var java_float = float_str.replace(',', '.');
                outFile.append(java_float);
            } else if (lit_ctx.INT_LITERAL() != null) {
                var int_str = lit_ctx.INT_LITERAL().getText();
                if (int_str.startsWith("0o")) {
                    // Jesus! octal em Java é estranho pacas!
                    outFile.append("0" + int_str.substring(2));
                } else {
                    outFile.append(int_str);
                }
            }
        } else if (ctx.ID() != null) {
            outFile.append(ctx.ID().getText());
        }
    }

    @Override
    public void enterDeclareUmSttm(DeclareUmSttmContext ctx) {
        var var_node = ctx.ID();
        if (var_node == null) {
            return;
        }
        var var_name = var_node.getText();
        var type_ctx = ctx.tipo();
        var expr_ctx = ctx.expr();

        if (expr_ctx != null) {
            outFile.append("var " + var_name);
        } else if (type_ctx != null) {
            switch (type_ctx.getText()) {
                case "bool" -> outFile.append("boolean ");
                case "int" -> outFile.append("int ");
                case "real" -> outFile.append("double ");
                case "txt" -> outFile.append("String ");
            }
            outFile.append(var_name);
        } else {
            // caso não tenha como determinar tipo e contexto, use a variável.
            var var_meta = variableMap.get(var_name);
            switch (var_meta.type) {
                case Int -> outFile.append("int " + var_name);
                case Float -> outFile.append("double " + var_name);
                case Boolean -> outFile.append("boolean " + var_name);
                case String -> outFile.append("String " + var_name);
                // Padroniza pra `int` simplemente para gerar código válido Java
                case Unset -> outFile.append("int " + var_name);
            }
        }
    }

    @Override
    public void enterAttrSttm(AttrSttmContext ctx) {
        var var_node = ctx.ID();
        var var_name = var_node.getText();

        outFile.append(var_name);
    }

    @Override
    public void enterEscrevaLinhaSttm(EscrevaLinhaSttmContext ctx) {
        outFile.append("System.out.println");
    }

    @Override
    public void enterEscrevaSttm(EscrevaSttmContext ctx) {
        outFile.append("System.out.print");
    }

    @Override
    public void enterLeiaSttm(LeiaSttmContext ctx) {
        var var_node = ctx.ID();
        var var_name = var_node.getText();
        var metadata = variableMap.get(var_name);

        if (metadata.type == VariableType.String) {
            outFile.append(var_name + " = in.nextLine");
        } else if (metadata.type == VariableType.Int) {
            outFile.append(var_name + " = in.nextInt");
        } else if (metadata.type == VariableType.Float) {
            outFile.append(var_name + " = in.nextFloat");
        } else if (metadata.type == VariableType.Boolean) {
            outFile.append(var_name + " = in.nextBoolean");
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        var node_str = node.getSymbol().getText();

        switch (node_str) {
            case "se" -> outFile.append("if ");
            case "senao" -> outFile.append("} else ");
            case "enquanto" -> outFile.append("while ");
            case "faça" -> outFile.append("do ");
            case "continue" -> outFile.append("continue");
            case "pare" -> outFile.append("break");
            case "e" -> outFile.append(" && ");
            case "ou" -> outFile.append(" || ");
            case "neg" -> outFile.append("!");
            case "=" -> outFile.append(" == ");
            case "!=" -> outFile.append(" != ");
            case "<" -> outFile.append(" < ");
            case "<=" -> outFile.append(" <= ");
            case ">" -> outFile.append(" > ");
            case ">=" -> outFile.append(" >= ");
            case "+" -> outFile.append(" + ");
            case "-" -> outFile.append(" - ");
            case "*" -> outFile.append(" * ");
            case "/" -> outFile.append(" / ");
            case "!" -> outFile.append(" ! ");
            case ":=" -> outFile.append(" = ");
            case "(" -> outFile.append("(");
            case ")" -> outFile.append(")");
            case ":" -> outFile.append(" {\n");
            case "fim" -> outFile.append("}\n");
            case "." -> outFile.append(";\n");
        }
    }

    VariableType determineType(ExprContext ctx) {
        // Literal
        if (ctx.literalExpr() != null) {
            var lit_ctx = ctx.literalExpr();
            if (lit_ctx.KW_FALSO() != null || lit_ctx.KW_VERDADE() != null) {
                return VariableType.Boolean;
            }

            if (lit_ctx.STR_LITERAL() != null) {
                return VariableType.String;
            }

            if (lit_ctx.INT_LITERAL() != null) {
                return VariableType.Int;
            }

            if (lit_ctx.FLOAT_LITERAL() != null) {
                return VariableType.Float;
            }
        }

        // Operação de negação (deve funcionar apenas com `bool`)
        if (ctx.negExpr() != null) {
            return VariableType.Boolean;
        }

        // Adição e subtração Multiplicação e Divisão
        if (ctx.MINUS() != null || ctx.PLUS() != null || ctx.STAR() != null || ctx.SLASH() != null) {
            var left_expr_ctx = ctx.expr(0);
            var right_expr_ctx = ctx.expr(1);

            var left_type = determineType(left_expr_ctx);
            var right_type = determineType(right_expr_ctx);

            if (left_type == VariableType.Int && right_type == VariableType.Int) {
                return VariableType.Int;
            }

            if (left_type == VariableType.Float && right_type == VariableType.Float) {
                return VariableType.Float;
            }
        }

        // Comparação
        if (ctx.cmpOp() != null) {
            // comparação sempre retorna booleano
            return VariableType.Boolean;
        }

        // Boolean E e OU
        if (ctx.KW_E() != null || ctx.KW_OU() != null) {
            return VariableType.Boolean;
        }

        // Compound expr
        if (ctx.compoundExpr() != null) {
            var compoumd_ctx = ctx.compoundExpr();

            // recursivamente determina
            return determineType(compoumd_ctx.expr());
        }

        // ID
        if (ctx.ID() != null) {
            var var_id = ctx.ID();
            var var_str = var_id.getText();

            if (variableMap.containsKey(var_str)) {
                return variableMap.get(var_str).type;
            }
        }

        return VariableType.Unset;
    }

    String typeStr(VariableType type) {
        if (type == VariableType.Boolean) {
            return "bool";
        } else if (type == VariableType.Float) {
            return "real";
        } else if (type == VariableType.Int) {
            return "int";
        } else if (type == VariableType.String) {
            return "txt";
        } else {
            return "unknown";
        }
    }
}
