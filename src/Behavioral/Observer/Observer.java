package Behavioral.Observer;

/**
 * Created by cristiano on 07/02/17.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);

}
