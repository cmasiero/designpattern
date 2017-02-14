/**
 * Created by cristiano on 07/02/17.
 *
 * Decorator design pattern is used to modify the functionality of an object at runtime.
 * At the same time other instances of the same class will not be affected by this,
 * so individual object gets the modified behavior.
 *
 * Suppose we want to implement different kinds of cars - we can create interface Car to define
 * the assemble method and then we can have a Basic car,
 * further more we can extend it to Sports car and Luxury Car.
 *
 *
 *
 * Decorator Design Pattern – Important Points
 * Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible.
 * Its easy to maintain and extend when the number of choices are more.
 * The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
 * Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 *
 *
 */
package Structural.Decorator;