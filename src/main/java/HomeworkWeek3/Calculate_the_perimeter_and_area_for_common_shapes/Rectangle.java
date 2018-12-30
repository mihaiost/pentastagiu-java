package main.java.HomeworkWeek3.Calculate_the_perimeter_and_area_for_common_shapes;

public class Rectangle extends CommonShape {

    protected int height, width;

    protected Rectangle(int height, int width){
        this.width = width;
        this.height =height;

    }

    protected void area(){
        super.Area = height*width;
        if ( max < super.Area ) {max = super.Area; info="dreptunghi cu inaltimea de: " + height + " si lungimea de: " + width;}
    }
    protected void perimeter(){
        super.Perimeter = 2*(height+width);
    }

}
