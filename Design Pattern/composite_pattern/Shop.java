/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

/**
 *
 * @author bdafahim
 */
public class Shop {
    MenuComponent allMenus;

    public Shop(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu()
    {
        allMenus.print();
    }
}
