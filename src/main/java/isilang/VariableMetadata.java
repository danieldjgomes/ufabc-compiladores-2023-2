package isilang;

public class VariableMetadata {
    VariableType type;
    String rawValue;
    int assignCnt;

    public VariableMetadata() {
        this.type = VariableType.Unset;
        this.rawValue = "";
        this.assignCnt = 0;
    }

    public VariableMetadata(VariableType type) {
        this.type = type;
        this.rawValue = "";
        this.assignCnt = 0;
    }

    public VariableMetadata(VariableType type, String rawValue) {
        this.type = type;
        this.rawValue = rawValue;
        this.assignCnt = 1;
    }

    public VariableMetadata(VariableType type, String rawValue, int assignCnt) {
        this.type = type;
        this.rawValue = rawValue;
        this.assignCnt = assignCnt;
    }

}
