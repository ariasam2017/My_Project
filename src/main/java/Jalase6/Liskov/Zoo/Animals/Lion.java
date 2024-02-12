package Jalase5.Liskov.Zoo.Animals;

import Jalase5.Liskov.Zoo.Move.Walking;

public class Lion extends Animal implements Walking {
    public void sound(){
        System.out.println("The lion is roaring");
    }
    @Override
    public void Walk() {
        getSound("The Lion Walks In The Forest");
    }
}
