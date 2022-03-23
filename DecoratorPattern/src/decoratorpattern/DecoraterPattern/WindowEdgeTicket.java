/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern.DecoraterPattern;

/**
 *
 * @author MONSTER
 */
public class WindowEdgeTicket extends FligthDecorator {

    public WindowEdgeTicket(FligthTicket fligthTicket) {
        super(fligthTicket);
    }

    @Override
    public double cost() {
        return this.fligthTicket.cost() + 250;
    }

    @Override
    public String getDescription() {
        return this.fligthTicket.getDescription() + " With window side seat\n";

    }
}
