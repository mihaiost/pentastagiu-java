package main.java;

public class String_inside_another_string {

    public static void main(String args[]) {
        String a1 = new String("Hello world");
        String a2 = new String("Ana are mere");
        String a3 = new String("Iarna nu e ca vara");

        System.out.println(a1.matches("(.*)llo(.*)"));
        System.out.println(a2.matches("(.*) are(.*)"));
        System.out.println(a2.matches("(.*)llo(.*)"));
        System.out.println(a3.matches("(.*)nu e(.*)"));
    }
}