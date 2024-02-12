package Jalase7;

public class MyGen<E> {
    E element;

    public void setElement(E element) {
        this.element = element;
    }
    public void print(){
        System.out.println(element);

    }
    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        MyGen<String> myGen=new MyGen<>();
        myGen.setElement("111");
        myGen.print();
     }
}
