/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento_Pattern;

/**
 *
 * @author bdafahim
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
       CareTaker careTaker = new CareTaker();
       
       originator.setState("State 1");
       originator.setState("state 2");
       careTaker.add(originator.saveStateToMemento());
       originator.setState("state 3");
       careTaker.add(originator.saveStateToMemento());
       
       originator.setState("State 4");
        System.out.println("current state "+originator.getState());
        
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first saved "+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second saved "+originator.getState());
    }
}
