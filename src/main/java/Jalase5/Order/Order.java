package Jalase5.Order;

public class Order {
    private String description;
    private int price;

    public void order(String description,int price){
        System.out.println("description is : "+ description+ " And "+ "price is : "+price);
    }
}
