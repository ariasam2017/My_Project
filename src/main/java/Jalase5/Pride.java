package Jalase5;

public class Pride extends Car{
    public Pride() {
        Car car=new Car();
        car.setSpeed(160);
    }
    public void gearChange(){
        System.out.println("تغییر دنده به صورت دستی انجام می شود ");
    }
}
