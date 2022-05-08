/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandpattern.CommandPatternImpl;

/**
 *
 * @author MONSTER
 */
public class Document {

    public String open(String name) {
        return name + " is open";
    }

    public String close() {
        return "close";
    }

    public String cut() {
        return "cut";
    }

    public String copy() {
        return "copy";
    }

    public String paste() {
        return "paste";
    }
}
