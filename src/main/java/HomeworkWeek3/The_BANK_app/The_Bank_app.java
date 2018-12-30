package main.java.HomeworkWeek3.The_BANK_app;

import java.util.Scanner;

public class The_Bank_app {
    public static void main(String[] args) {

        Account a1 = new Account(1000);
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        boolean k = true;

        while ( k ) {
                System.out.print("apasa 1 pentru deposit sau 2 pentru extragere: ");
                int tranzactie = scan.nextInt();

                if (tranzactie == 1) {
                    System.out.print("introdu suma pe care vrei sa o depozitezi: ");
                    suma = scan.nextInt();
                    a1.deposit(suma);
                    System.out.println("Doriti sa faceti alte tranzactii? y/n: ");
                    if (scan.next().matches("y")) k = true;
                    else k = false;
                }
                else {System.out.print("introdu suma pe care vrei sa o extragi: ");
                    suma = scan.nextInt();
                    a1.withdraw(suma);
                    System.out.println("Doriti sa faceti alte tranzactii? y/n: ");
                    if (scan.next().matches("y")) k = true;
                    else k = false;

                }
            System.out.println("in cont mai aveti: " + a1.getBalance());

            }
        }



    }
