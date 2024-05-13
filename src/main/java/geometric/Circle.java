package geometric;

class Circle implements Figure, Color{
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI ;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    public void printFeatures() {
        System.out.println("ИНФОРМАЦИЯ О КРУГЕ");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("                   ");
    }
}