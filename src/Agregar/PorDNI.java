package Agregar;

import Registrar.AgregarAuto;
import Principal.Principal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Persona.Taxista;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author elnoe
 */
public class PorDNI extends javax.swing.JPanel {
    //atributos
    String direccionArchivoTaxista="C:\\Users\\elnoe\\Escritorio\\archivos\\Verano segundo a tercer ciclo\\Metodologias\\Proyecyo\\ProyectoTaxis\\src\\Archivos\\Taxistas.txt";
    private final ArrayList<Taxista>Taxistas = new ArrayList<>();
    Color AzulOscuro=new Color(5, 5, 22);
    public PorDNI() {
        TaxistasInicio();
        initComponents();
    }
    private void TaxistasInicio(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader(direccionArchivoTaxista));
            String linea;
            int i=0;
            while ((linea = lector.readLine()) != null) {
                if (!"".equals(linea) && linea.charAt(0)!='/') {
                    i++;
                    String nombre=stringDeLinea(8,linea);
                    String Apellido=stringDeLinea(10,lector.readLine());
                    String dni=stringDeLinea(5,lector.readLine());
                    int edad=Integer.parseInt(stringDeLinea(6,lector.readLine()));
                    String sexo=stringDeLinea(6,lector.readLine());
                    String EstadoCivil=stringDeLinea(14,lector.readLine());
                    lector.readLine();
                    Taxistas.add(new Taxista(nombre, Apellido, dni, edad,sexo, EstadoCivil));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    private String stringDeLinea(int pos,String linea){
        String retornar="";
        for (var i = pos; i < linea.length(); i++) {
            retornar+=linea.charAt(i);
        }
        return retornar;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlNumero = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtnAgregarTaxi = new javax.swing.JButton();
        jlblNombreApellido = new javax.swing.JLabel();
        jlblEdad = new javax.swing.JLabel();
        jlblSexo = new javax.swing.JLabel();
        jlblEstadoCivil = new javax.swing.JLabel();

        jpnlNumero.setBackground(AzulOscuro);

        jLabel2.setText("DNI");

        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo:");

        jLabel1.setText("Nombres y Apellidos:");

        jLabel3.setText("Edad:");

        jLabel5.setText("EstadoCivil:");

        jbtnAgregarTaxi.setText("Agregar Taxi");
        jbtnAgregarTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarTaxiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlNumeroLayout = new javax.swing.GroupLayout(jpnlNumero);
        jpnlNumero.setLayout(jpnlNumeroLayout);
        jpnlNumeroLayout.setHorizontalGroup(
            jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlNumeroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlNumeroLayout.createSequentialGroup()
                .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlNumeroLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jbtnAgregarTaxi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlNumeroLayout.createSequentialGroup()
                        .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlNumeroLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnlNumeroLayout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                        .addGap(4, 4, 4)
                        .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jlblNombreApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(103, 103, 103))
        );
        jpnlNumeroLayout.setVerticalGroup(
            jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlNumeroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnAgregarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        String DNI=jtxtDNI.getText();
        if (!DNI.equals("")) {
            int pos=0;
            for (var i = 0; i < Taxistas.size(); i++) {
                if (DNI.equals(Taxistas.get(i).getDni())) {
                    pos=i;
                    break;
                }
            }
            jlblNombreApellido.setText(Taxistas.get(pos).getApellido()+" "+Taxistas.get(pos).getNombre());
            jlblEdad.setText(String.valueOf(Taxistas.get(pos).getEdad()));
            jlblSexo.setText(Taxistas.get(pos).getSexo());
            jlblEstadoCivil.setText(Taxistas.get(pos).getEstadoCivil());
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese un DNI");
        }
        
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnAgregarTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarTaxiActionPerformed
        AgregarAuto agregar= new AgregarAuto(new Principal(), true);
        agregar.setVisible(true);
    }//GEN-LAST:event_jbtnAgregarTaxiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnAgregarTaxi;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JLabel jlblEdad;
    private javax.swing.JLabel jlblEstadoCivil;
    private javax.swing.JLabel jlblNombreApellido;
    private javax.swing.JLabel jlblSexo;
    private javax.swing.JPanel jpnlNumero;
    private javax.swing.JTextField jtxtDNI;
    // End of variables declaration//GEN-END:variables

}
