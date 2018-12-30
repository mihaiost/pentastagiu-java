//<<<<<<< HEAD:src/main/java/Ins_tag_between_same_char.java
///*Write a program that will insert a # between any duplicate letters that are placed right next to each.
//For example
//
//Given the following string “Hello world” the output should be “Hel#lo world”*/
//
//package main.java;
//=======
package main.java.HomeworkWeek2;
//>>>>>>> penta_stagiu_2018_Mihai_Ostafie:src/main/java/HomeworkWeek2/Ins_tag_between_same_char.java

public class Ins_tag_between_same_char {

    public static void main(String[] args){
        String a1 = new String("Hello world");
        String a2 = new String("teleenciclopedia este o emisiune tv");
        System.out.println(instag( a1,a1.length()));
        System.out.println(instag( a2,a2.length()));
        System.out.println(instag( "heello worrldd",14));

    }
    private static String instag(String a, int k)
    {   int i;
        boolean p=true;
        while (p){
            p=false;
            k=a.length();
            for(i=1; i<k-1; i++){
                if(a.charAt(i) == a.charAt(i+1)) {a=a.substring(0,i+1) + "#" + a.substring(i+1); p=true;}
                }
        }
        return a;
    }
}
