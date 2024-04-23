package animalinheritance;

public class Animal {
    /*
    Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
    }
    public void move(){
        System.out.println("Animals Move");
    }
}
