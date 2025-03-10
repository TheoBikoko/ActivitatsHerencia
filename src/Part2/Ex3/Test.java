package Part2.Ex3;

import Part2.Ex3.classes.*;

public class Test {
    public static void main(String[] args) {
        Despatx despatx = new Despatx(1, 45.32, true, 32.12, 15, true);
        Aula aula = new Aula(2, 23.21, false, 12.76, 60, false, 20, true);
        Laboratori laboratori = new Laboratori(3, 54.89, true, 59.54, 54);
        AulaInformatica aulaInformatica = new AulaInformatica(4, 87.43, false, 90.43, 3);
        Gimnas gimnas = new Gimnas(5, 243.67, true, 71.23, true, 88);
    }


}
