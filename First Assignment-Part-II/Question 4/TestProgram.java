public class TestProgram {
    public static void main(String[] args) {
        // Test for circles
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        Circle largerCircle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println("Larger Circle: Radius = " + ((Circle) largerCircle).radius);

        // Test for cylinders
        Cylinder cylinder1 = new Cylinder(3.0, 5.0);
        Cylinder cylinder2 = new Cylinder(2.0, 4.0);

        Cylinder largerCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
        System.out.println("Larger Cylinder: Radius = " + ((Circle) largerCylinder).radius + ", Height = " + largerCylinder.getHeight());
    }
}
