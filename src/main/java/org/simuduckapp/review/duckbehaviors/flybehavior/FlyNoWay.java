package org.simuduckapp.review.duckbehaviors.flybehavior;

import org.simuduckapp.review.duckbehaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
