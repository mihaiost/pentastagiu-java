/*<<<<<<< HEAD:src/main/java/Count_char__appears_array.java
*//*Write a program that will count how many times a character appears in a String

For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2 
(since ‘a’ appears twice in “Hello java world”)*//*
package main.java;
=======*/
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/Count_char__appears_array.java

public class Count_char__appears_array {

    public static void main(String args[]) {
        String a1 = new String("Hello world");
        String a2 = new String("teleenciclopedia este o emisiune tv");


        System.out.println(numara( a1,"a" ));
        System.out.println(numara( a1,"l" ));
        System.out.println(numara( a2,"a" ));
        System.out.println(numara( a2,"e" ));
        System.out.println(numara( a2," " ));
}
        private static int numara (String a, String k)
        {   int i, p=0;
            for(i=0; i<a.length(); i++){
                if(a.charAt(i) == k.charAt(0)) p++;}
            return p;}


}
