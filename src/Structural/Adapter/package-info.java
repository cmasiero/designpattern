/**
 * Created by cristiano on 07/02/17.
 *
 * Its used so that two unrelated interfaces can work together.
 * The object that joins these unrelated interface is called an Adapter.
 *
 * One of the great real life example of Adapter design pattern is mobile charger.
 * Mobile battery needs 3 volts to charge but the normal socket produces
 * either 120V (US) or 240V (India).
 * So the mobile charger works as an adapter between mobile charging socket
 * and the wall socket.
 *
 *
 * Two Way Adapter Pattern
 * While implementing Adapter pattern, there are two approaches
 * - class adapter and object adapter - however both these approaches produce same result.
 *
 * 1 Class Adapter  - This form uses java inheritance and extends the source interface,
 *                   in our case Socket class.
 * 2 Object Adapter - This form uses Java Composition and adapter contains the source object.
 */
package Structural.Adapter;