/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

import java.util.Arrays;

/**
 *
 * @author MONSTER
 */
public class MacroCommand implements ICommand {
    
    private ICommand[] commands;
    
    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }
    
    @Override
    public void execute() {
        Arrays.stream(commands).forEach(command -> command.execute());
    }
    
    @Override
    public void undo() {
        Arrays.stream(commands).forEach(command -> command.undo());
    }
    
}
