/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_pattern;

/**
 *
 * @author bdafahim
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("fahim");
        image.display();
        System.out.println("after instance created");
        image.display();
    }
    
}
