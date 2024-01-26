package Jalase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    public static void main(String[] args) throws IOException {
        System.out.println("Please Enter A Number!");
        int DayOfWeek= Input();
        switch (DayOfWeek){
            case 1:
                System.out.println("شنبه");
                break;
            case 2:
                System.out.println("یک شنبه");
            case 3:
                System.out.println("دوشنبه");
                break;
            case 4:
                System.out.println("سشنبه");
                break;
            case 5:
                System.out.println("چهارشنبه");
                break;
            case 6:
                System.out.println("پنجشنبه");
                break;
            case 7:
                System.out.println("جمعه");
                break;
            default:
                System.out.println("در محدوده روز های هفته نمی باشد !");
        }
    }

    public static Integer Input()  {      //User Input
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.valueOf(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

