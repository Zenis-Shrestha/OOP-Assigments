public class ComparableCylinder extends Cylinder implements Comparable<ComparableCylinder> {
    public ComparableCylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public int compareTo(ComparableCylinder o) {
        if (this.getVolume() > o.getVolume()) {
            return 1;
        } else if (this.getVolume() < o.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}
