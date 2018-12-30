/*<<<<<<< HEAD:src/main/java/String_ends_with_a_certain_string.java
*//*Write a program that will test whether a string ends with another string

For example
Given the following strings “Hello java world” and “orld” the output should be TRUE
*//*

package main.java;
=======*/
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/String_ends_with_a_certain_string.java

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
