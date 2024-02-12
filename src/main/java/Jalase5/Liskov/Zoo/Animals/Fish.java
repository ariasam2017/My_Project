package Jalase5.Liskov.Zoo.Animals;

import Jalase5.Liskov.Zoo.Move.Swimming;

public class Fish extends Animal implements Swimming {
    public void sound(){
        System.out.println("No Sound");
    }
    @Override
    public void swim() {
        System.out.println("The Fish Swims In The Sea");

    }
}
