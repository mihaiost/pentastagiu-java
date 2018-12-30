package main.java.HomeworkWeek3.Display_messages_app;

import main.java.HomeworkWeek3.the_Book_and_Candy_shop.Basket;

import java.util.Scanner;

public class Display_messages_app {

    /* eu nu am inteles ce vrea sa zica autorul cerintele sunt muuuuult prea neclare pentru nivelul meu de intelegere...
    chiar nu pricep cum sa fac o aplicatie unde diferiti utilizatori se inregistreaza si afiseaza mesaje care apar pe
    acelasi board...
     si cum ar putea diferiti utilizatori sa se inregistreze si sa scrie simultan?!
     sau se inregistreaza unu scrie apoi face log out intra altul scrie si ala apoi isi da out si ala si tot asa?!?!
     chiar nu pricep imi scapa ceva*/

    //in continuare ce am inteles eu

    public static void main(String[] args) {

        User u1 = new User("Ana", "ana@ana.ro");
        User u2 = new User("Ion", "ion@ana.ro");
        Scanner scan = new Scanner(System.in);
        String k = "d", board = " ";


       while ( k.matches("d") ) {
            System.out.print("nume: ");
            String nextinput =scan.next();
            board = board + u1.validate(nextinput);
            board = board + u2.validate(nextinput);
            System.out.println("doriti sa continuati? d/n: ");
            k = scan.next();

        }
        System.out.println("continutul board-ului: " + board);
    }
}
