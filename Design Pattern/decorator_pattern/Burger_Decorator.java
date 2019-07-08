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
public class Burger_Decorator implements Widget {
    
    Widget widget;

    public Burger_Decorator(Widget widget) {
        this.widget = widget;
    }
        

    @Override
    public void make() {
        
    widget.make();
}

}