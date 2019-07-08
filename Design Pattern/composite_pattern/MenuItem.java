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
public class MenuItem extends MenuComponent {
    String name,description;
    boolean vegeterian;
    double price;

    public MenuItem(String name, String description, boolean vegeterian, double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean isVegeterian()
    {
        return vegeterian;
    }
    
    public void print()
    {
        System.out.println(" "+getName());
        if(isVegeterian())
        {
            System.out.println("vegeterian");
        }
        System.out.println(", "+getPrice());
        System.out.println(" -- "+getDescription());
    }
}
