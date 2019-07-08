/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyWeight_pattern;

/**
 *
 * @author bdafahim
 */
public class FlyweightDemo {
    
    private static final String colors[] = {"Red","Green","Black","Blue","White"};
    
    public static void main(String[] args) {
        for(int i=0 ; i<20 ; ++i)
    {
        Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
        circle.setX(getRandomX());
        circle.setY(getRandomY());
        circle.setRadius(100);
        
        circle.draw();
    }
  }
    
    private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
    
    private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
    
    
}
