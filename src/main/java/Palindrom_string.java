package main.java;

public class Palindrom_string {



        public static void main(String args[]) {
            String a1 = ("Hello world");
            String a2 = ("teleenciclopedia este o emisiune tv");
            System.out.println(palim(a1));
            System.out.println(palim(a2));
            System.out.println(palim("abcdefgfedcba"));
            System.out.println(palim("abcdfegfedcba"));

        }
        private static boolean palim(String a) {
            boolean k = true;
            int i;
            for (i = 0; i < a.length() / 2; i++) {
                if (a.charAt(i) != a.charAt(a.length()-1-i)) k=false;
            }
            return k;
        }
    }
