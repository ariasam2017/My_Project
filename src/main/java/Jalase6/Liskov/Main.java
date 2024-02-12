package Jalase5.Liskov;

public class Main {
    public static void main(String[] args) {
        IFrout iFrout=new Orang();
        System.out.println(iFrout.getColor());
        IFrout iFrout1=new Apple();
        System.out.println(iFrout1.getColor());
    }
}
