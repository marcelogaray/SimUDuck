package org.simuduckapp.review;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("looks like a rubberduck");
    }

    @Override
    public void quack(){
        System.out.println("Squeak");
    }
}
