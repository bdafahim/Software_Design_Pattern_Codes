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
public class Factory {
    public Shape getShape(String shapetype)
    {
        if(shapetype == null)
        {
            return null;
        }
        
        if(shapetype.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }
        
        if(shapetype.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        
        return null;
    }
}
