package Behavioral.State;

/**
 * Created by cristiano on 08/02/17.
 */
public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
