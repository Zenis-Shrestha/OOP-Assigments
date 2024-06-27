public class RectangleClient {
    public static void main(String[] args) {
        // Create the first Rectangle object with width 5, height 50, and color yellow
        Rectangle rect1 = new Rectangle(5.0, 50.0, "Yellow");
        
        // Create the second Rectangle object with width 5, height 50, and color yellow
        Rectangle rect2 = new Rectangle(5.0, 50.0, "Yellow");

        // Set the color to yellow for both rectangles (color is static, so setting it once is enough)
        Rectangle.setColor("Yellow");

        // Display the properties and areas of both Rectangle objects
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect1.findArea());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Color: " + Rectangle.getColor());
        System.out.println("Area: " + rect2.findArea());
    }
}
