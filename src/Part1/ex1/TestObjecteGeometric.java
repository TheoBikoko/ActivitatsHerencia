package Part1.ex1;

import Part1.ex1.classes.Cercle;
import Part1.ex1.classes.Quadrat;

import java.util.Scanner;

public class TestObjecteGeometric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean execucio = true;

        while(execucio){
            System.out.println("Indica quina forma geometrica desitjes crear: \n" +
                    "1. Cercle \n" +
                    "2. Quadrat \n" +
                    "3. Sortir");

            int opció = input.nextInt();
            input.nextLine();
            switch (opció){
                case 1:
                    System.out.println("Indica la coordenada X del quadrat: ");
                    Double coordX = input.nextDouble();
                    input.nextLine();
                    System.out.println("Indica la coordenada Y del quadrat: ");
                    Double coordY = input.nextDouble();
                    input.nextLine();
                    System.out.println("Indica el color del quadrat: ");
                    String color = input.nextLine();
                    System.out.println("Indica el radi del quadrat: ");
                    Double radi = input.nextDouble();
                    input.nextLine();
                    Cercle cercle = new Cercle(coordX,coordY,color, radi);
                    System.out.println("El perímetre del quadrat és: " + cercle.perimetre() + " i l'area es: " + cercle.area());
                    break;

                case 2:
                    System.out.println("Indica la coordenada X del quadrat: ");
                    Double coordX2 = input.nextDouble();
                    input.nextLine();
                    System.out.println("Indica la coordenada Y del quadrat: ");
                    Double coordY2 = input.nextDouble();
                    input.nextLine();
                    System.out.println("Indica el color del quadrat: ");
                    String color2 = input.nextLine();
                    System.out.println("Indica el radi del quadrat: ");
                    Double costat = input.nextDouble();
                    input.nextLine();
                    Quadrat quadrat = new Quadrat(coordX2,coordY2,color2, costat);
                    System.out.println("El perímetre del quadrat és: " + quadrat.perimetre() + " i l'area es: " + quadrat.area());
                    break;

                case 3:
                    System.out.println("Gràcies per utilitzar el nostre programa.");
                    execucio = false;
                    break;
            }
        }
    }
}
