/**
 * Created by cristiano on 07/02/17.
 *
 * Command design pattern is used to implement loose coupling in a request-response model.
 *
 * In command pattern, the request is send to the invoker and invoker pass
 * it to the encapsulated command object.
 *
 *
 * We will look at a real life scenario where we can implement Command pattern.
 * Let’s say we want to provide a File System utility with methods to open,
 * write and close file.
 * This file system utility should support multiple operating systems such as Windows and Unix.
 */
package Behavioral.Command;

