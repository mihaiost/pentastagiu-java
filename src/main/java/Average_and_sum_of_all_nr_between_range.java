/*Write a program that will sum up all numbers from 0 up to a target number.
For example, for an input number 5, result should be 15 (0+1+2+3+4+5)*/

package main.java;
import java.util.Scanner;
public class Average_and_sum_of_all_nr_between_range {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("introdu primul numar intreg dorit: ");
        int n1 = scan.nextInt();
        System.out.print("\nintrodu al doilea numar intreg dorit: ");
        int n2 = scan.nextInt();
        int i;
        double suma=n1;
        for(i = n1+1; i<=n2; i++){suma=suma+i;}
        System.out.println("suma numerelor intre " + n1 + " si " + n2 + " este: " + suma + "\n media aritmetica a lor este: " + suma/(n2-n1+1));
    }

}
