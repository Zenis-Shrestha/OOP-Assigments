public abstract class GeometricObject implements Comparable<GeometricObject> {
    // Abstract method to get area (to be implemented in subclasses)
    public abstract double getArea();

    // Implementing compareTo method based on area
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Static method to find the larger of two GeometricObjects
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
}
