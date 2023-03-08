package Registrar;

import Principal.Principal;
import Persona.Taxista;
import static Registrar.metodosParaRegistrar.stringDeLinea;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static Registrar.metodosParaRegistrar.llenarArrayTaxistasTxt;
import static Registrar.metodosParaRegistrar.hojaEnBlanco;
import static Registrar.metodosParaRegistrar.limpiarTabla;
import static Registrar.metodosParaRegistrar.llenarHojaNuevosDatos;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class RegistrarTaxistas extends javax.swing.JPanel {

    //atribute
    private String direccionArchivoTaxista = "C:\\Users\\elnoe\\Escritorio\\archivos\\Verano segundo a tercer ciclo\\Metodologias\\Proyecyo\\ProyectoTaxis\\src\\Archivos\\Taxistas.txt";
    private final ArrayList<Taxista> Taxistas = new ArrayList<>();
    private DefaultTableModel modeloTabla;
    private int filaSeleccionada;
    private boolean eliminarModificiar = false;
    private final Color verde = new Color(159, 194, 73);
    private final Color AzulOscuro = new Color(5, 5, 22);

    //metodos
    public RegistrarTaxistas() {
        llenarArrayTaxistasTxt(Taxistas, direccionArchivoTaxista);
        modeloTabla();
        initComponents();
    }

    private void modeloTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("N°");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Nombres y Apellidos");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Sexo");
        modeloTabla.addColumn("Estado Civil");
        modeloTabla.addColumn("Placa de taxi");
        LLenarTabla();
    }

    private void LLenarTabla() {
        for (var i = 0; i < Taxistas.size(); i++) {
            String[] taxista = new String[7];
            taxista[0] = String.valueOf(i + 1);
            taxista[1] = Taxistas.get(i).getDni();
            taxista[2] = Taxistas.get(i).getApellido() + " " + Taxistas.get(i).getNombre();
            taxista[3] = String.valueOf(Taxistas.get(i).getEdad());
            taxista[4] = Taxistas.get(i).getSexo();
            taxista[5] = Taxistas.get(i).getEstadoCivil();
            taxista[6] = String.valueOf(Taxistas.get(i).getTaxiPlaca());
            modeloTabla.addRow(taxista);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDatosTaxistas = new javax.swing.JTable();

        jPanel1.setBackground(AzulOscuro);

        jbtnModificar.setForeground(verde);
        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setForeground(verde);
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnAgregar.setForeground(verde);
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jtableDatosTaxistas.setModel(modeloTabla);
        jScrollPane1.setViewportView(jtableDatosTaxistas);
        ListSelectionListener oyenteSeleccion=new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    eliminarModificiar=true;
                    filaSeleccionada=jtableDatosTaxistas.getSelectedRow();
                    System.out.println(filaSeleccionada);
                }
            }
        };
        jtableDatosTaxistas.getSelectionModel().addListSelectionListener(oyenteSeleccion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1)))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnAgregar)
                    .addComponent(jbtnModificar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        if (eliminarModificiar) {
            //llamamos a al jdialog con parametros los datos
            AgregarTaxista agregar = new AgregarTaxista(new Principal(), true, Taxistas.get(filaSeleccionada).getDni(), Taxistas.get(filaSeleccionada).getNombre(), Taxistas.get(filaSeleccionada).getApellido(), String.valueOf(Taxistas.get(filaSeleccionada).getEdad()), Taxistas.get(filaSeleccionada).getSexo(), Taxistas.get(filaSeleccionada).getEstadoCivil(), Taxistas.get(filaSeleccionada).getTaxiPlaca());
            agregar.setVisible(true);
            if (agregar.getAgregar()) {
                //remplazamos con el nuevo objeto de retornada del objeto agregar
                Taxistas.set(filaSeleccionada, agregar.getTaxista());
                //limpiamos el modelo de la tabla y hoja
                limpiarTabla(modeloTabla);
                hojaEnBlanco(direccionArchivoTaxista);
                //volvemos agregar los datos
                LLenarTabla();
                llenarHojaNuevosDatos(direccionArchivoTaxista, Taxistas, "Taxista");
                //no se puede modificar hasta volver tocar otra fila
                eliminarModificiar = false;
            }
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        if (eliminarModificiar) {
            Taxistas.remove(filaSeleccionada);
            //limpiamos 
            limpiarTabla(modeloTabla);
            hojaEnBlanco(direccionArchivoTaxista);
            //volvemos agregar los datos
            LLenarTabla();
            llenarHojaNuevosDatos(direccionArchivoTaxista, Taxistas, "Taxista");
            //no se puede elminar hasta volver tocar otra fila
            eliminarModificiar = false;
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        AgregarTaxista agregar = new AgregarTaxista(new Principal(), true);
        agregar.setVisible(true);
        //si no hubo ningun incoveniente entonce se retorna un true y si no pues es false y no se agrega

        if (agregar.getAgregar()) {
            Taxistas.add(agregar.getTaxista());
            //guardamos el nuevo dato de taxistas en un array para agregar a la tabla
            String[] taxista = new String[8];
            taxista[0] = String.valueOf(modeloTabla.getRowCount() + 1);
            taxista[1] = Taxistas.get(Taxistas.size() - 1).getDni();
            taxista[2] = Taxistas.get(Taxistas.size() - 1).getApellido() + " " + Taxistas.get(Taxistas.size() - 1).getNombre();
            taxista[3] = String.valueOf(Taxistas.get(Taxistas.size() - 1).getEdad());
            taxista[4] = Taxistas.get(Taxistas.size() - 1).getSexo();
            taxista[5] = Taxistas.get(Taxistas.size() - 1).getEstadoCivil();
            taxista[6] = Taxistas.get(Taxistas.size() - 1).getTaxiPlaca();
            modeloTabla.addRow(taxista);
            //llamamos a la hoja y le agregamos el nuevo objeto de taxistas
            try {
                FileWriter Hoja = new FileWriter(direccionArchivoTaxista, true);
                if (modeloTabla.getRowCount() > 1) {
                    Hoja.write(System.lineSeparator());
                }
                Hoja.write("///////////////////Taxista " + modeloTabla.getRowCount() + "///////////////////" + System.lineSeparator());
                Hoja.write(Taxistas.get(Taxistas.size() - 1) + "");
                Hoja.close();
            } catch (IOException e) {
            }
        } else {
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JTable jtableDatosTaxistas;
    // End of variables declaration//GEN-END:variables

}
