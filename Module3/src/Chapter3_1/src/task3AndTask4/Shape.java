package task3AndTask4;

public class Shape {

    private String color; // task4
    public Shape(String color) {
        this.color = color;
    }
    //getters
    public String getColor() {
        return color;
    }
    //method
    public double calculateArea() {
        return 0; //default implementation
    }

    public String  getName() {
        return " Shape" ;
    }

}
