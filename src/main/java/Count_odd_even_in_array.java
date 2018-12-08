package main.java;

public class Count_odd_even_in_array {

            public static void main(String[] args) {
            int[] a = new int[]{2, 2, 6, 1, 4, 8, 9};
            int i, par = 0, impar = 0;
            for (i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) par++;
                else impar++;
            }
            System.out.println("nr de elemente pare in sir este: " + par);
            System.out.println("nr de elemente impare in sir este: " + impar);
        }
    }