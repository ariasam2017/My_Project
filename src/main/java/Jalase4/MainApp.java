package Jalase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    public static void main(String[] args) throws IOException {
        System.out.println( "Result "+factorial(5));


    }
    public static Integer factorial(Integer input){
        System.out.println("factorial caller "+input);
        if (input==1){
            return 1;
        }else {
            return input*factorial(input-1);
        }
    }
}
