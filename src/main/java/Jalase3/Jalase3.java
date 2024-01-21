package Jalase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jalase3 {
    public static void main(String[] args) throws IOException {
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
        System.out.println("Please Enter Your Year");
        Integer count= Input();             //دریافت ورودی از کاربر
        if (count>18){
            System.out.println("شما مجاز به رای دادن هستید");
        } else if (count<=18) {
            System.out.println("شما نمیتوانید رای دهید ");
        }
    }
    public static void Average(Integer a, Integer b){        //Average Method
        System.out.println((a+b)/2);
    }
    public static void NumberOfDay(Integer number){        //Year of Birth
        int yer=1402;
        int cout=number-yer;
        System.out.println("سال تولد شما:"+cout);
    }
    public static Integer Input() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       return Integer.valueOf(reader.readLine());
    }

}
