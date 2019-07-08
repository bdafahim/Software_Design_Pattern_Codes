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
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }
        
        else if(shapeType.equalsIgnoreCase("RECTANgLE"))
        {
            return new Rectangle();
        }
        
        return null;
    }
    
}
