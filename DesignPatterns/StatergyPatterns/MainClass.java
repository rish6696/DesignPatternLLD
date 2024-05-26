package DesignPatterns.StatergyPatterns;

public class MainClass {
    public static void main(String[] args) {
        /*
          Statergy pattern 
          Problem - Lets Say we have 3 subclass of a parent class, and out of 3, 2 child class has a method,
          which has a same implementation.  

          So now here for both of these classes we will have to write the same code again and again. Which will lead to comde
            duplication.

            Solution - 
            Lets Say the method that is same is A() in both the child classes. So we can create a interface with the method A()
            and then will pass that interface to the constructor of the child class. So that we can pass the implementation of the
            method A() to the child class.

            So in out Example , both car and truck has a method drive() which is same, and aeroplane has no proper definition so using parent method.


            Explanation - 
            Here we had a base class Vehicle class , and 2 subclasses Car and Truck, Aerpplane. Both of these classes has a method drive() which is same.
            Now to remove the redundant code we removed the method drive() from the child classes and created a interface DriveStatergy with the method drive().

            Now vehicle class has a reference of the interface DriveStatergy.

            Now we created Different DriveStatergy , Gearstagergy and AeroBrakeDriveStatergy.
            And when we created the Concrete class for vehicles(Car,truck and aerplaine ) we passed the DriveStatergy to the constructor and from thier constructo we are calling
            the constructor for vehicles class. 
        */

        Vehicle car = new Car(new GearDriveStatergy());
        Vehicle truck = new Truck(new GearDriveStatergy());
        Vehicle aeroplane = new Airplane(new AeroBrakeDriveStatergy());
        Vehicle []vehicles = {car, truck, aeroplane};
        for(Vehicle vehicle : vehicles){
            reachDestination(vehicle);
        }
        
    }

    public static void reachDestination(Vehicle vehicle){
        vehicle.drive();
    }
    
}
