/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Pattern;

/**
 *
 * @author bdafahim
 */
public class SimpleCommandCenter {
    ICommand iCommand;

    public SimpleCommandCenter() {
    }
    
    public void setCommand(ICommand iCommand)
    {
        this.iCommand = iCommand;
    }
    
    public void buttonPressed(){
        iCommand.execute();
    }
}
