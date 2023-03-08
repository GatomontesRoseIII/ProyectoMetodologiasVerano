package Vehiculo;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class Vehiculo {

    private String Propietario;
    private String Placa;
    private String modelo;
    private String marca;
    private String color;

    public Vehiculo(String Propietario, String Placa, String modelo, String marca, String color) {
        this.Propietario = Propietario;
        this.Placa = Placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
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
                + "modelo: " + modelo + "\n"
                + "marca: " + marca + "\n"
                + "color: " + color;
    }
}
