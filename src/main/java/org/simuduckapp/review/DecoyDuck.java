package org.simuduckapp.review;

public class DecoyDuck extends Duck{
    @Override
    void quack() {
        //override to do nothing
    }

    @Override
    void display() {
        System.out.println("looks like a decoy duck");
    }

    @Override
    void fly() {
        //override to do nothing
    }
}
