package main.java;

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
