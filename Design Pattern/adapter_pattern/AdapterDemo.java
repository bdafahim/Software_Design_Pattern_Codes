/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_pattern;

/**
 *
 * @author bdafahim
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticDuck();
        
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        
        System.out.println("Sparrow....");
        sparrow.fly();
        sparrow.makeSound();
        
        System.out.println("ToyDuck...");
        
        birdAdapter.squak();
    }
}
