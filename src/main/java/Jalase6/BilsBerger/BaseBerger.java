package Jalase5.BilsBerger;

public class BaseBerger  implements additive{
    private Double bread=7000d;
    private Double meat=8000d;
    private int price= (int) (bread+meat);

    public BaseBerger(String kahoo,String goje,String PickledCucumber,String chips) {
        int afzodani=price+=lettuce+tomato+pickledCucumber+Chips;
    }

    public BaseBerger() {
    }

    public Double getMeat() {
        return meat;
    }

    public void showPriceBaseBerger(){
        BaseBerger baseBerger=new BaseBerger();
        System.out.println("The Base Berger include One Bread And One Meat Price is :"+this.price);
    }
}
