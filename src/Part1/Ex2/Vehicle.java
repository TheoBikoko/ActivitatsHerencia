package Part1.Ex2;

public sealed class Vehicle permits Cotxe, Camio, FurgonetaDeCarrega, Microbus{
    protected String matricula;

    public Vehicle(String matricula) {
        this.matricula = matricula;
    }

    public Double preuLloguer(int dies){
        return 10.0*dies;
    }
}
