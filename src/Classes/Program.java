package Classes;

public class Program {

    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.getVehicle("Scooter");
        scooter.drive(10);  // Use lowercase method name
        scooter.color("rosa");

        IFactory bike = factory.getVehicle("Bike");
        bike.drive(20);  // Use lowercase method name

        System. out.println("Program finished.");  // Use System.out for output
    }
}