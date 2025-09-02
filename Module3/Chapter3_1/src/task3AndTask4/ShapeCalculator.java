package task3AndTask4;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0 , "blue");
        shapes[1] = new Rectangle(5.0, 2.0, "red");
        shapes[2] = new Triangle(3.0, 6.0 , "Green");

        for (Shape shape : shapes) {
            System.out.println( " (Color : " + shape.getColor() + ") - Area of " + shape.getName() + " : " + shape.calculateArea());

        }
    }

}