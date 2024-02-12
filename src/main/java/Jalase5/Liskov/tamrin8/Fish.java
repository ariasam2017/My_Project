package Jalase5.Liskov.tamrin8;

public class Fish extends Animal implements Swimmer{
    @Override
    public void Swim() {
        System.out.println("Fishes is a Swimming");
    }
}
