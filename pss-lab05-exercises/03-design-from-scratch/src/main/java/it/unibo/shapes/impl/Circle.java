package it.unibo.shapes.impl;
import it.unibo.shapes.api.Shape;

public class Circle implements Shape {
    
    private final int raggio;
    private final static double pigreco = 3.14;

    public Circle(final int raggio) {
        this.raggio = raggio;
    }

    public double Perimetro() {
        double perimetro = 2*Circle.pigreco*this.raggio;
        return perimetro;
    }

    public double Area() {
        double area = Circle.pigreco*(this.raggio+this.raggio);
        return area;
    }

    public static void main (String[] args) {
        Circle cerchio = new Circle(3);
        double perimetro = cerchio.Perimetro();
        System.out.println(perimetro);
    }
}
