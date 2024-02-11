package Jalase5.BilsBerger;

public class Main {
    public static void main(String[] args) {
        BaseBerger baseBerger=new BaseBerger();
        baseBerger.showPriceBaseBerger();
        BaseBerger baseBerger1=new BaseBerger("kahoo","goje","Khiyarshoor","Chips");
        baseBerger1.showPriceBaseBerger();
        healthyBurger healthyBurger=new healthyBurger();
        healthyBurger.showHealthyBurgerPrice();

    }
}
