package Behavioral.Memento;

/**
 * Created by cristiano on 08/02/17.
 *
 * Memento Pattern Caretaker Class
 */
public class FileWriterCaretaker {

    private Object obj;

    public void save(FileWriterUtil fileWriter){
        this.obj=fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter){
        fileWriter.undoToLastSave(obj);
    }
}