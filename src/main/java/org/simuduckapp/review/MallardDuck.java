package org.simuduckapp.review;

import org.simuduckapp.review.duckbehaviors.flybehavior.FlyWithWings;
import org.simuduckapp.review.duckbehaviors.quackbehavior.Quack;

public class MallardDuck extends Duck {
    private final Quack quackBehavior;
    private final FlyWithWings flyBehavior;

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("looks like a mallard");
    }
}
