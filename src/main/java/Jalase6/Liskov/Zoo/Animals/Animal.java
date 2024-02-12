package Jalase5.Liskov.Zoo.Animals;

public abstract class Animal {
    private String sound;

    public String getSound(String sound) {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
