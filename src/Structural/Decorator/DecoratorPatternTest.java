package Structural.Decorator;

/**
 * Created by cristiano on 07/02/17.
 */
public class DecoratorPatternTest {

    /**
     * Notice that client program can create different kinds of Object at runtime
     * and they can specify the order of execution too.
     *
     * @param args
     */
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        System.out.println("\n*****");

        Car myLuxCar = new LuxuryCar(new SportsCar(new BasicCar()));
        myLuxCar.assemble();


    }

}