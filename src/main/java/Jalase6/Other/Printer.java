package Jalase5.Other;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public void setTonerLevel(Integer tonerLevel){
        this.tonerLevel=tonerLevel;

    }
    public Printer(int tonerLevel,boolean duplex){
        pagePrinted=0;
        tonerLevel=100;
        if (tonerLevel>-1&&tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
        this.duplex=duplex;
    }
    public int printPages(int pageCount){
        int pagesToPrint=pageCount;
        if (duplex){
            pagesToPrint=pageCount/2;

        }
        this.pagePrinted+=pagesToPrint;
        return pagePrinted;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagePrinted() {
        return this.pagePrinted;
    }

    public int addTonerLevel(int addToner){
        if (tonerLevel>0&&tonerLevel<100){
            if (this.tonerLevel+addToner>100){
                System.out.println("Toner is Full");
            }
            this.tonerLevel+=addToner;
            return tonerLevel;

        }else {
            return -1;
        }
    }
}
