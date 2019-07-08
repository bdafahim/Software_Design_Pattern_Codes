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
public class BurgerDemo {
    public static void main(String[] args) {
        Widget widget = new CheeseBurger(new LetusBurger(new Burger()));
        widget.make();
    }
}
