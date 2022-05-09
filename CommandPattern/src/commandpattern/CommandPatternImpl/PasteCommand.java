/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

import javax.swing.JTextArea;

/**
 *
 * @author MONSTER
 */
public class PasteCommand implements ICommand {

    private Document document;
    private JTextArea textArea;

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        textArea.append(document.paste());
    }

    @Override
    public void undo() {
        textArea.append(document.cut());
    }

}
