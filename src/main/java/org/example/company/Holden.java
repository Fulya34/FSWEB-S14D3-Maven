package org.example.company;

public class Holden extends Car{
    public Holden(int clinders, String name){
        super(clinders, name);
    }

    @Override
    public String accelerate() {
        return getName() + "is accelerating!";
    }

    @Override
    public String brake() {
        return getName() + "is braking!";
    }

    @Override
    public String startEngine() {
        return getName() + " start is engine!";
    }
}
