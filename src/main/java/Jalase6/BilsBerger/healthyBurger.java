package Jalase5.BilsBerger;

public class healthyBurger extends BaseBerger implements additive{
    Integer wholemealBread=3000;

    public void showHealthyBurgerPrice() {
        BaseBerger baseBerger=new BaseBerger();
        int price= (int) (wholemealBread+baseBerger.getMeat()+lettuce+tomato+pickledCucumber+Chips+sauce+SoftDrink);
        System.out.println("the baseBerger Price is : "+price);

    }
}
