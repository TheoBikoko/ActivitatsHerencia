package Part1.ex2.classes;

import java.util.ArrayList;

public class Empleat {
    ArrayList<Vehicle> vehicles;

    public Empleat() {
        vehicles = new ArrayList<>();
    }

    public void afegirVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void obtenirPreuVehicle(String matricula, int dies) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMatricula().equals(matricula)) {
                System.out.println( "Preu del vehicle amb la matricula " + vehicle.getMatricula() + ": " + vehicle.preuLloguer(dies));
            }
        }
    }

    public void obtenirPreuDeTotsElsVehicles(int dies) {
        for (Vehicle vehicle : vehicles) {
            System.out.println( "Preu del vehicle amb la matricula " + vehicle.getMatricula() + ": " + vehicle.preuLloguer(dies));
        }
    }
}
