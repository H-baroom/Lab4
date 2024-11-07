import static java.lang.Math.round;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    Rectangle(){}


    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", Circumference = " + calculateCircumference() +
                ", Area = " + calculateArea() +
                '}';
    }
}
