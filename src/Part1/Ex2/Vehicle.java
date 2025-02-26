package Part1.Ex2;

public sealed class Vehicle permits Cotxe, Camio, FurgonetaDeCarrega, Microbus{
    protected Double preu;
    protected String matricula;

    public Double preuLloguer(int dies){
        return preu*dies;
    }
}
