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
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course !");
        
        MenuComponent allMenus = new Menu("All menus","All menus combined" );
        
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        
        allMenus.print();
        
       dinerMenu.add(new MenuItem(
       "Pasta",
       "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
       true,
       3.89
       )
       );
       
       dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a ﬂakey crust, topped with vanilla icecream",
                true,
                1.59));
       
       
       //Shop shop = new Shop(allMenus);
       //shop.printMenu();
       
       allMenus.print();
    }
    
}
