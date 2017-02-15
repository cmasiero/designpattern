package Structural.Flyweight;

import java.awt.*;

/**
 * Created by cristiano on 15/02/17.
 */
public interface Shape {

    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color);
}
