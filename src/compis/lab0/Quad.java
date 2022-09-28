package compis.lab0;

public class Quad {
    private final String op;
    private final String arg1;
    private final String arg2;
    private final String result;

    public Quad(String op, String arg1, String arg2, String result) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }

    public String getOp() {
        return op;
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return this.result + " = " + this.arg1 + " " + this.op + " " + this.arg2;
    }
}