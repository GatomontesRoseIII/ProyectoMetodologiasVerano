package Fecha;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class Fecha {
    private String numeroDia;
    private String nombreDia;
    private String numeroMes;
    private String nombreMes;
    private String numeroAño;
    
    public Fecha() {
        this.numeroDia=new SimpleDateFormat("dd").format(new Date());
        this.numeroMes=new SimpleDateFormat("MM").format(new Date());
        this.numeroAño=new SimpleDateFormat("YYYY").format(new Date());
        this.nombreDia=LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE", new Locale("es", "ES")));
        this.nombreMes=LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM", new Locale("es", "ES")));
    }

    public String getNumeroDia() {
        return numeroDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public String getNumeroMes() {
        return numeroMes;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public String getNumeroAño() {
        return numeroAño;
    }
    
    
}
