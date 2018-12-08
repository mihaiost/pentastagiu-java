/*Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:

Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.5*/

package main.java;
import java.util.Scanner;
public class Average_and_sum_of_all_nr_between_range {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("introdu primul numar intreg dorit: ");
        int n1 = scan.nextInt();
        System.out.print("\nintrodu al doilea numar intreg dorit mai mare ca primul numar introdus: ");
        int n2 = scan.nextInt();
        int i;
        double suma=n1;
        for(i = n1+1; i<=n2; i++){suma=suma+i;}
        System.out.println("suma numerelor intre " + n1 + " si " + n2 + " este: " + suma + "\n media aritmetica a lor este: " + suma/(n2-n1+1));
    }

}
