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
public class ProgrammerCommand implements ICommand{
    
    Programmer programmer;

    public ProgrammerCommand(Programmer programmer) {
        this.programmer = programmer;
    }
   

    @Override
    public void execute() {
        programmer.do_programmingWork();
    }
    
}
