package vehiclepolymorphism;

public class Bicycle extends Car {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
    }

    @Override
    public void speedUp() {
        System.out.println("Bicycle Speed ... 20MPH");
    }
}

