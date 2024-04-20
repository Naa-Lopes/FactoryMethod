package Classes;

public class ConcreteVehicleFactory extends VehicleFactory {

    @Override
    public IFactory getVehicle(String vehicle) {
        switch (vehicle) {
            case "Scooter":
                return new Scooter();
            case "Bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Vehicle " + vehicle + " cannot be created"); // Use IllegalArgumentException for invalid arguments
        }
    }
}
