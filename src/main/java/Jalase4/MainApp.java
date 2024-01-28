package Jalase4;

public class MainApp {
    public static void main(String[] args) {
        Book book = new Book("Book-1 ", "Nevisande-1");     //Constructor Ba 2 Meghdar Vorudi
        book.displayInfo();
        Book book1 = new Book();
        book1.displayInfo();       //Default Value
    }
}
