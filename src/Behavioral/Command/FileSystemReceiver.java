package Behavioral.Command;

/**
 * Created by cristiano on 07/02/17.
 *
 *  Receiver Interface
 *
 */
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();

}
