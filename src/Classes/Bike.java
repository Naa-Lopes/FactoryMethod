package Classes;

public class Bike implements IFactory {

    @Override
    public void drive(int miles) {
        System.out.println("Drive the Bike: " + miles + " km");  // Use System.out for output
    }
}
