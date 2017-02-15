/**
 * Created by cristiano on 08/02/17.
 *
 * Interpreter pattern is one of the behavioral design pattern and is used to defines a
 * grammatical representation for a language and provides an interpreter to deal with this grammar.
 * The best example of this pattern is java compiler that interprets the java source
 * code into byte code that is understandable by JVM.
 * Google Translator is also an example of interpreter pattern where the input can be
 * in any language and we can get the output interpreted in another language.
 *
 *
 * To implement interpreter pattern, we need to create Interpreter context engine that will do
 * the interpretation work and then we need to create different Expression implementations
 * that will consume the functionalities provided by the interpreter context.
 * Finally we need to create the client that will take the input from user and decide
 * which Expression to use and then generate output for the user
 *
 * Let’s understand this with an example where the user input will be of two forms
 * – "<Number> in Binary" or "<Number> in Hexadecimal" and our interpreter client should
 * return it in format
 * "<Number> in Binary= <Number_Binary_String>" and
 * "<Number> in Hexadecimal= <Number_Binary_String>" respectively.
 *
 *
 *
 * Important Points
 *
 * Interpreter pattern can be used when we can create a syntax tree for the grammar we have.
 *
 * Interpreter pattern requires a lot of error checking and a lot of expressions and code to evaluate them,
 * it gets complicated when the grammar becomes more complicated and hence hard to maintain and provide efficiency.
 *
 * java.util.Pattern and subclasses of java.text.Format are some of the examples of interpreter pattern used in JDK.
 *
 *
 */
package Behavioral.Interpreter;