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
public class Sparrow implements Bird{

    @Override
    public void fly() {
        System.out.println("flying.........");
    }

    @Override
    public void makeSound() {
        System.out.println("Chrip chirp <><><>");
    }
    
}
