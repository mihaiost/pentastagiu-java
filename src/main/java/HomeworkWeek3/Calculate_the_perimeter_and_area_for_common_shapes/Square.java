package main.java.HomeworkWeek3.Calculate_the_perimeter_and_area_for_common_shapes;

public class Square extends CommonShape {
    protected int lenght;

    protected Square(int lenght){
        this.lenght = lenght;
    }

    protected void area(){
        super.Area = lenght*lenght;
        if ( max < super.Area ) {max = super.Area; info="patrat cu latura de: " + lenght;}
    }
    protected void perimeter(){
        super.Perimeter = 4*lenght;
    }

}