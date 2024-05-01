package Builder;

public class House {
	private int bedrooms;
    private int bathrooms;
    private int garages;
    private boolean swimmingPool;

    private House() {}

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getGarages() {
        return garages;
    }

    public boolean hasSwimmingPool() {
        return swimmingPool;
    }

    
    static class Builder {
        private final House house;

        // Constructor del Builder
        public Builder() {
            house = new House();
        }

        // Métodos para establecer las características de la casa
        public Builder setBedrooms(int bedrooms) {
            house.bedrooms = bedrooms;
            return this;
        }

        public Builder setBathrooms(int bathrooms) {
            house.bathrooms = bathrooms;
            return this;
        }

        public Builder setGarages(int garages) {
            house.garages = garages;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {
            house.swimmingPool = hasSwimmingPool;
            return this;
        }

        // Método para construir la casa
        public House build() {
            return house;
        }
    }
}
