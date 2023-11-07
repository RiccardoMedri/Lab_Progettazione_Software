package it.unibo.shapes.test;
import it.unibo.shapes.impl.Triangle;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Rectangle;

public class WorkWithShapes {

    public static void main (String[] args) {
        Circle cerchio = new Circle(4);
        System.out.println(cerchio.Perimetro());
        System.out.println(cerchio.Area());
        
        Triangle triangolo = new Triangle(3, 4, 5);
        System.out.println(triangolo.Perimetro());
        System.out.println(triangolo.Area());

        Square quadrato = new Square(5);
        System.out.println(quadrato.Perimetro());
        System.out.println(quadrato.Area());

        Rectangle rettangolo = new Rectangle(4, 5);
        System.out.println(rettangolo.Perimetro());
        System.out.println(rettangolo.Area());
    }
}