package Structural.Proxy;

import java.io.IOException;

/**
 * Created by cristiano on 07/02/17.
 */
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}