package Behavioral.State;

/**
 * Created by cristiano on 08/02/17.
 *
 * In our example, we can have two states – one for turning TV on and another to turn it off.
 * So we will create two concrete state implementations for these behaviors.
 * TVStartState (this one) and
 * TVStopState
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}