package DesignPatterns.StatergyPatterns;

public class Truck extends Vehicle {

    // @Override
    // public void drive() {
    //    System.out.println("This vehicle is driven using gears");
    // }


    public Truck(DriveStatergy driveStatergy) {
        super(driveStatergy);
    }
    
}
