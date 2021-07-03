package zadanie9;

public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(2) * a;
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return Math.pow(a,2);
    }

    @Override
    public double perimeter() {
        return a * 4;
    }
}
