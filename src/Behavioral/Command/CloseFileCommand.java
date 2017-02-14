package Behavioral.Command;

/**
 * Created by cristiano on 07/02/17.
 *
 * Close command implementation
 *
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}