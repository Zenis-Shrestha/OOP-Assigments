public class Main {
    public static void main(String[] args) {
        Area area = new Area();
        double circleArea = area.CircleArea(7.8);
        System.out.println("Circle Area: " + circleArea);
        double rectangleArea = area.RectangleArea(5.6, 10.5);
        System.out.println("Rectangle Area: " + rectangleArea);

        double squareArea = area.SquareArea(4.5);
        System.out.println("Square Area: " + squareArea);
    }
}
//the main method is the entry point of any java progam 
//Area area = new Area() creates the instance of Area , which is used to call methods for calculations