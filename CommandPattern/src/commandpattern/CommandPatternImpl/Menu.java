/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

/**
 *
 * @author MONSTER
 */
public class Menu {

    private MenuItem menuItem;

    public Menu() {
    }

    public Menu(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void Add(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void click() {
        menuItem.Clicked();
    }

    public void undoClick() {
        menuItem.Undo();
    }
}
