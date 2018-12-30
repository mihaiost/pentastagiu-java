package main.java.HomeworkWeek3.the_Book_and_Candy_shop;

public class Book extends Product{

    String author;

    public Book(String author, String name, double price, int id){
        this.author = author;
        this.name = name;
        this.price = price;
        this.id = id;
    }
}
