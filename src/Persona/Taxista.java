package Persona;

import PanelPrincipales.Taxis;
import java.util.ArrayList;

/**
 *
 * @author elnoe
 */
public class Taxista extends Persona {

    private String taxiPlaca;

    public Taxista(String nombre, String Apellido, String dni, int edad, String sexo, String EstadoCivil, String taxiPlaca) {
        super(nombre, Apellido, dni, edad, sexo, EstadoCivil);
        this.taxiPlaca=taxiPlaca;
    }

    public String getTaxiPlaca() {
        return taxiPlaca;
    }

    public void setTaxiPlaca(String taxiPlaca) {
        this.taxiPlaca = taxiPlaca;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Taxi placa : " + taxiPlaca;
    }

}
