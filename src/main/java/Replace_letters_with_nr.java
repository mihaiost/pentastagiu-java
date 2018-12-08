/*Write a program that will return a different string representing the alphabet index of each letter.

Assuming we have the following alphabet encoding

a = 0
b = 1
c = 2
d = 3
…

For the given string “abcd” the output should be “0123”*/

package main.java;

public class Replace_letters_with_nr {

    public static void main(String[] args){
        String a1 = new String("Hello world");
        String a2 = new String("teleenciclopedia este o emisiune tv");
        a1=a1.replace("l","2");
        a1=a1.replace("e","3");
        a1=a1.replace("o","0");
        a2=a2.replace("e","3");
        a2=a2.replace("a","4");
        a2=a2.replace("o","0");
        System.out.println(a1);
        System.out.println(a2);

    }
}
