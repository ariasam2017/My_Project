package Jalase5.Liskov.tamrin8;

public class Bird extends Animal implements Flyer{
    @Override
    public void Fly() {
        System.out.println("Birds is a Flying");
    }
}
