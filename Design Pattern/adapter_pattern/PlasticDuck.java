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
public class PlasticDuck implements ToyDuck{

    @Override
    public void squak() {
        System.out.println("Squak squak");
    }
    
}
