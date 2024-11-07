public class Triangle extends Shape{
    private double height;
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    Triangle(){}
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculateCircumference() {
        double hypotenuse = Math.sqrt((base *base)+(height *height));
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base = " + base +
                ", height = " + height +
                ", Circumference = " + calculateCircumference() +
                ", Area = " + calculateArea() +
                '}';
    }
}
