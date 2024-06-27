public class FanModel {
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Properties
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public FanModel() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 7.0;
        this.color = "brown";
    }

    // Accessor methods (getters)
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Mutator methods (setters)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to return a string representation of the fan's state
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan is off, color: " + color + ", radius: " + radius;
        }
    }

    // Main method to test the FanModel class
    public static void main(String[] args) {
        FanModel fan1 = new FanModel();
        fan1.setSpeed(FAST);
        fan1.setRadius(5);
        fan1.setColor("green");
        fan1.setOn(true);

        FanModel fan2 = new FanModel();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(8);
        fan2.setColor("red");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
