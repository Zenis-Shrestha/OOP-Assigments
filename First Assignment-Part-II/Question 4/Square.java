public class Square extends GeometricObject implements Colorable {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides of the square.");
    }
}
