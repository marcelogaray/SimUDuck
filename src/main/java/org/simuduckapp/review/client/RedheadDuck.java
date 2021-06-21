package org.simuduckapp.review.client;

import org.simuduckapp.review.duckbehaviors.flybehavior.FlyWithWings;
import org.simuduckapp.review.duckbehaviors.quackbehavior.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("looks like a redhead");
    }
}
