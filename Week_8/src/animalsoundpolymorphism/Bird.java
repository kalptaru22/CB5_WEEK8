package animalsoundpolymorphism;

public class Bird extends Animal {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.Sound();
    }
    @Override
    public void Sound() {
        System.out.println("birds ... twit... twit...");
    }
}
