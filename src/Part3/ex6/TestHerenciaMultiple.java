package Part3.ex6;

import Part3.ex6.classes.Pegasus;

public class TestHerenciaMultiple {
    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus(300, "Seiya");

        pegasus.birdNoise();
        pegasus.horseNoise();
    }
}
