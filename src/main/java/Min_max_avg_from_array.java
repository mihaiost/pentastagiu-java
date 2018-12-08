/*Write a java program that will return the min, max and average values in a given array.

For example 
GIven the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3*/

package main.java;

public class Min_max_avg_from_array {

    public static void main(String[] args){
        int[] a = new int[]{2,2,6,1,4,8,10};
       int i,min,max;
       double sum=a[0];
       min=max=a[0];
       for(i=1; i<a.length; i++) {
           if (a[i] < min) min = a[i];
           if (a[i] > max) max = a[i];
           sum = sum + a[i];
       }
       System.out.println("minim in sir este: " + min + "\n maxim in sir este: " + max + "\n media artimetica a nr din sir este: " + sum/a.length);
    }
}
