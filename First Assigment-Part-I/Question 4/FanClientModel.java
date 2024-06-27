public class FanClientModel {
    public static void main(String[] args) {
        // Create a FanModel object
        FanModel fan = new FanModel();
        
        // Assign maximum speed, radius 10, color yellow, and turn it on
        fan.setSpeed(FanModel.FAST);
        fan.setRadius(70);
        fan.setColor("grey");
        fan.setOn(true);
        
        // Display the object by invoking its toString method
        System.out.println(fan.toString());
    }
}
