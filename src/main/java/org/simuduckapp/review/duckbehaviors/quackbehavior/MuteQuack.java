package org.simuduckapp.review.duckbehaviors.quackbehavior;

import org.simuduckapp.review.duckbehaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
