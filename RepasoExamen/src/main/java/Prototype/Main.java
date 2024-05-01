package Prototype;

public class Main {
    public static void main(String[] args) {
    
        VehiclePrototype originalVehicle = new Vehicle("Toyota", "Rojo", 2020);
        VehiclePrototype clonedVehicle = originalVehicle.clone();
        
        ((Vehicle)clonedVehicle).setYear(2021);
        
        System.out.println("Detalles del prototipo original:");
        ((Vehicle)originalVehicle).printDetails();
        
        System.out.println("\nDetalles del clon:");
        ((Vehicle)clonedVehicle).printDetails();
    }
}
