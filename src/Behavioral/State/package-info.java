/**
 * Created by cristiano on 08/02/17.
 *
 * State design pattern is used when an Object change its behavior based on its internal state.
 *
 * Suppose we want to implement a TV Remote with a simple button to perform action.
 * If the State is ON, it will turn on the TV and if state is OFF,
 * it will turn off the TV.
 *
 * The benefits of using State pattern to implement polymorphic behavior is clearly visible.
 * The chances of error are less and it’s very easy to add more states for additional behavior.
 * Thus making our code more robust, easily maintainable and flexible.
 * Also State pattern helped
 * in avoiding if-else or switch-case conditional logic in this scenario.
 *
 */
package Behavioral.State;