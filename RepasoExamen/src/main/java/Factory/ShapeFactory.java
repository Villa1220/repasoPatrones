package Factory;

public class ShapeFactory {

	public static Shape createShape(ShapeType type) {
		
		switch (type) {
		case CIRCLE:
			return new Circle();

		case RECTANGLE:
			return new Rectangle();
		case TRIANGLE:
			return new Triangle();
		default:
			return null;
		}
		
	}
}
