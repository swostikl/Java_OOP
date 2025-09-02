package task3AndTask4;

public class Rectangle extends Shape {
    private double length;
    private double breadth;


    public Rectangle(double length, double breadth ,String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return (length * breadth);
    }

    @Override
    public String getName() {
            return "Rectangle";
    }
}
