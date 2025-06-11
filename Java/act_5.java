// Activity: Create a method calculateArea() with different parameters to find area of circle and rectangle.


class AreaCalculator {
    // Method to calculate area of a circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    int calculateArea(int length, int width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Call overloaded methods
        System.out.println("Area of Circle: " + calculator.calculateArea(7.0));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(5, 10));
    }
}
