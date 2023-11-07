package it.unibo.shapes.impl;
import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {
    
    private final static int numLati = 4;
    private final int lato;

    public Square (final int lato) {
        this.lato=lato;
    }

    public double Perimetro() {
        double perimetro = this.lato*Square.numLati;
        return perimetro;
    }

    public double Area() {
        double area = this.lato*this.lato;
        return area;
    }

    public int getEdgeCount() {
        return Square.numLati;
    }
}