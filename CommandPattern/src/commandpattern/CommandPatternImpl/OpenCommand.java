/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class OpenCommand implements ICommand {

    private Document document;
    private Scanner scanner;

    public OpenCommand(Document document) {
        this.document = document;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void execute() {
        String name = this.askUser();
        document.open(name);

    }

    @Override
    public void undo() {
        document.close();
    }

    public String askUser() {

        return scanner.nextLine();
    }

}
