package main.java;
import java.util.Scanner;
public class Sum_up_all_nrs_to_target {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("introdu un numar intreg dorit: ");
        int tinta = scan.nextInt();
        int suma = 0;
        int i;
        for(i = 0; i <= tinta; i++){suma=suma+i; }
        System.out.println("suma numerelor de la 0 la " + tinta + " este: " + suma);
    }



}
