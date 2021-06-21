package org.simuduckapp.review;

public class RubberDuck extends Duck{

    @Override
    public void quack(){
        System.out.println("Squeak");
    }

    @Override
    void display() {
        System.out.println("looks like a rubberduck");
    }

    @Override
    void fly(){
        //override to do nothing
    }
}
