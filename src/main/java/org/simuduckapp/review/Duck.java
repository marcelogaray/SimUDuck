package org.simuduckapp.review;

public abstract class Duck {
    abstract void quack();

    public void swim() {
        System.out.println("Swimming Main Duck");
    }

    abstract void display();

    abstract void fly();
}
