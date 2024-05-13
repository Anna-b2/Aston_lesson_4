package geometric;

class Triangle implements Figure, Color {
    private double first_side;
    private double second_side;
    private double third_side;
    private String fillColor;
    private String borderColor;

    public Triangle(double first_side, double second_side, double third_side) {
        this.first_side = first_side;
        this.second_side = second_side;
        this.third_side = third_side;
    }
    public void setFillColor(String color) {
        this.fillColor = color;
    }
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public double calculatePerimeter() {
        return first_side + second_side + third_side;
    }
    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - first_side) * (halfPerimeter - second_side) * (halfPerimeter - third_side));
    }

    public void printFeatures() {
        System.out.println("ИНФОРМАЦИЯ О ТРЕУГОЛЬНИКЕ");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("                   ");
    }
}