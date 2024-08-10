public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1); 
        
        Circle c2 = new Circle(2.5);
        System.out.println(c2); 

        Circle c3 = new Circle(3.5, "blue");
        System.out.println(c3); 

        System.out.println("Color of c3: " + c3.getColor()); 

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("Radius of c4: " + c4.getRadius()); 
        c4.setColor("green");
        System.out.println("Color of c4: " + c4.getColor()); 

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString()); 
        
        Circle c6 = new Circle(6.6);
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6); 
    }
}
