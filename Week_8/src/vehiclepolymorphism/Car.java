package vehiclepolymorphism;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();
    }

    @Override
    public void speedUp() {
        System.out.println("Car Speed 120MPH...");
    }
}
