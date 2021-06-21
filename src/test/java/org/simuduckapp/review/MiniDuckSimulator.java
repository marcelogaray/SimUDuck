package org.simuduckapp.review;

import org.simuduckapp.review.client.Duck;
import org.simuduckapp.review.client.MallardDuck;
import org.simuduckapp.review.client.ModelDuck;
import org.simuduckapp.review.duckbehaviors.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.display();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
