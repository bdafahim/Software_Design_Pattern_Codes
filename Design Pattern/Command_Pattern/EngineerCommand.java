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
public class EngineerCommand implements ICommand{
    DomesticEngineer domesticEngineer;

    public EngineerCommand(DomesticEngineer domesticEngineer) {
        this.domesticEngineer = domesticEngineer;
    }

    @Override
    public void execute() {
        domesticEngineer.doWork();
    }
    
}
