/*<<<<<<< HEAD:src/main/java/Fibonaci_nr_media_lor.java
*//*Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5*//*

package main.java;
=======*/
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/Fibonaci_nr_media_lor.java
import java.util.Scanner;
public class Fibonaci_nr_media_lor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("introdu cate elemente din sirul Fibonaci doresti sa fie afisate: ");
        int n = scan.nextInt();
        int i,p,q;
        double suma = 0;
        p = 1; q =0;
        for(i=0; i<n; i++){
            System.out.print(" " + p);
            suma = suma+p;
            p=p+q;
            q=p-q;}
        System.out.print("\n media aritmetica a primelor " + n + " elemente ale sirului Fibonaci este: " + (suma/n));
}
}
