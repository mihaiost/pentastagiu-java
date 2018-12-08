package main.java;

public class Concat_2_arrays {

    public static void main(String[] args){
        int[] a1 = new int[]{1,2,3,4,5};
        int[] a2 = new int[]{2,2,6,4,8,10};
        int[] concat = new int[a1.length+a2.length];
        int i=0,k;
        for (k = 0; k < a1.length; k++){ concat[i] = a1[k]; i++;
        }
        for (k = 0; k < a2.length; k++){ concat[i] = a2[k]; i++;
        }
        for (k = 0; k < i; k++)System.out.print(" " + concat[k]);  // :D
    }
}
