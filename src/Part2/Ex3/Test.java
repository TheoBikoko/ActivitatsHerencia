package Part2.Ex3;

import Part2.Ex3.classes.*;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Espai> espais = new ArrayList<>();

        Despatx despatx = new Despatx(1, 45.32, true, 32.12, 15, true);
        Aula aula = new Aula(2, 23.21, false, 12.76, 60, false, 20, true);
        Laboratori laboratori = new Laboratori(3, 54.89, true, 59.54, 54);
        AulaInformatica aulaInformatica = new AulaInformatica(4, 87.43, false, 90.43, 3);
        Gimnas gimnas = new Gimnas(5, 243.67, true, 71.23, true, 88);

        espais.add(despatx);
        espais.add(aula);
        espais.add(laboratori);
        espais.add(aulaInformatica);
        espais.add(gimnas);

        for (Espai espai: espais){
            if (espai instanceof Despatx){
                System.out.println("Consum per metre quadrat del despatx: " + ((Despatx) espai).ConsumPerMetreQuadrat() + ", espai per estudiant: " + ((Despatx) espai).espaiPerEstudiant());
            } else if (espai instanceof Aula) {

            } else if (espai instanceof AulaInformatica) {
                
            }else if (espai instanceof Laboratori) {

            }else if (espai instanceof Gimnas) {

            }
        }
    }


}
