package figure;

public class Figure {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.getP());
        System.out.println(circle.getS());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getP());
        System.out.println(rectangle.getS());


        Triangle triangle = new Triangle();
        System.out.println(triangle.getP());
        System.out.println(triangle.getS());

    }
}
