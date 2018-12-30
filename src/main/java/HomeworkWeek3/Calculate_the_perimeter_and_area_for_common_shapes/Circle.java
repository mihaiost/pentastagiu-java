package main.java.HomeworkWeek3.Calculate_the_perimeter_and_area_for_common_shapes;


public class Circle extends CommonShape {
    protected int radius;

    protected Circle(int radius){
        this.radius = radius;
    }

    protected void area() {
        super.Area = this.radius * this.radius * 3;
        if ( max < super.Area ) {max = super.Area; info="cerc cu raza de: " + radius;}
    }
    protected void circumference(){
            super.Perimeter = this.radius*2*3;
        }



}
