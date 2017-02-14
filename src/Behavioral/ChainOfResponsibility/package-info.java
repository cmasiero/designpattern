/**
 * Created by cristiano on 06/02/17.
 * Code from http://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java
 *
 * Chain of responsibility pattern is used to achieve loose coupling in software design
 * where a request from client is passed to a chain of objects to process them.
 * Then the object in the chain will decide themselves who will be processing
 * the request and whether the request is required to be sent to the next object in the chain or not.
 *
 * We need to create different processor classes that will implement the DispenseChain
 * interface and provide implementation of dispense methods.
 * Since we are developing our system to work with three types of currency bills – 50$, 20$ and 10$,
 * we will create three concrete implementations (Dollar50Dispenser ecc)
 */
package Behavioral.ChainOfResponsibility;

