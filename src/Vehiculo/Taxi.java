package Vehiculo;

import Persona.Taxista;

/**
 *
 * @author elnoe
 */
public class Taxi extends Autos {

    private Taxista Taxista;

    public Taxi(Taxista Taxista, String Propietario, String Placa, String modelo, String marca, String color) {
        super(Propietario, Placa, modelo, marca, color);
        this.Taxista = Taxista;
    }

    public Taxista getTaxista() {
        return Taxista;
    }

    public void setTaxista(Taxista Taxista) {
        this.Taxista = Taxista;
    }

    @Override
    public String toString() {
        return "Propietario: " + getPropietario() + "\n"
                + "Propietario: " + getTaxista() + "\n"
                + "Placa: " + getPlaca() + "\n"
                + "modelo: " + getModelo() + "\n"
                + "marca: " + getMarca() + "\n"
                + "color: " + getColor();
    }
}
