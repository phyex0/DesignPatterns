/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern.StrategyPatternImpl;

/**
 *
 * @author MONSTER
 */
public class OnHorse implements IMounted {

    @Override
    public int calcHitPoint() {
        return 200;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

}
