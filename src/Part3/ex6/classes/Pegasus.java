package Part3.ex6.classes;

import Part3.ex6.interficies.MakesBirdNoise;
import Part3.ex6.interficies.MakesHorseNoise;

public class Pegasus extends Animal implements MakesBirdNoise, MakesHorseNoise {
    public Pegasus(int age, String name) {
        super(age, name);
    }

    public void birdNoise(){
        System.out.println("Chirp chirp!");
    }

    public void horseNoise(){
        System.out.println("Hiiiiii!");
    }
}
