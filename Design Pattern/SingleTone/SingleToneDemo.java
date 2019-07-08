/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTone;

/**
 *
 * @author bdafahim
 */
public class SingleToneDemo {
    public static void main(String[] args) {
        Singleobject singleobject = Singleobject.getInstance();
        singleobject.showMessage();
    }
}
