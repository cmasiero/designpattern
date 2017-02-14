package Behavioral.State;

/**
 * Created by cristiano on 08/02/17.
 */
public class TVRemote {

    public static void main(String[] args) {

        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }

}
