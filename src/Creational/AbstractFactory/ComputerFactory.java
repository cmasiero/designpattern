package Creational.AbstractFactory;

/**
 * Created by cristiano on 06/02/17.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}