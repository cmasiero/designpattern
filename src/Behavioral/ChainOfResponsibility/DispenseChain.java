package Behavioral.ChainOfResponsibility;

/**
 * Created by cristiano on 06/02/17.
 *
 * The base interface should have a method to define the next processor
 * in the chain and the method that will process the request.
 * Our ATM Dispense interface will look like below.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}


