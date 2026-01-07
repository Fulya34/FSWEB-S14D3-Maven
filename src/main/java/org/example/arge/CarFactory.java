package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {

        CarSkeleton electricCar = new ElectricCar("tesla", "tesla desc", 800, 2000);
        CarSkeleton hybidCar = new HybridCar("toyota","tyt desc",50,500,5);
        CarSkeleton gasPoweredCar = new GasPoweredCar("honda", "tyt desc",60.0 ,4);
        startEngine(electricCar);
        startEngine(hybidCar);
        startEngine(gasPoweredCar);
    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
