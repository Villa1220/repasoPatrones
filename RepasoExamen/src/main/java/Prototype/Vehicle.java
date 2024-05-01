package Prototype;

public class Vehicle implements VehiclePrototype {
	private String model;
	private String color;
	private int year;

	public Vehicle(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}

	@Override
	public Vehicle clone() {
		return new Vehicle(this.model, this.color, this.year);
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void printDetails() {
		System.out.println("Modelo: " + model + ", Color: " + color + ", Año: " + year);
	}
}
