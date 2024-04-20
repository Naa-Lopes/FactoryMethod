package Classes;

public abstract class VehicleFactory {

    public abstract IFactory getVehicle(String vehicle);  // Use String for type consistency
}
