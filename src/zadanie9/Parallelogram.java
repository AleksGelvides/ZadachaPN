package zadanie9;

public class Parallelogram extends Quadrangle implements Figure{
    double alpha;
    double beta;
    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(Math.toRadians(beta)));
    }

    @Override
    public double getHeight() {
        return area() / a;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public double perimeter() {
        return 2 * (a * b);
    }
}
