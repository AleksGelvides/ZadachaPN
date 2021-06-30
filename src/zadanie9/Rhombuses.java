package zadanie9;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha, beta;
    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
    }

    @Override
    double getLargeDiagonal() {
        return Math.toRadians(a * Math.sqrt(2 - 2 * Math.cos(alpha)));
    }

    @Override
    double getHeight() {
//        return a * Math.sin();
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
