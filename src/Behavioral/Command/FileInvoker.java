package Behavioral.Command;

/**
 * Created by cristiano on 07/02/17.
 *
 * Invoker is a simple class that encapsulates the Command and passes
 * the request to the command object to process it.
 *
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}