package Classes;

public class Scooter implements IFactory {

    @Override
    public void drive(int miles) {
        System.out.println("Drive the Scooter: " + miles + " km");  // Use System.out for output
    }
    
    public void color(String color) {
    	System.out.println("Color the Scooter: " + color);
    }
}