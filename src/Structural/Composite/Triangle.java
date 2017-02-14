package Structural.Composite;

/**
 * Created by cristiano on 07/02/17.
 *
 * Leaf Object : implements base component and these are the building block for the composite.
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}
