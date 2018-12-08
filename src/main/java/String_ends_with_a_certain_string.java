package main.java;

public class String_ends_with_a_certain_string {

    public static void main(String[] args){

        String a1 = new String("Hello world");
        String a2 = new String("Ana are mere si coacaze");
        System.out.println("Returned Value = " + a1.endsWith( "rld" ) );
        System.out.println("Returned Value = " + a1.endsWith( "word" ) );
        System.out.println("Returned Value = " + a2.endsWith( "rld" ) );
        System.out.println("Returned Value = " + a2.endsWith( "acaze" ) );
    }
}
