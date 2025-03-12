package Part3.ex5;

import Part3.ex5.classes.*;

import java.util.ArrayList;

public class TestCosGeometric {
    public static void main(String[] args) {
        ArrayList<Figura2D> figuresBidimensionals = new ArrayList<>();
        ArrayList<Figura3D> figuresTridimensionals = new ArrayList<>();

        Cercle cercle = new Cercle(1, 4);
        Rectangle rectangle = new Rectangle(2, 4, 6);
        Cilindre cilindre = new Cilindre(3, 4, 6);
        Piramide piramide = new Piramide(4, 4, 6);

        figuresBidimensionals.add(cercle);
        figuresBidimensionals.add(rectangle);
        figuresTridimensionals.add(cilindre);
        figuresTridimensionals.add(piramide);

        System.out.println("Figures bidimensionals:");
        for (Figura2D figura2D : figuresBidimensionals) {
            System.out.println(figura2D);
            if (figura2D instanceof Cercle) {
                System.out.println("Perimetre del cercle: " + cercle.perimetre() + " m.");
                System.out.println("Area del cercle: " + cercle.area() + " m2.\n");
            } else if (figura2D instanceof Rectangle) {
                System.out.println("Perimetre del rectangle: " + rectangle.perimetre() + " m.");
                System.out.println("Area del rectangle: " + rectangle.area() + " m2.\n");
            }
        }

        System.out.println("Figures tridimensionals:");
        for (Figura3D figura3D : figuresTridimensionals) {
            System.out.println(figura3D);
            if (figura3D instanceof Cilindre) {
                System.out.println("Perimetre del cilindre: " + cilindre.perimetre() + " m.");
                System.out.println("Area del cilindre: " + cilindre.area() + " m2.");
                System.out.println("Volum del cilindre: " + cilindre.volum() + " m3.\n");
            }
            else if (figura3D instanceof Piramide) {
                System.out.println("Perimetre de la piramide: " + piramide.perimetre() + " m.");
                System.out.println("Area de la piramide: " + piramide.area() + " m2.");
                System.out.println("Volum de la piramide: " + piramide.volum() + " m3.\n");
            }
        }
    }
}