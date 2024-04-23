package cardriveinheritance;

public class Vehicle {
    /*
    Write a Java program to create a class called Vehicle with a method called drive().
    Create a subclass called Car that overrides the drive() method to print "Repairing a
    car".
     */
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

    }

    public void drive() {
        System.out.println("CAR DRIVES PERFECT");

    }


}
