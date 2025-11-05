package org.example.company;

import java.util.Objects;


public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean enginee;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.enginee = Boolean.TRUE;
        this.wheels = 4;
    }
    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }
   private void printSimpleName(){
        System.out.println("Class name:" + getClass().getSimpleName());
    }
    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }
    public String brake(){
        printSimpleName();
        return "the car is braking";

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                ", enginee=" + enginee +
                '}';
    }
}
