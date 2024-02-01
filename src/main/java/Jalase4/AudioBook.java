package Jalase4;

public class AudioBook extends Book{

    public AudioBook(){

      this.author="type";
      super.printPaper();
    }
    @Override
    public void printPaper(){
        super.printPaper();
        System.out.println("Print new Paper");
    }

    private String type;

    public void convertType(String newType){
        this.type=newType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salam AudioBook!");
    }
}
