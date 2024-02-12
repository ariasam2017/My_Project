package Jalase5.Liskov.Zoo.Animals;

import Jalase5.Liskov.Zoo.Eat.MeatEater;
import Jalase5.Liskov.Zoo.Eat.Vegetarian;
import Jalase5.Liskov.Zoo.Move.Flying;

public class Bird extends Animal implements Flying, Vegetarian, MeatEater {


    public void sound() {
        System.out.println("Bird singing");

    }

    @Override
    public void fly() {
        System.out.println("The Bird Flies In The Sky");
    }

    @Override
    public void Meat() {
        System.out.println("The Bird Eats Meat ");
    }

    @Override
    public void eatVegetarian() {
        System.out.println("The Bird Eats The Plant");
    }
}
