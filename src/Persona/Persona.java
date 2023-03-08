package Persona;


/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class Persona {

    private String nombre;
    private String Apellido;
    private String dni;
    private int edad;
    private String sexo;
    private String EstadoCivil;

    public Persona(String nombre, String Apellido, String dni, int edad, String sexo, String EstadoCivil) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    //Modificador Datos
    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Apellido: " + Apellido + "\n"
                + "DNI: " + dni + "\n"
                + "Edad: " + edad + "\n"
                + "Sexo: " + sexo + "\n"
                + "Estado Civil: " + EstadoCivil;

    }
}
