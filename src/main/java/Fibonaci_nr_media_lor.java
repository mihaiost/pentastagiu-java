package main.java;
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
