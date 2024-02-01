package Jalase6;

public class OrderProcessor {
    public String saveOrder(String orderName,String orderPrice){
       String result=orderName + orderPrice;
               System.out.println("This Order Name :"+orderName + "This orderPrice :"+ orderPrice);
        return result;
    }
}
