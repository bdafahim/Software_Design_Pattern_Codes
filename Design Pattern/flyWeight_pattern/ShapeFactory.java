/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyWeight_pattern;

import java.util.HashMap;

/**
 *
 * @author bdafahim
 */
public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();
    
    public static Shape getShape(String color)
    {
        Circle circle = (Circle) circleMap.get(color);
        if(circle==null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color " +color);
        }
        
        return circle;
    }
    
}
