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
public class LetusBurger extends Burger_Decorator {
    
    public LetusBurger(Widget widget) {
        super(widget);
    }
    
    public void make()
    {
        widget.make();
        AddLetus();
    }
    
    public void AddLetus()
    {
        System.out.println("Letus Pata Added");
    }
}
