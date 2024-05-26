package DesignPatterns.StatergyPatterns;

public class Car extends Vehicle {

    // @Override
    // public void drive() {
    //     // TODO Auto-generated method stub
    //     System.out.println("THis vehicle is driven using gears");
    // }


    public Car(DriveStatergy driveStatergy) {
        super(driveStatergy);
    }
    
}
