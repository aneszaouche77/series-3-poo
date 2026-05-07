package Anes;

public class TestShape {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Rectangle Perimeter = " + rectangle.perimeter());

        System.out.println();

        System.out.println("Circle Area = " + circle.area());
        System.out.println("Circle Perimeter = " + circle.perimeter());
    }
}