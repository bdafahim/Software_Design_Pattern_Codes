/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author bdafahim
 */
public class Demo {
    public static void main(String[] args) {
        Factory factory = new Factory();
    
    Shape shape1 = factory.getShape("CIRCLE");
    shape1.draw();
    
    Shape shape2 = factory.getShape("square");
    shape2.draw();
    }
}
