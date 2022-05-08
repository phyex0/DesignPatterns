/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

/**
 *
 * @author MONSTER
 */
public class PasteCommand implements ICommand {
    private Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }

    @Override
    public void undo() {
        document.cut();
    }
    
    
    
}
