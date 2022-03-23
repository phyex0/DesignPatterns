/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern.DecoraterPattern;

/**
 *
 * @author MONSTER
 */
public class BusinessTicket extends FligthTicket {

    @Override
    public String getDescription() {
        return "Business Ticket \n";
    }

    @Override
    public double cost() {
        return 2500;
    }

}
