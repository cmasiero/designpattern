/**
 * Created by cristiano on 07/02/17.
 *
 * Mediator design pattern is used to provide a centralized communication medium between
 * different objects in a system.
 *
 * Mediator design pattern is very helpful in an enterprise application where multiple objects
 * are interacting with each other.
 * If the objects interact with each other directly, the system components are tightly-coupled
 * with each other that makes higher maintainability cost and not hard to extend.
 * Mediator pattern focuses on provide a mediator between objects for communication and help
 * in implementing lose-coupling between objects.
 *
 * The system objects that communicate each other are called Colleagues.
 * Usually we have an interface or abstract class that provides the contract for communication
 * and then we have concrete implementation of mediators.
 */
package Behavioral.Mediator;