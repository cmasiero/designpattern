package Behavioral.Command;

/**
 * Created by cristiano on 07/02/17.
 *
 * Write command implementation
 *
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}