package isilang;

public class CompilationException extends RuntimeException {
    public CompilationException(int lineNum, String errorMessage) {
        super("ERRO: Erro na linha " + lineNum + ":" + errorMessage);
    }

    public CompilationException(int lineNum, int tokenIndex, String errorMessage) {
        super("ERRO: Erro na linha " + lineNum + ":" + tokenIndex + ": " + errorMessage);
    }
}
