package main.java;

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
