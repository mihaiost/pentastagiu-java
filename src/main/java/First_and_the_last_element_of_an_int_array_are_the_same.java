package main.java;
import java.util.Scanner;
public class First_and_the_last_element_of_an_int_array_are_the_same {

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("introdu numarul de elemente al sirului: ");
    int n = scan.nextInt();
    int i;
    int a[] = new int[n];
    for(i=0;i<n;i++){ System.out.print("introdu elementul " + (i+1) + " al sirului: ");
        a[i]= scan.nextInt();}
        if (a[0] == a[n-1]) System.out.print("primul element este identic cu ultimul");
        else System.out.print("primul element este diferit de ultimul");
}
}
