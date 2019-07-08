/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bdafahim
 */
public class Menu extends MenuComponent {
    
    ArrayList menuComponents = new ArrayList();
    String name,description;

    public Menu(String name,String description) {
        this.name = name;
        this.description = description;
    }
    
    public void add(MenuComponent menuComponent)
    {
        menuComponents.add(menuComponent);
    }
    
    public void remove(MenuComponent menuComponent)
    {
        menuComponents.remove(menuComponent);
    }
    
    public MenuComponent getChild(int i)
    {
        return (MenuComponent) menuComponents.get(i);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void print()
    {
        System.out.println("\n"+getName());
        System.out.println("\n"+getDescription());
    
    
      Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {

            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
    }
        
    }
}
