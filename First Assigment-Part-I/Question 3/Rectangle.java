public class Rectangle {
    // Instance variables
    private double width;
    private double height;
    
    // Static variable for color
    private static String color;
    
    // No-arg constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    
    // Constructor with parameters
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        Rectangle.color = color;
    }
    
    // Getter method for width
    public double getWidth() {
        return width;
    }
    
    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Getter method for height
    public double getHeight() {
        return height;
    }
    
    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Getter method for color
    public static String getColor() {
        return color;
    }
    
    // Setter method for color
    public static void setColor(String color) {
        Rectangle.color = color;
    }
    
    // Method to find the area of the rectangle
    public double findArea() {
        return width * height;
    }
    
    // Method to find the perimeter of the rectangle
    public double findPerimeter() {
        return 2 * (width + height);
    }
    
    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(4.0, 5.0, "Blue");
        
        // Display the width, height, and color
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        
        // Display the area and perimeter
        System.out.println("Area: " + rect.findArea());
        System.out.println("Perimeter: " + rect.findPerimeter());
    }
}
