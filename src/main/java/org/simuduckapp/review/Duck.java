package org.simuduckapp.review;

public abstract class Duck {
    public String quack() {
        return "quack";
    }

    public void swim() {
        System.out.println("Swimming Main Duck");
    }

    abstract String display();
}
