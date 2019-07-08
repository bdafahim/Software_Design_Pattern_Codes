/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory_pattern;

/**
 *
 * @author bdafahim
 */
public class RoundedShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Rounded_Circle();
        }
        
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rounded_Rectangle();
        }
        
        return null;
    }
    
}
