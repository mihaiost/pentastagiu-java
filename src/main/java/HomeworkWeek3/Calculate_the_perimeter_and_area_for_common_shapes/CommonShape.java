package main.java.HomeworkWeek3.Calculate_the_perimeter_and_area_for_common_shapes;

public class CommonShape {
    protected int Perimeter;
    protected int Area;
    protected static int max=0;
    protected static String info= new String();



    /*static {
        if (this.Area > this.max) {
            this.max = this.Area;
        }

    }*/

    protected void print_area(){
        System.out.println(this.Area);
    }
    protected void print_perimeter(){
        System.out.println(this.Perimeter);
    }

}
