package Factory;

public class Main {
    public static void main(String[] args) {
        
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE);
        triangle.draw();
    }
}
