/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern.DecoraterPattern;

/**
 *
 * @author MONSTER
 */
public class EconomyTicket extends FligthTicket {

    @Override
    public String getDescription() {
        return "Economy Ticket\n";
    }

    @Override
    public double cost() {
        return 1000;
    }

}
