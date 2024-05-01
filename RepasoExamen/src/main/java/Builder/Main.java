package Builder;

public class Main {
	public static void main(String[] args) {
        House house = new House.Builder()
                            .setBedrooms(3)
                            .setBathrooms(2)
                            .setGarages(2)
                            .setSwimmingPool(true)
                            .build();

        System.out.println("Características de la casa:");
        System.out.println("Habitaciones: " + house.getBedrooms());
        System.out.println("Baños: " + house.getBathrooms());
        System.out.println("Garajes: " + house.getGarages());
        System.out.println("Piscina: " + (house.hasSwimmingPool() ? "Sí" : "No"));
    }
}
