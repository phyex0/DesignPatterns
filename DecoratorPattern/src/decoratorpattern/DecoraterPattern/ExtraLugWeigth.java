/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern.DecoraterPattern;

/**
 *
 * @author MONSTER
 */
public class ExtraLugWeigth extends FligthDecorator {

    public ExtraLugWeigth(FligthTicket fligthTicket) {
        super(fligthTicket);
    }

    @Override
    public double cost() {
        return this.fligthTicket.cost() + 1000;
    }

    @Override
    public String getDescription() {
        return this.fligthTicket.getDescription() + " With extra lug weigth\n";
    }

}
