package Behavioral.Command;

/**
 * Created by cristiano on 07/02/17.
 *
 *
 *
 */
public class FileSystemReceiverUtil {

    /**
     * Provide a utility method to create the appropriate FileSystemReceiver object.
     * @return
     */
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }

}