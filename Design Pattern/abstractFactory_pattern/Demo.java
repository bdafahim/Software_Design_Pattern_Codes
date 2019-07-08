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
public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
    
    Shape shape1 = shapeFactory1.getShape("CIRCLE");
    shape1.draw();
    Shape shape2 = shapeFactory1.getShape("RECTANGLE");
    shape2.draw();
    
   AbstractFactory shapeFactory2 = FactoryProducer.getFactory(false);
   Shape shape3 = shapeFactory2.getShape("CIRCLE");
   shape3.draw();
   Shape shape4 = shapeFactory2.getShape("RECTANGLE");
   shape4.draw();
    
  }
    
}
