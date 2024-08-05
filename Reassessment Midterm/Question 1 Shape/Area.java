public class Area extends Shape {
    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double SquareArea(double side) {
        return side * side;
    }

    @Override
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}


/// The area class inherits form shape abastract class , meaning area will implent all abstract methods
//@override indicates that method has been overridden from the super class 
