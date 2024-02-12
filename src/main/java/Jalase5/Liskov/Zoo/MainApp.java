package Jalase5.Liskov.Zoo;

import Jalase5.Liskov.Zoo.Animals.Bird;

public class MainApp {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.sound();
        bird.fly();
    }
}
