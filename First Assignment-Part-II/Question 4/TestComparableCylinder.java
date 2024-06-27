public class TestComparableCylinder {
    public static void main(String[] args) {
        ComparableCylinder cylinder1 = new ComparableCylinder(3.0, 5.0);
        ComparableCylinder cylinder2 = new ComparableCylinder(2.0, 4.0);

        ComparableCylinder largerCylinder = GeometricObject.max(cylinder1, cylinder2);
        System.out.println("Larger ComparableCylinder: Radius = " + ((Circle) largerCylinder).radius + ", Height = " + largerCylinder.getHeight());
    }
}
