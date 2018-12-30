/*la cerintele problemei se spune sa folosim enum notiune invatat abia la lectia de saptamana urmatore :) primirii temei
motiv pentru care nu l-am folosit am incercat sa folosesc pe cat posibil doar notiunile invatate pana in momentul in
care am primit tema :D*/

package main.java.HomeworkWeek3.the_Book_and_Candy_shop;

public class the_Book_and_Candy_shop {

    public static void main(String[] args) {

        Client client = new Client("Anna", "silver", 3124);

        Book book1 = new Book(" John ", " Farming mineral water ", 120, 3359);
        Book book2 = new Book(" James ", " Understanding nothing from Java ", 300, 4244);

        Candy candy1 = new Candy(200, " marshmallow ", 10, 4586);
        Candy candy2 = new Candy(500, " m&m's ", 20, 4587);

        Basket basket = new Basket();

        basket.total_price = 0;
        basket.content = " ";

        basket.customer = client.name;
        basket.total_price += candy1.getcandy(20);
        basket.content = basket.content.concat(candy1.name);

        basket.total_price += candy2.getcandy(15);
        basket.content = basket.content.concat(candy2.name);

        basket.total_price += candy1.getcandy(35);

        basket.total_price += book2.price;
        basket.content = basket.content.concat(book2.name);

        System.out.println("ur basket contains: " + basket.content);

        switch (client.membership){

            case "gold":
                System.out.println("total price: " + basket.total_price + " discount: " + basket.total_price*0.2 + " final price: " + basket.total_price*0.8);
                break;
            case "silver":
                System.out.println("total price: " + basket.total_price + " discount: " + basket.total_price*0.1 + " final price: " + basket.total_price*0.9);
                break;
            case "none":
                System.out.println("total price: " + basket.total_price);
                break;
        }




    }
}
