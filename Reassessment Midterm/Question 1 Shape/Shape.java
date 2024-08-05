public abstract class Shape {
    abstract double SquareArea(double side);
    abstract double RectangleArea(double length, double breadth);
    abstract double CircleArea(double radius);
}
//In the code above  an abstract class shape in created with 3 abstract method
//It will be sub class by other class and provide implementaion for abstract meathod

// Abstract method SquareArea will calculate the area of square takkin a single parameter side 
//its return is double as we are calculating area //

//Abstreact method RectangleArea will calculate  the area of rectangle taking 2 parameter lengtha and breadth
//its return type is double as well


//Abstreact method CircleArea will calculate  the area of rectangle taking 2 parameter lengtha and breadth
//its return type is double as well