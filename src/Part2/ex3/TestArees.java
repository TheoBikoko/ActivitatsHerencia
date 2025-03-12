package Part2.ex3;

import Part2.ex3.classes.*;

import java.util.ArrayList;

public class TestArees {
    public static void main(String[] args) {
        ArrayList<Espai> espais = new ArrayList<>();

        Despatx despatx = new Despatx(1, 45.32, true, 32.12, 15, true);
        Aula aula = new Aula(2, 23.21, false, 12.76, 60, false, 20, true);
        Laboratori laboratori = new Laboratori(3, 54.89, true, 59.54, 54);
        AulaInformatica aulaInformatica = new AulaInformatica(4, 87.43, false, 90.43, 3);
        Gimnas gimnas = new Gimnas(5, 243.67, true, 71.23, true, 15);

        espais.add(despatx);
        espais.add(aula);
        espais.add(laboratori);
        espais.add(aulaInformatica);
        espais.add(gimnas);

        for (Espai espai: espais){
            if (espai instanceof Despatx){
                System.out.println("Consum per metre quadrat del despatx: " + ((Despatx) espai).ConsumPerMetreQuadrat() + " kWh/m2, espai per estudiant (10 estudiants): " + ((Despatx) espai).espaiPerEstudiant(10) + (" m2."));
            } else if (espai instanceof Aula) {
                System.out.println("Consum per metre quadrat del aula: " + ((Aula) espai).ConsumPerMetreQuadrat() + " kWh/m2, espai per estudiant (10 estudiants): " + ((Aula) espai).espaiPerEstudiant(10) + (" m2."));
            } else if (espai instanceof AulaInformatica) {
                System.out.println("Consum per metre quadrat del aula d´informatica: " + ((AulaInformatica) espai).ConsumPerMetreQuadrat() + " kWh/m2, espai per estudiant (10 estudiants): " + ((AulaInformatica) espai).espaiPerEstudiant(10) + (" m2."));
            }else if (espai instanceof Laboratori) {
                System.out.println("Consum per metre quadrat del laboratori: " + ((Laboratori) espai).ConsumPerMetreQuadrat() + " kWh/m2, espai per estudiant (10 estudiants): " + ((Laboratori) espai).espaiPerEstudiant(10) + (" m2."));
            }else if (espai instanceof Gimnas) {
                System.out.println("Consum per metre quadrat del gimnas: " + ((Gimnas) espai).ConsumPerMetreQuadrat() + " kWh/m2, espai per estudiant (10 estudiants): " + ((Gimnas) espai).espaiPerEstudiant(10) + (" m2."));
            }
        }
    }
}
