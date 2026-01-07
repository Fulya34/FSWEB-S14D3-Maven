package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    protected String engine; // 👈 TEST BUNU ARIYOR

    public CarSkeleton() {
        this.engine = "default engine";
    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
        this.engine = "default engine";
    }

    public String startEngine() {
        System.out.println("className:" + getClass().getSimpleName());
        return getName() + " startEngine";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    }

    public void runEngine(CarSkeleton carSkeleton){
        if (carSkeleton instanceof ElectricCar){
            ElectricCar car = (ElectricCar) carSkeleton;
            System.out.println("...." + car.getAvgKmPerCharge()
                    + " battery size:" + car.getBatterySize());
        } else if (carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("...." + hybridCar.getAvgKmPerLitre());
        } else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("..." + gasPoweredCar.getAvgKmPerLitre());
        } else {
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
