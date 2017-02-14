/**
 * Created by cristiano on 06/02/17.
 *
 * In Abstract Factory pattern, we get rid of if-else block and have a factory class for
 * each sub-class.
 * Then an Abstract Factory class that will return the sub-class based on the input factory class.
 * At first it seems confusing but once you see the implementation,
 * its really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern.
 *
 *
 * Abstract Factory Design Pattern Banefits
 *  - Abstract Factory design pattern provides approach to code for interface rather than implementation.
 *  - Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more
 *    products, for example we can add another sub-class Laptop and a factory LaptopFactory.
 *  - Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 */
package Creational.AbstractFactory;