package Jalase5;

public class Pejo extends Car{

    public Pejo() {
        Car car=new Car();
        car.setSpeed(200);
    }
    public void gearChange(){
        System.out.println("تغییر دنده به صورت اتوماتیک انجام می شود ");
    }
}
