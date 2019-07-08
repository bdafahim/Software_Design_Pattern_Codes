/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTone;

/**
 *
 * @author bdafahim
 */
public class Singleobject {
    private static Singleobject instance = new Singleobject();
    
    private Singleobject(){}
    
    public static Singleobject getInstance()
    {
        return instance;
    }
    
    public void showMessage()
    {
        System.out.println("Hi there");
    }
}
