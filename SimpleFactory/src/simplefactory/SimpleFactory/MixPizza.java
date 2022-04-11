/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.SimpleFactory;

/**
 *
 * @author MONSTER
 */
public class MixPizza extends Pizza {

    public MixPizza() {
        super("mixed with everthing", "thin", "no sauce");
    }

    public MixPizza(String dough) {
        super(dough);
        super.setName("mixed");
        super.setSauce("no sauce");
    }

    @Override
    void bakeIt() {
        System.out.println("put it to owen for 45 mins");
    }

}
