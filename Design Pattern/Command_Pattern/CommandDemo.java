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
public class CommandDemo {
    
    public static void main(String[] args) {
    Programmer programmer = new Programmer();
    DomesticEngineer domesticEngineer = new DomesticEngineer();
    ProgrammerCommand programmerCommand = new ProgrammerCommand(programmer);
    EngineerCommand engineerCommand = new EngineerCommand(domesticEngineer);
    
    SimpleCommandCenter simpleCommandCenter = new SimpleCommandCenter();
    simpleCommandCenter.setCommand(engineerCommand);
    simpleCommandCenter.buttonPressed();
    simpleCommandCenter.setCommand(programmerCommand);
    simpleCommandCenter.buttonPressed();
   }
    
}
