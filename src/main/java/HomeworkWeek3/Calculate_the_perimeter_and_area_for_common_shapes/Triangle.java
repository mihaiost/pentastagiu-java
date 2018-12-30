package main.java.HomeworkWeek3.Calculate_the_perimeter_and_area_for_common_shapes;

public class Triangle extends CommonShape{

    protected int l1, l2, l3, base, height;

    protected Triangle(int l1, int l2, int base, int height){
        this.base = base;
        this.height = height;
        this.l1 = l1;
        this.l2 = l2;
    }

    protected void area(){
        super.Area = base*height/2;
        if ( max < super.Area ) {max = super.Area; info="triunghi cu laturile de: " + l1 + ", " + l2 + ", " + l3 + " baza: " + base + " si inaltimea: " + height;}

            }

    protected void perimeter(){
        super.Perimeter = l1 + l2 + base;
    }
}
