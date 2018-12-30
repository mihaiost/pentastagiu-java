/*<<<<<<< HEAD:src/main/java/Whether_2_int_arrays_are_equal.java
*//*Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.

For example

For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE*//*

package main.java;
=======*/
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/Whether_2_int_arrays_are_equal.java

public class Whether_2_int_arrays_are_equal {

    public static void main(String[] args){
        int[] a1 = new int[]{1,2,3,4,5};
        int[] a2 = new int[]{2,2,6,4,8,10};
        int[] a3 = new int[]{1,1,3,4,5,12};
        int[] a4 = new int[]{3,2,3,4,5,9,2};
        int[] a5 = new int[]{1,2,3,4,5};
        int[] a6 = new int[]{2,2,3,4};
        System.out.println("a1=a2 " + compara(a1,a2));
        System.out.println("a1=a3 " + compara(a1,a3));
        System.out.println("a1=a4 " + compara(a1,a4));
        System.out.println("a1=a5 " + compara(a1,a5));
        System.out.println("a1=a6 " + compara(a1,a6));
        System.out.println("a2=a3 " + compara(a2,a3));
    }
    private static boolean compara(int[] a, int[] b){
        int i=0, k=0;
        if (a.length == b.length)  {for(i=0; i<a.length; i++){ if (a[i] != b[i]) k=1;}}
        else k=1;
        if (k == 0) return true;
        else return false;
    }
}
