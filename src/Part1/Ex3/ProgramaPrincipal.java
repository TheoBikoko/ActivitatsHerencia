package Part1.Ex3;

import Part1.Ex1.Cercle;
import Part1.Ex1.Quadrat;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        System.out.println("\nInstanciant objecte de classe Person...");
        Person person = new Person("Theo", "Dr. Trueta 206");
        System.out.println("\nInstanciant objecte de classe Teacher...");
        Teacher teacher = new Teacher("Alberto", "Dr. Trueta 206");
        System.out.println("\nInstanciant objecte de classe Student...");
        Student student = new Student("Theo", "Dr. Trueta 206", "DAM1", 1);
        System.out.println("\nInstanciant objecte de classe InternationalStudent...");
        InternationalStudent intstudent = new InternationalStudent("Theo", "Dr. Trueta 206", "DAM1", 1, "Japan");
//        Scanner input = new Scanner(System.in);
//        boolean execucio = true;
//
//        while(execucio){
//            System.out.println("Indica quina forma geometrica desitjes crear: \n" +
//                    "1. Cercle \n" +
//                    "2. Quadrat \n" +
//                    "3. Sortir");
//
//            int opció = input.nextInt();
//            input.nextLine();
//            switch (opció){
//                case 1:
//                    System.out.println("Indica la coordenada X del quadrat: ");
//                    Double coordX = input.nextDouble();
//                    input.nextLine();
//                    System.out.println("Indica la coordenada Y del quadrat: ");
//                    Double coordY = input.nextDouble();
//                    input.nextLine();
//                    System.out.println("Indica el color del quadrat: ");
//                    String color = input.nextLine();
//                    System.out.println("Indica el radi del quadrat: ");
//                    Double radi = input.nextDouble();
//                    input.nextLine();
//                    Cercle cercle = new Cercle(coordX,coordY,color, radi);
//                    System.out.println("El perímetre del quadrat és: " + cercle.perimetre() + " i l'area es: " + cercle.area());
//                    break;
//
//                case 2:
//                    System.out.println("Indica la coordenada X del quadrat: ");
//                    Double coordX2 = input.nextDouble();
//                    input.nextLine();
//                    System.out.println("Indica la coordenada Y del quadrat: ");
//                    Double coordY2 = input.nextDouble();
//                    input.nextLine();
//                    System.out.println("Indica el color del quadrat: ");
//                    String color2 = input.nextLine();
//                    System.out.println("Indica el radi del quadrat: ");
//                    Double costat = input.nextDouble();
//                    input.nextLine();
//                    Quadrat quadrat = new Quadrat(coordX2,coordY2,color2, costat);
//                    System.out.println("El perímetre del quadrat és: " + quadrat.perimetre() + " i l'area es: " + quadrat.area());
//                    break;
//
//                case 3:
//                    System.out.println("Gràcies per utilitzar el nostre programa.");
//                    execucio = false;
//                    break;
//            }
//        }
    }
}

