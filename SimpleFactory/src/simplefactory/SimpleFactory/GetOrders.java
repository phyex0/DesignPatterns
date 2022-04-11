/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.SimpleFactory;

/**
 *
 * @author MONSTER
 */
public abstract class GetOrders {

    Pizza pizza;

    Pizza myPizzaOrder(String type) {
        pizza = createMyPizza(type);

        pizza.prepareIt();
        pizza.bakeIt();
        pizza.sliceIt();
        pizza.boxIt();

        return pizza;
    }

    abstract Pizza createMyPizza(String type);

}
