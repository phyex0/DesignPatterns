/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

/**
 *
 * @author MONSTER
 */
public class MenuItem {
    
    private ICommand command;

    public MenuItem() {
    }

    public MenuItem(ICommand command) {
        this.command = command;
    }
    
    public void setCommand(ICommand command){
        this.command = command;
    }
    
    public void Clicked(){
        command.execute();
    }
    
    public void Undo(){
        command.undo();
    }
    
}
