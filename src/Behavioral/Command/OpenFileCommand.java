package Behavioral.Command;

/**
 * Created by cristiano on 07/02/17.
 *
 * Open command implementation
 *
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}