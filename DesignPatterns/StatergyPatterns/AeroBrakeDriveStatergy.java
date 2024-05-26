package DesignPatterns.StatergyPatterns;

public class AeroBrakeDriveStatergy implements DriveStatergy {
    @Override
    public void drive() {
        System.out.println("This vehicle is driven using AeroBrakes");
    }
    
}
