package DesignPatterns.StatergyPatterns;

public class Vehicle {
    DriveStatergy driveStatergy;

    public Vehicle(DriveStatergy driveStatergy){
        this.driveStatergy = driveStatergy;
    }
    public void drive(){
        this.driveStatergy.drive();
    }
}
