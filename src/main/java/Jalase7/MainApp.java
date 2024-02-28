package Jalase7;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainApp {
    public static void main(String[] args) {
        List<String> myStringList=new ArrayList();
        myStringList.add("Amir");
        System.out.println(myStringList.size());
        myStringList.add("Reza");
        System.out.println(myStringList.size());
        myStringList.remove("Amir");
        System.out.println("Remove Item and Size is "+myStringList.size());
        System.out.println(myStringList.contains("Reza"));
        }
}
