package Anes;

public class TestShape {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(4);

        System.out.println("Rectangle Area = " + r.area());
        System.out.println("Rectangle Perimeter = " + r.perimeter());

        System.out.println();

        System.out.println("Circle Area = " + c.area());
        System.out.println("Circle Perimeter = " + c.perimeter());
    }
}
