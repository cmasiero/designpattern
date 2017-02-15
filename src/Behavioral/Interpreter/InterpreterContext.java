package Behavioral.Interpreter;

/**
 * Created by cristiano on 15/02/17.
 *
 * Our first step will be to write the Interpreter context
 * class that will do the actual interpretation.
 *
 */
public class InterpreterContext {
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }
    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
