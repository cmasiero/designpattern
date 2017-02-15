package Behavioral.Interpreter;

/**
 * Created by cristiano on 15/02/17.
 *
 * We need to create different types of Expressions that
 * will consume the interpreter context class.
 *
 */
public interface Expression {
    String interpret(InterpreterContext ic);
}
