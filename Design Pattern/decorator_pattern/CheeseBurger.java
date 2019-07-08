/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pattern;

/**
 *
 * @author bdafahim
 */
public class CheeseBurger extends Burger_Decorator {
    
    public CheeseBurger(Widget widget) {
        super(widget);
    }
    
    public void make()
    {
        widget.make();
        AddCheese();
    }
    
    public void AddCheese()
    {
        System.out.println("Cheese Added");
    }
    
}
