package isilang;

import java.util.HashMap;

import interpreter.IsidroLangParser.AttrSttmContext;
import interpreter.IsidroLangParser.DeclareUmSttmContext;
import interpreter.IsidroLangParser.EnquantoSttmContext;
import interpreter.IsidroLangParser.ExprContext;
import interpreter.IsidroLangParser.FacaEnquantoSttmContext;
import interpreter.IsidroLangParser.LeiaSttmContext;
import interpreter.IsidroLangParser.NegExprContext;
import interpreter.IsidroLangParser.SeSttmContext;
import interpreter.IsidroLangParserBaseListener;

public class IsidroLangCheckerListener extends IsidroLangParserBaseListener {
    HashMap<String, VariableMetadata> variableMap;

    /**
     * Create new checker listener.
     */
    public IsidroLangCheckerListener(HashMap<String, VariableMetadata> variableMap) {
        this.variableMap = variableMap;
    }

    @Override
    public void exitExpr(ExprContext ctx) {
        // Operação de negação (deve funcionar apenas com `bool`)
        if (ctx.negExpr() != null) {
            var neg_ctx = ctx.negExpr();

            var expr_ctx = neg_ctx.expr();
            var expr_type = determineType(expr_ctx);
            if (expr_type != VariableType.Boolean) {
                throw new CompilationException(expr_ctx.start.getLine(), expr_ctx.start.getTokenIndex(),
                        "operação de negação não é compatível com o tipo `" + typeStr(expr_type)
                                + "`. Experado o tipo `bool`");
            }
        }

        // Operações matemáticas (menos a soma pq tbm funciona com txt)
        if (ctx.MINUS() != null || ctx.STAR() != null || ctx.SLASH() != null) {
            var left_expr_ctx = ctx.expr(0);
            var right_expr_ctx = ctx.expr(1);

            var left_type = determineType(left_expr_ctx);
            var right_type = determineType(right_expr_ctx);

            // checa tipo do lado esquerdo
            if (left_type != VariableType.Int && left_type != VariableType.Float) {
                throw new CompilationException(left_expr_ctx.start.getLine(), left_expr_ctx.start.getTokenIndex(),
                        "O tipo da espressão `" + left_expr_ctx.getText() + "` é `" + typeStr(left_type)
                                + "`. Operações matemáticas esperam expressões do tipo `int` ou `real`");
            }

            // chaca tipo do lado direito
            if (right_type != VariableType.Int && right_type != VariableType.Float) {
                throw new CompilationException(right_expr_ctx.start.getLine(), right_expr_ctx.start.getTokenIndex(),
                        "O tipo da espressão `" + right_expr_ctx.getText() + "` é `" + typeStr(right_type)
                                + "`. Operações matemáticas esperam expressões do tipo `int` ou `real`");
            }

            // checa se os tipos são iguais dos dois lados
            if (left_type != right_type) {
                throw new CompilationException(left_expr_ctx.start.getLine(), left_expr_ctx.start.getTokenIndex(),
                        "O tipo deve ser igual dos dois lados da operação matemática. O da esquerda é `"
                                + typeStr(left_type) + "` e o da direita é `" + typeStr(right_type) + "`");
            }
        }

        // Soma e concatenação de strings
        if (ctx.PLUS() != null) {
            var left_expr_ctx = ctx.expr(0);
            var right_expr_ctx = ctx.expr(1);

            var left_type = determineType(left_expr_ctx);
            var right_type = determineType(right_expr_ctx);

            if (left_type != VariableType.Int && left_type != VariableType.Float
                    && left_type != VariableType.String) {
                throw new CompilationException(left_expr_ctx.start.getLine(), left_expr_ctx.start.getTokenIndex(),
                        "O tipo da espressão `" + left_expr_ctx.getText() + "` é `" + typeStr(left_type)
                                + "`. Operação `+` espera expressões do tipo `int`, `real` ou `txt`");
            }

            if (right_type != VariableType.Int && right_type != VariableType.Float
                    && right_type != VariableType.String) {
                throw new CompilationException(right_expr_ctx.start.getLine(), right_expr_ctx.start.getTokenIndex(),
                        "O tipo da espressão `" + right_expr_ctx.getText() + "` é `" + typeStr(right_type)
                                + "`. Operação `+` espera expressões do tipo `int`, `real` ou `txt`");
            }

            if (left_type != right_type) {
                throw new CompilationException(left_expr_ctx.start.getLine(), left_expr_ctx.start.getTokenIndex(),
                        "O tipo deve ser igual dos dois lados da operação. O da esquerda é `"
                                + typeStr(left_type) + "` e o da direita é `" + typeStr(right_type) + "`");
            }
        }

        // Comparação
        if (ctx.cmpOp() != null) {
            var op_ctx = ctx.cmpOp();
            var op_str = op_ctx.getText();
            var left_expr_ctx = ctx.expr(0);
            var right_expr_ctx = ctx.expr(1);

            var left_type = determineType(left_expr_ctx);
            var right_type = determineType(right_expr_ctx);

            // Checa que os dois lados tem o mesmo tipo
            if (left_type != right_type) {
                throw new CompilationException(ctx.start.getLine(), ctx.start.getTokenIndex(),
                        "as expressões devem ser do mesmo tipo para os dois lados da comparação");
            }

            // `>`, `>=`, `<`, `<=` não são compatíveis com os tipos `bool` e `txt`
            if (op_str == ">" || op_str == ">=" || op_str == "<" || op_str == "<=") {
                if (left_type == VariableType.Boolean || left_type == VariableType.String
                        || right_type == VariableType.Boolean || right_type == VariableType.String) {
                    throw new CompilationException(op_ctx.start.getType(), op_ctx.start.getTokenIndex(),
                            "operador `" + op_str
                                    + "` não é compatível com o tipo `bool` e `txt`, apenas `int` e `real`");
                }
            }
        }

        // Boolean E e OU
        if (ctx.KW_E() != null || ctx.KW_OU() != null) {
            var left_expr_ctx = ctx.expr(0);
            var right_expr_ctx = ctx.expr(1);

            // sempre deve ser booleano dos dois lados
            if (determineType(left_expr_ctx) != VariableType.Boolean) {
                throw new CompilationException(left_expr_ctx.start.getLine(), left_expr_ctx.start.getTokenIndex(),
                        "Essa expressão precisa ser do tipo `bool`");
            }

            // sempre deve ser booleano dos dois lados
            if (determineType(right_expr_ctx) != VariableType.Boolean) {
                throw new CompilationException(right_expr_ctx.start.getLine(), right_expr_ctx.start.getTokenIndex(),
                        "Essa expressão precisa ser do tipo `bool`");
            }
        }

        // ID
        if (ctx.ID() != null) {
            var var_id = ctx.ID();
            var var_str = var_id.getText();

            if (!variableMap.containsKey(var_str)) {
                throw new CompilationException(var_id.getSymbol().getLine(), var_id.getSymbol().getTokenIndex(),
                        "A variável `" + var_str + "` não foi definida.");
            }

            // checa se no momento da utilização a variavel ainda tem o tipo não definido
            if (variableMap.get(var_str).type == VariableType.Unset) {
                throw new CompilationException(var_id.getSymbol().getLine(), var_id.getSymbol().getStartIndex(),
                        "A variável `" + var_str + "` não foi inicializada.");
            }
        }
    }

    @Override
    public void exitNegExpr(NegExprContext ctx) {
        var expr_type = determineType(ctx.expr());
        if (expr_type != VariableType.Boolean) {
            throw new CompilationException(ctx.expr().start.getLine(), ctx.expr().start.getTokenIndex(),
                    "operador de negação não é valido no tipo `" + typeStr(expr_type)
                            + "`. É apenas válido para o tipo `bool`");
        }

    }

    @Override
    public void exitAttrSttm(AttrSttmContext ctx) {
        var var_id = ctx.ID();
        var var_name = var_id.getText();
        var var_token = var_id.getSymbol();

        // checa se a variável foi declarada
        if (!variableMap.containsKey(var_name)) {
            throw new CompilationException(var_token.getLine(), var_token.getTokenIndex(),
                    "A variável `" + var_name + "` não foi declarada.");
        }

        var expr_ctx = ctx.expr();
        var expr_type = determineType(expr_ctx);
        var var_meta = variableMap.get(var_name);

        // se não foi declarado o tipo anteriormente, a atribuição infere o tipo
        if (var_meta.type == VariableType.Unset) {
            var_meta.type = expr_type;
        }

        // checa se o tipo bate dos dois lados do `:=`
        if (var_meta.type != expr_type) {
            throw new CompilationException(expr_ctx.start.getLine(), expr_ctx.start.getStartIndex(),
                    "Os tipos definidos e da atribuição são diferentes. Tipo definido é `" + typeStr(var_meta.type)
                            + "` e o tipo da expressão é `" + typeStr(expr_type) + "`.");
        }

        var_meta.rawValue = expr_ctx.getText();
        var_meta.assignCnt += 1;
    }

    @Override
    public void exitSeSttm(SeSttmContext ctx) {
        var expr_ctx = ctx.expr();
        var expr_type = determineType(expr_ctx);

        // checa se a condição é booleana
        if (expr_type != VariableType.Boolean) {
            throw new CompilationException(expr_ctx.start.getLine(), expr_ctx.start.getTokenIndex(),
                    "A condição tem o tipo `" + typeStr(expr_type)
                            + "`. É esperado que a condição seja do tipo `bool`");
        }
    }

    @Override
    public void exitEnquantoSttm(EnquantoSttmContext ctx) {
        var expr_ctx = ctx.expr();
        var expr_type = determineType(expr_ctx);

        // checa se a condição é booleana
        if (expr_type != VariableType.Boolean) {
            throw new CompilationException(expr_ctx.start.getLine(), expr_ctx.start.getTokenIndex(),
                    "A condição tem o tipo `" + typeStr(expr_type)
                            + "`. É esperado que a condição seja do tipo `bool`");
        }
    }

    @Override
    public void exitFacaEnquantoSttm(FacaEnquantoSttmContext ctx) {
        var expr_ctx = ctx.expr();
        var expr_type = determineType(expr_ctx);

        // checa se a condição é booleana
        if (expr_type != VariableType.Boolean) {
            throw new CompilationException(expr_ctx.start.getLine(), expr_ctx.start.getTokenIndex(),
                    "A condição tem o tipo `" + typeStr(expr_type)
                            + "`. É esperado que a condição seja do tipo `bool`");
        }
    }

    @Override
    public void exitDeclareUmSttm(DeclareUmSttmContext ctx) {
        var var_node = ctx.ID();
        var var_name = var_node.getText();
        var var_token = var_node.getSymbol();

        // checa se a variavel foi declarado anteriormente
        if (variableMap.containsKey(var_name)) {
            throw new CompilationException(var_token.getLine(), var_token.getStartIndex(),
                    "Variável `" + var_name + "` já foi declarada anteriormente");
        }

        // Podem ser null por ser uma parte opcional da sintaxe
        var tipo_ctx = ctx.tipo();
        var attr_ctx = ctx.expr();

        if (tipo_ctx == null && attr_ctx == null) { // Caso não tenha tipo e atribuição
            variableMap.put(var_name, new VariableMetadata());
        } else if (tipo_ctx != null && attr_ctx == null) { // Caso tenha tipo e não tenha atribuição
            var tipo = tipo_ctx.getText();
            switch (tipo) {
                case "int" -> variableMap.put(var_name, new VariableMetadata(VariableType.Int));
                case "bool" -> variableMap.put(var_name, new VariableMetadata(VariableType.Boolean));
                case "real" -> variableMap.put(var_name, new VariableMetadata(VariableType.Float));
                case "txt" -> variableMap.put(var_name, new VariableMetadata(VariableType.String));
                // Erro em tipos inválidos
                default -> throw new CompilationException(tipo_ctx.start.getLine(), tipo_ctx.start.getStartIndex(),
                        "Tipo não reconhecido. Os possiveis tipos são `int`, `real`, `bool` e `txt`");
            }
        } else if (tipo_ctx == null && attr_ctx != null) { // Caso tenha atribuição e não tenha tipo
            var attr_type = determineType(attr_ctx);

            // infere o tipo pelo tipo da atribuição
            variableMap.put(var_name, new VariableMetadata(attr_type, attr_ctx.getText(), 1));
        } else { // Caso tenha tipo e atribuição
            var tipo = tipo_ctx.getText();
            var attr_type = determineType(attr_ctx);

            var tipo_ = VariableType.Unset;
            switch (tipo) {
                case "int" -> tipo_ = VariableType.Int;
                case "bool" -> tipo_ = VariableType.Boolean;
                case "real" -> tipo_ = VariableType.Float;
                case "txt" -> tipo_ = VariableType.String;
                // Erro em tipos inválidos
                default -> throw new CompilationException(tipo_ctx.start.getLine(), tipo_ctx.start.getStartIndex(),
                        "Tipo não reconhecido. Os possiveis tipos são `int`, `real`, `bool` e `txt`");
            }

            // Se tiver tipo e atribuição, eles precisam concordar
            if (tipo_ != attr_type) {
                throw new CompilationException(tipo_ctx.start.getLine(), tipo_ctx.start.getStartIndex(),
                        "Os tipos definido e da atribuição são diferentes. Tipo definido é `" + typeStr(tipo_)
                                + "` e o tipo da expressão é `" + typeStr(attr_type) + "`.");
            }

            variableMap.put(var_name, new VariableMetadata(attr_type, attr_ctx.getText(), 1));
        }
    }

    @Override
    public void exitLeiaSttm(LeiaSttmContext ctx) {
        var var_node = ctx.ID();
        var var_name = var_node.getText();
        var var_token = var_node.getSymbol();

        // checa se a Variável existe
        if (!variableMap.containsKey(var_name)) {
            throw new CompilationException(var_token.getLine(), var_token.getStartIndex(),
                    "A variável " + var_name + " não foi declarada.");
        }

        // checa se no momento da utilização a variavel ainda tem o tipo não definido
        if (variableMap.get(var_name).type == VariableType.Unset) {
            throw new CompilationException(var_token.getLine(), var_token.getStartIndex(),
                    "A variável `" + var_name + "` não foi inicializada.");
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
