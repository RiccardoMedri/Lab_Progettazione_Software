package it.unibo.shapes.impl;
import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon{
    
    private final static int numLati = 4;
    private final int lato1;
    private final int lato2;

    public Rectangle(final int lato1, final int lato2) {
        this.lato1=lato1;
        this.lato2=lato2;
    }

    public double Perimetro() {
        double perimetro = (this.lato1+this.lato2)*2;
        return perimetro;
    }

    public double Area() {
        double area = this.lato1 * this.lato2;
        return area;
    }

    public int getEdgeCount() {
        return Rectangle.numLati;
    }
}