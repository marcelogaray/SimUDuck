package org.simuduckapp.review;

public class RedheadDuck extends Duck implements Flyable, Quackable{

    @Override
    void display() {
        System.out.println("looks like a redhead");
    }

    @Override
    public void fly() {
        //Pending
    }

    @Override
    public void quack() {
        //pending
    }
}
