package org.simuduckapp.review.client;

import org.simuduckapp.review.duckbehaviors.flybehavior.FlyNoWay;
import org.simuduckapp.review.duckbehaviors.quackbehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
