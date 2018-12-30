package main.java.HomeworkWeek3.Calculate_the_perimeter_and_area_for_common_shapes;

public class Calculate_the_perimeter_and_area_for_common_shapes {
    public static void main(String[] args) {

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(11);
        Circle c3 = new Circle(6);
        c1.area();
        c2.area();
        c3.area();
        c1.circumference();
        c2.circumference();
        c3.circumference();
        /*System.out.print("Area of circle 1 is: "); c1.print_area();
        System.out.print("Area of circle 2 is: "); c2.print_area();
        System.out.print("Area of circle 3 is: "); c3.print_area();*/

        Square s1 = new Square( 8);
        Square s2 = new Square( 18);
        Square s3 = new Square( 81);
        s1.area();
        s2.area();
        s3.area();
        s1.perimeter();
        s2.perimeter();
        s3.perimeter();
        /*System.out.print("Area of square 1 is: "); s1.print_area();
        System.out.print("Area of square 2 is: "); s2.print_area();
        System.out.print("Area of square 3 is: "); s3.print_area();*/

        Rectangle r1 = new Rectangle(3, 8);
        Rectangle r2 = new Rectangle(5, 11);
        Rectangle r3 = new Rectangle(22, 9);
        r1.area();
        r2.area();
        r3.area();
        r1.perimeter();
        r2.perimeter();
        r3.perimeter();
        /*System.out.print("Area of rectangle 1 is: "); r1.print_area();
        System.out.print("Area of rectangle 2 is: "); r2.print_area();
        System.out.print("Area of rectangle 3 is: "); r3.print_area();*/

        Triangle t1 = new Triangle(8,11,4,11);
        Triangle t2 = new Triangle(8,19,6,13);
        Triangle t3 = new Triangle(9,9,9,12);
        t1.area();
        t2.area();
        t3.area();
        t1.perimeter();
        t2.perimeter();
        t3.perimeter();

        System.out.println("aria cea mai mare este de: " + CommonShape.max + " si este a unui " + CommonShape.info);
    }
}
