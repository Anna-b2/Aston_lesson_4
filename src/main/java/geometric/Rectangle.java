package geometric;

class Rectangle implements Figure, Color {
    private double width;
    private double length;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    public void printFeatures() {
        System.out.println("ИНФОРМАЦИЯ О ПРЯМОУГОЛЬНИКЕ");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("                   ");
    }
}