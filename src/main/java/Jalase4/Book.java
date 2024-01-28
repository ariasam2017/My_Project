package Jalase4;



public class Book {
    public String title="Name1";
    public String author="Name2";
    public  Integer press=12;
    public Integer releaseDate=1402;

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

    public Book(String title) {
        this.title=title;
    }
    public  Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public Book (){             //Default Constructor

    }



    public void displayInfo(){
        System.out.println("The Book Title is :" +getTitle() + "The author is : "
                + getAuthor() + "The press is :" +getAuthor()+ "The releaseDate is "+ getReleaseDate());
    }


}
