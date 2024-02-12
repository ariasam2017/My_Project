package Jalase7;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTamrin {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Amir");
        list.add("Mohammad");
        list.add("Nima");
        System.out.println("All Names Print : ");
        for (String list1:list){
            System.out.println(list1);
        }
        System.out.println("----------------");
        System.out.println("Size List : "+list.size());
        System.out.println("----------------");
        System.out.println("Name is Found Name :");
        if (list.contains("Mohammad")){
            System.out.println("Found");
        }else {
            System.out.println("Name is NotFound");
        }
    }
}
