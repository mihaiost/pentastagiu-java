package main.java.HomeworkWeek3.Display_messages_app;
import java.util.Scanner;
public class User {

    private String name, email;
    Scanner scan = new Scanner(System.in);


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String validate(String name){
       String p = " ";
        if ( name.matches(this.name)) {
            System.out.println("mesajul pe care doriti sa il scrieti: ");p = "utilizatorul " + this.name + " a scris " + scan.next() + " ";}
        return p;
    }

}
