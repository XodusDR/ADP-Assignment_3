package org.example;
import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class CalculatorTest {
   Shapes Square = new Square("Square", 4,4,4);
   Shapes Rectangle = new Rectangle("Rectangle", 5,9,4);
   Shapes Triangle = new Triangle ("Triangle", 23,6,3);

   @Test
   public void getShapeName()
    {
        assertEquals("Square",Square.getShapeName());
        assertEquals("Triangle",Triangle.getShapeName());
        assertEquals("Square",Rectangle.getShapeName());
    }
    @Test
    public void getShapeWCorners()
    {

        assertEquals(4, Square.getCorners());
        assertEquals(4, Rectangle.getCorners());
        assertEquals(4, Triangle.getCorners());

    }
}
