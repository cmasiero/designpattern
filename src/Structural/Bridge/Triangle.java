package Structural.Bridge;

/**
 * Created by cristiano on 07/02/17.
 */
public class Triangle extends Shape{

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}