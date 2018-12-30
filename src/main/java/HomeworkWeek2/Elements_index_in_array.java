/*<<<<<<< HEAD:src/main/java/Elements_index_in_array.java
*//*Write a java program to return the index of a target element.

For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)*//*

package main.java;
=======*/
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/Elements_index_in_array.java
import java.util.Scanner;
public class Elements_index_in_array {

    public static void main(String[] args){
        int[] a = new int[]{2,2,6,1,4,8,9};
        Scanner scan = new Scanner(System.in);
        boolean k=true;
        int i;
        while (k){
        System.out.println("alege te rog o cifra: ");
        int n = scan.nextInt();
        for(i=0; i<a.length; i++){
            if (n == a[i]) {System.out.println("pozitia in sir la care se afla cifra aleasa de tine este: " + i); k=false;
            }
        }
            if (k) System.out.println("cifra aleasa nu se afla in sir");

        }

    }
}
