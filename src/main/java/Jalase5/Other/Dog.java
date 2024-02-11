package Jalase5.Other;

public class Dog extends Animal{
private String voice;


    public String getVoice() {
        return voice;
    }
    

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void voice(){
        System.out.println("سگ پارس میکند");
    }
}
