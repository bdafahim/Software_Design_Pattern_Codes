/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Pattern;

/**
 *
 * @author bdafahim
 */
public class StopState implements State{
    public void doAction(Context context)
    {
        System.out.println("player is in stop state");
        context.setState(this);
    }
    
    public String toString()
    {
        return "Stop state";
    }
}
