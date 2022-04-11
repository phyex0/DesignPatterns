/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.SimpleFactory;

/**
 *
 * @author MONSTER
 */
public class IstanbulPizzaFactory extends GetOrders {

    @Override
    Pizza createMyPizza(String type) {
        Pizza pizza = null;

        if (type.equalsIgnoreCase("quatro")) {
            pizza = new QuatroFormaggi();
        } else if (type.equalsIgnoreCase("mix")) {
            pizza = new MixPizza("not thinner");
        }
        return pizza;
    }

}
