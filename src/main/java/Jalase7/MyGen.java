package Jalase7;

import java.util.ArrayList;
import java.util.List;

public class MyGen <E>{
    E element;

    public void setElement(E element) {
        this.element = element;
    }
    public void print(){
        System.out.println(element);
    }

    public E getElement() {
        return element;
    }

    public static void main(String[] args) {
        MyGen<String> myGen=new MyGen<>();
        myGen.setElement("Amirhossein");
        myGen.print();
       // String m=myGen.getElement();
        List myInterfaceList=new ArrayList();
    }
}
