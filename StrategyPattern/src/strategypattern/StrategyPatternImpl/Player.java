/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypattern.StrategyPatternImpl;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MONSTER
 */
public class Player {

    private double baseHitPoint;

    Map<String, IMounted> status;

    public Player(double baseHitPoint) {
        this.baseHitPoint = baseHitPoint;
        status = new HashMap<>();
        status.put(OnFoot.class.getName(), new OnFoot());
        status.put(OnHorse.class.getName(), new OnHorse());
        status.put(OnDragon.class.getName(), new OnDragon());
    }

    public double getBaseHitPoint() {
        return baseHitPoint;
    }

    public void setBaseHitPoint(double baseHitPoint) {
        this.baseHitPoint = baseHitPoint;
    }

    public double applyMounted(IMounted mount) {
        return baseHitPoint + mount.calcHitPoint();
    }

    public IMounted getMyMount(int selection) {

        switch (selection) {
            case 1:
                return status.get(OnFoot.class.getName());
            case 2:
                return status.get(OnHorse.class.getName());
            case 3:
                return status.get(OnDragon.class.getName());
            default:
                return null;
        }
    }
}
