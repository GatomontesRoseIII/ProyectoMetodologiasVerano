package Persona;

import Vehiculo.Autos;
import java.util.ArrayList;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class Propietario extends Persona {

    private ArrayList<Autos> Autos = new ArrayList<>();
    private int numeroAutos = 0;

    public Propietario(String nombre, String Apellido, String dni, int edad, String sexo, String EstadoCivil) {
        super(nombre, Apellido, dni, edad, sexo, EstadoCivil);
    }

    public int getNumeroAutos() {
        return numeroAutos;
    }

    public void setNumeroAutos(int numeroAutos) {
        this.numeroAutos = numeroAutos;
    }

    public ArrayList<Autos> getAutos() {
        return Autos;
    }

    public void setAutos(Autos Autos) {
        numeroAutos++;
        this.Autos.add(Autos);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "N° Autos: " + Autos.size();
    }
}
