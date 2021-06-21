package org.simuduckapp.review;

public class MallardDuck extends Duck implements Quackable, Flyable{

    @Override
    void display() {
        System.out.println("looks like a mallard");
    }

    @Override
    public void fly() {
        //pending
    }

    @Override
    public void quack() {
        //pending
    }
}
