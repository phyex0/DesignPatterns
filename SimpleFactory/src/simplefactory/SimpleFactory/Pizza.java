/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.SimpleFactory;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author MONSTER
 */
public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;

    List<String> toppings;

    public Pizza(String dough) {
        this.dough = dough;
        toppings = new ArrayList<>();
    }

    public Pizza() {
        toppings = new ArrayList<>();
    }

    public Pizza(String name, String dough, String sauce) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        toppings = new ArrayList<>();
    }

    void prepareIt() {
        System.out.println("We are now preparing the pizza!");
        System.out.println("baking the dought");
        System.out.println("sauve is added");
        System.out.println("toppings are added");

        toppings.forEach(i -> System.out.println(i));
    }

    void serveIt() {
        System.out.println("served to your table..");
    }

    void bakeIt() {
        System.out.println("put it into owen for 30 mins");
    }

    void sliceIt() {
        System.out.println("slice it up into 8");
    }

    void boxIt() {
        System.out.println("pizza is boxed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

}
