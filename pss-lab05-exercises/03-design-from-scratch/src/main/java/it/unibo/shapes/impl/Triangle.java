package it.unibo.shapes.impl;
import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {

    private final static int numLati = 3;
    private final int lato1;
    private final int lato2;
    private final int lato3;

    public Triangle(final int lato1, final int lato2, final int lato3) {
        this.lato1=lato1;
        this.lato2=lato2;
        this.lato3=lato3;
    }

    public double Perimetro() {
        double perimetro = this.lato1+this.lato2+this.lato3;
        return perimetro;
    }

    public double Area() {
        final double semiPerimeter = this.Perimetro() / 2;
        return Math.sqrt(
            semiPerimeter * (semiPerimeter - this.lato1) * (semiPerimeter - this.lato2) * (semiPerimeter - this.lato3)
        );
    }

    public int getEdgeCount() {
        return Triangle.numLati; 
    }
}
