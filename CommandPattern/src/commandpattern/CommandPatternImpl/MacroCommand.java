/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

import java.util.Arrays;
import javax.swing.JTextArea;

/**
 *
 * @author MONSTER
 */
public class MacroCommand implements ICommand {

    private JTextArea textArea;

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    private ICommand[] commands;

    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        textArea.selectAll();
        textArea.replaceSelection("");
        Arrays.stream(commands).forEach(command -> command.execute());
    }

    @Override
    public void undo() {
        textArea.selectAll();
        textArea.replaceSelection("");
        for(int i = commands.length - 1; i >= 0; i--)
            commands[i].undo();
    }

}
