package Vehiculo;

import Faltas.Infraccion;
import java.util.ArrayList;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class Autos {

    private String Propietario;
    private String Placa;
    private String modelo;
    private String marca;
    private String color;
    private ArrayList<Infraccion> Infracciones = new ArrayList<>();
    private int numeroInfracciones;

    public Autos(String Propietario, String Placa, String marca, String modelo, String color) {
        this.Propietario = Propietario;
        this.Placa = Placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        numeroInfracciones = 0;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Propietario: " + Propietario + "\n"
                + "Placa: " + Placa + "\n"
                + "marca: " + marca + "\n"
                + "modelo: " + modelo + "\n"
                + "color: " + color;
    }
}
