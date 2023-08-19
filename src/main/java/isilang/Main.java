package isilang;

import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import interpreter.IsidroLangLexer;
import interpreter.IsidroLangParser;

public class Main {
    static final HashMap<String, VariableMetadata> variableMap = new HashMap<>();

    @Parameter(description = "Arquivo de entrada. Se `-`, significa stdin.")
    String inputFile = "-";

    @Parameter(names = "-o", description = "Arquivo de saída. O padrão é `out`")
    String outputFilename = "out";

    public static void main(String... argv) {
        Main main = new Main();

        try {
            JCommander.newBuilder()
                    .addObject(main)
                    .build()
                    .parse(argv);

            main.run();
        } catch (Exception err) {
            System.err.println(err.getMessage());
            System.exit(1);
        }
    }

    public void run() throws IOException, CompilationException {
        IsidroLangLexer lexer;

        if (inputFile == "-") {
            lexer = new IsidroLangLexer(CharStreams.fromStream(System.in));
        } else {
            lexer = new IsidroLangLexer(CharStreams.fromFileName(inputFile));
        }

        var parser = new IsidroLangParser(new CommonTokenStream(lexer));

        System.out.println("Starting Compiling Process...");

        var checker = new IsidroLangCheckerListener(variableMap);

        parser.addParseListener(checker);

        var tree = parser.prog();

        if (tree.exception != null) {
            throw tree.exception;
        }

        // Imprime warnings de variável não utilizada
        variableMap.forEach((key, value) -> {
            if (value.type == VariableType.Unset || value.assignCnt == 0) {
                System.err
                        .println("ATENÇÃO: A variável `" + key + "` foi declarada mas nunca recebeu um valor");
            }
        });

        // A parte de transformar precisa ser depois da geração da AST.
        // Para podermos caminhar com todos os tokens e mapa de variáveis montados.
        var transform = new IsidroLang2JavaListener(outputFilename + ".java", variableMap);
        ParseTreeWalker.DEFAULT.walk(transform, tree);

        System.out.println("Compilation Finished!");
    }
}
