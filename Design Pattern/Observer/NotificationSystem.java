/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author bdafahim
 */
public class NotificationSystem {
    List<Listener> listeners = new ArrayList<>();
    
    public void register(Listener notificationListener)
    {
        listeners.add(notificationListener);
    }
    
    public void sendNotification()
    {
        for(Iterator e = listeners.iterator(); e.hasNext();)
        {
            ((Listener)e.next()).notification();
        }
    }
}
