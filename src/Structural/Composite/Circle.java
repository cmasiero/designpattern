package Structural.Composite;

/**
 * Created by cristiano on 07/02/17.
 *
 * Leaf Objects : implements base component and these are the building block for the composite.
 */
public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
