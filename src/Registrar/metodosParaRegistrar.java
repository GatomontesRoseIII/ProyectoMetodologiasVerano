package Registrar;

import Persona.Propietario;
import Persona.Taxista;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class metodosParaRegistrar {

    public static String stringDeLinea(int pos, String linea) {
        String retornar = "";
        for (var i = pos; i < linea.length(); i++) {
            retornar += linea.charAt(i);
        }
        return retornar;
    }

    public static void hojaEnBlanco(String direccionArchivo) {
        try {
            FileWriter Hoja = new FileWriter(direccionArchivo, false);
            Hoja.write("");
            Hoja.close();
        } catch (IOException e) {
        }
    }

    public static void limpiarTabla(javax.swing.table.DefaultTableModel modeloTabla) {
        int CantidadFilas = modeloTabla.getRowCount();
        for (int i = 0; i < CantidadFilas; i++) {
            modeloTabla.removeRow(0);
        }
    }

    public static void llenarHojaNuevosDatos(String direccion, ArrayList a, String nombre) {
        for (int i = 0; i < a.size(); i++) {
            try {
                FileWriter Hoja;
                if (i == 0) {
                    Hoja = new FileWriter(direccion, false);
                } else {
                    Hoja = new FileWriter(direccion, true);
                    Hoja.write(System.lineSeparator());
                }
                Hoja.write("///////////////////" + nombre + " " + (i + 1) + "///////////////////" + System.lineSeparator());
                Hoja.write(a.get(i) + "");
                Hoja.close();
            } catch (IOException e) {
            }
        }

    }

    public static void llenarArrayAutosTxt(ArrayList arrayAutos, String direccion) {
        try (BufferedReader lector = new BufferedReader(new FileReader(direccion))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (!"".equals(linea) && linea.charAt(0) != '/') {
                    String DNIPropietario = stringDeLinea(13, linea);
                    String Placa = stringDeLinea(7, lector.readLine());
                    String Marca = stringDeLinea(7, lector.readLine());
                    String Modelo = stringDeLinea(8, lector.readLine());
                    String Color = stringDeLinea(7, lector.readLine());
                    lector.readLine();
                    arrayAutos.add(new Vehiculo.Autos(DNIPropietario, Placa, Marca, Modelo, Color));
                }

            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo Autos.txt");
        }
    }

    public static void llenarArrayPropietariosTxt(ArrayList arrayPropietarios, String direccion) {
        try (BufferedReader lector = new BufferedReader(new FileReader(direccion))) {
            String linea;
            int i = 0;
            while ((linea = lector.readLine()) != null) {
                if (!"".equals(linea) && linea.charAt(0) != '/') {
                    i++;
                    String nombre = stringDeLinea(8, linea);
                    String Apellido = stringDeLinea(10, lector.readLine());
                    String dni = stringDeLinea(5, lector.readLine());
                    int edad = Integer.parseInt(stringDeLinea(6, lector.readLine()));
                    String sexo = stringDeLinea(6, lector.readLine());
                    String EstadoCivil = stringDeLinea(14, lector.readLine());
                    lector.readLine();
                    arrayPropietarios.add(new Propietario(nombre, Apellido, dni, edad, sexo, EstadoCivil));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo propietarios.txt");
        }
    }

    public static void llenarArrayTaxistasTxt(ArrayList arrayPropietarios, String direccion) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(direccion));
            String linea;
            int i = 0;
            while ((linea = lector.readLine()) != null) {
                if (!"".equals(linea) && linea.charAt(0) != '/') {
                    i++;
                    String nombre = stringDeLinea(8, linea);
                    String Apellido = stringDeLinea(10, lector.readLine());
                    String dni = stringDeLinea(5, lector.readLine());
                    int edad = Integer.parseInt(stringDeLinea(6, lector.readLine()));
                    String sexo = stringDeLinea(6, lector.readLine());
                    String EstadoCivil = stringDeLinea(14, lector.readLine());
                    String taxiPlaca = stringDeLinea(13, lector.readLine());
                    lector.readLine();
                    arrayPropietarios.add(new Taxista(nombre, Apellido, dni, edad, sexo, EstadoCivil, taxiPlaca));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
