package animalsoundpolymorphism;

public class Cat extends Bird{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Sound();
    }
    @Override
    public void Sound() {
        System.out.println("Cat... Meaw...Meaw...");
    }
}
