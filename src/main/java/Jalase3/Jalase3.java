package Jalase3;

public class Jalase3 {
    public static void main(String[] args) {
   // Average(10,100);       //Average
    int x=2;                    //Assignment Operators Hands-On
    x+=5;
    x-=3;
    x*=10;
        int y=(x/2);
        //System.out.println(y);
       int v=(y/5);
        System.out.println(v);
    NumberOfDay(34);
    }
    public static void Average(Integer a, Integer b){        //Average Method
        System.out.println((a+b)/2);
    }
    public static void NumberOfDay(Integer number){        //Year of Birth
        int yer=1402;
        int cout=number-yer;
        System.out.println("سال تولد شما:"+cout);
    }
    //public static void Input(int num)

}
