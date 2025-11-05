package org.example.arge;

public class CarSkeleton {
    private String name;
    private  String description;

    public CarSkeleton() {

    }
    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String startEngine() {
        System.out.println("className:" + getClass().getSimpleName());
        return getName() + "startEngine";
    }
    public String drive(){
        runEngine(this);
        return getName() + "is driving";
    }
    public void runEngine(CarSkeleton carSkeleton){
    if (carSkeleton instanceof  ElectricCar){
        double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
        int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
        System.out.println("...." + avgKmPerCharge + "battery size:" + batterySize);
    }else if ( carSkeleton instanceof  HybridCar){
        HybridCar hybridCar = (HybridCar) carSkeleton;
        System.out.println("...." + hybridCar.getAvgKmPerLitre() + "battery size:" + hybridCar);
    }else if(carSkeleton instanceof GasPoweredCar ){
        GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
        System.out.println("..." + gasPoweredCar.getAvgKmPerLitre());
    }else{
        System.out.println("invalid car type!");
    }

    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
