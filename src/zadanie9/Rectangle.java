package zadanie9;

import zadanie9.Figure;
import zadanie9.Quadrangle;

class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    @Override
    double getHeight() {
        if(a < b){
            return a;
        } else
        return b;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
