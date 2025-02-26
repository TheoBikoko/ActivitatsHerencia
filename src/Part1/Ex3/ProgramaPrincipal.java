package Part1.Ex3;

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
    }
}

