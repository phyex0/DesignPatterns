/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.SimpleFactory;

/**
 *
 * @author MONSTER
 */
public class QuatroFormaggi extends Pizza {

    public QuatroFormaggi() {
        super("4 chese pizza", "thin", "no sauce");
    }

    @Override
    void bakeIt() {
        System.out.println("put it owen for 15 mins");
    }

}
