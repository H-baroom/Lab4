import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        System.out.println(circle1.getRadius());
        System.out.printf("%.2f%n",circle1.calculateArea());
        System.out.printf("%.2f%n",circle1.calculateCircumference());
        System.out.println("--------------------------------------------------------");
        Circle circle2 = new Circle(25);
        System.out.println(circle2.getRadius());
        System.out.printf("%.2f%n",circle2.calculateArea());
        System.out.printf("%.2f%n",circle2.calculateCircumference());
        System.out.println("--------------------------------------------------------");
        Rectangle rectangle = new Rectangle(9 ,7);
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.printf("%.2f%n",rectangle.calculateArea());
        System.out.printf("%.2f%n",rectangle.calculateCircumference());
        System.out.println("--------------------------------------------------------");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(20);
        rectangle2.setWidth(13);
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getWidth());
        System.out.printf("%.2f%n",rectangle2.calculateArea());
        System.out.printf("%.2f%n",rectangle2.calculateCircumference());
        System.out.println("--------------------------------------------------------");
        Triangle triangle1 = new Triangle(10,13);
        System.out.println(triangle1.getHeight());
        System.out.println(triangle1.getBase());
        System.out.printf("%.2f%n",triangle1.calculateArea());
        System.out.printf("%.2f%n",triangle1.calculateCircumference());
        System.out.println("--------------------------------------------------------");
        Triangle triangle2 = new Triangle();
        triangle2.setBase(15);
        triangle2.setHeight(23);
        System.out.println(triangle2.getHeight());
        System.out.println(triangle2.getBase());
        System.out.printf("%.2f%n",triangle2.calculateArea());
        System.out.printf("%.2f%n",triangle2.calculateCircumference());



    }
}