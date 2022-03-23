/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern.DecoraterPattern;

/**
 *
 * @author MONSTER
 */
public abstract class FligthDecorator extends FligthTicket {

    public FligthTicket fligthTicket;

    public FligthDecorator(FligthTicket fligthTicket) {
        this.fligthTicket = fligthTicket;
    }

    @Override
    public abstract double cost();

    @Override
    public abstract String getDescription();

}
