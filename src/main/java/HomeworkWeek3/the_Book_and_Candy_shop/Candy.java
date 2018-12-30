package main.java.HomeworkWeek3.the_Book_and_Candy_shop;

public class Candy extends Product{

    int quantity;

    public Candy(int quantity, String name, double price, int id){
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public double getcandy(int quantity) {
        if (this.quantity < quantity) {
            System.out.println("ERROR: Cantitate insuficienta");
            return 0;
        } else {
            this.quantity = this.quantity - quantity;
            return quantity * price;
        }
    }

}
