package DesignPatterns.StatergyPatterns;

public class GearDriveStatergy  implements DriveStatergy {
        @Override
        public void drive() {
            System.out.println("This vehicle is driven using gears");
        } 
}
