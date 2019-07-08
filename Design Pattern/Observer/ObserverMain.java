/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author bdafahim
 */
public class ObserverMain {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.register((Listener) new Admin());
        notificationSystem.register((Listener) new Client());
        notificationSystem.sendNotification();
    }
    
    
}
