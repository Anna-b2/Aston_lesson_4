package geometric;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        circle.setFillColor("Красный");
        circle.setBorderColor("Зеленый");
        circle.printFeatures();

        Rectangle rectangle = new Rectangle(2.5,4.5);
        rectangle.setFillColor("Синий");
        rectangle.setBorderColor("Белый");
        rectangle.printFeatures();

        Triangle triangle = new Triangle(2, 2.85, 4.7);
        triangle.setFillColor("Желтый");
        triangle.setBorderColor("Черный");
        triangle.printFeatures();
    }
}
