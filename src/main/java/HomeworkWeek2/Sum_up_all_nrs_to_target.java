/*<<<<<<< HEAD:src/main/java/Sum_up_all_nrs_to_target.java
*//*Write a program that will sum up all numbers from 0 up to a target number.
For example, for an input number 5, result should be 15 (0+1+2+3+4+5)*//*

package main.java;
=======*/
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/Sum_up_all_nrs_to_target.java
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
