package Jalase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Book {
    public String title;
    public String author;
    public  Integer press;
    public Integer releaseDate;
    public static Integer saleCount;
    public Integer noneStatic=0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPress() {
        return press;
    }

    public void setPress(Integer press) {
        this.press = press;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    static {
        saleCount=0;
    }
//    public void plusCount(){
//    saleCount++;
//    noneStatic++;
//    }
    public void printSaleCount(){
        System.out.println("SaleCount is "+ saleCount);
        System.out.println("noneStatic is "+ noneStatic);

    }

//    public  Book(String title,String author){
//        this.title=title;
//        this.author=author;
//    }
//    public Book (String title) throws IOException {             //Default Constructor
//       System.out.println("Salam");
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        String input = reader.readLine();
//        if (this.title==title){
//        System.out.println("Book Found");
//    }
//    else {
//        System.out.println("Book Not Found");
//    }
//    }


    public void displayInfo(){
        System.out.println("The Book Title is :" +title + "The author is : "
                + author + "The press is :" +press+
                "The releaseDate is "+ releaseDate);
    }
    public void printPaper(){
        System.out.println("Print Old Paper");
    }
}
