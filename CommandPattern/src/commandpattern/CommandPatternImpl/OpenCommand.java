/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MONSTER
 */
public class OpenCommand implements ICommand {

    private Document document;
    private String name;
    private JTextField input;
    private JTextArea textArea;

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public OpenCommand(Document document) {
        this.document = document;

    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    @Override
    public void execute() {
        String name = this.askUser();
        textArea.append(document.open(name));

    }

    @Override
    public void undo() {
        textArea.append(document.close());
    }

    public String askUser() {
        return this.name = input.getText().length() > 0 ? input.getText() : "new document";
    }

}
