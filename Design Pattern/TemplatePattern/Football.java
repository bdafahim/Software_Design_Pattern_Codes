/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

/**
 *
 * @author bdafahim
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Game initialized,ready to play..");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game started, enjoy!!");
    }

    @Override
    void endPlay() {
        System.out.println("FOOTBALL game finished!");
    }
    
}
