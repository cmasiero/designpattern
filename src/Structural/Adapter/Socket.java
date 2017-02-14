package Structural.Adapter;

/**
 * Created by cristiano on 07/02/17.
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}