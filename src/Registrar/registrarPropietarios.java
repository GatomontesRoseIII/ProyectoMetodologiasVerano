package Registrar;

import Persona.Propietario;
import Persona.Taxista;
import Principal.Principal;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static Registrar.metodosParaRegistrar.llenarArrayPropietariosTxt;
import static Registrar.metodosParaRegistrar.hojaEnBlanco;
import static Registrar.metodosParaRegistrar.limpiarTabla;
import static Registrar.metodosParaRegistrar.llenarArrayAutosTxt;
import static Registrar.metodosParaRegistrar.llenarArrayPropietariosTxt;
import static Registrar.metodosParaRegistrar.llenarArrayTaxistasTxt;
import static Registrar.metodosParaRegistrar.llenarHojaNuevosDatos;
import Vehiculo.Autos;
/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class registrarPropietarios extends javax.swing.JPanel {

    //atribute
    private final String direccionCarpeta = "C:\\Users\\elnoe\\Escritorio\\archivos\\Verano segundo a tercer ciclo\\Metodologias\\Proyecyo\\ProyectoTaxis\\src\\Archivos\\";
    
    private final String direccionArchivoAuto = direccionCarpeta + "Autos.txt";
    private final String direccionArchivoPropietarios = direccionCarpeta + "Propietarios.txt";
    private final String direccionArchivoTaxistas = direccionCarpeta + "Taxistas.txt";
    
    private final ArrayList<Autos> autos = new ArrayList<>();
    private final ArrayList<Propietario> propietarios = new ArrayList<>();
    private final ArrayList<Taxista> taxistas = new ArrayList<>();
    
    private DefaultTableModel modeloTabla;
    private int filaSeleccionada;
    private boolean eliminarModificiar = false;
    private final Color verde = new Color(159, 194, 73);
    private final Color AzulOscuro = new Color(5, 5, 22);

    //metodos
    public registrarPropietarios() {
        llenarArrayAutosTxt(autos, direccionArchivoAuto);
        llenarArrayPropietariosTxt(propietarios, direccionArchivoPropietarios);
        llenarArrayTaxistasTxt(taxistas, direccionArchivoTaxistas);
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
        modeloTabla.addColumn("N° Autos");
        llenarTabla();
    }

    private void llenarTabla() {
        for (var i = 0; i < propietarios.size(); i++) {
            String[] taxista = new String[7];
            taxista[0] = String.valueOf(i + 1);
            taxista[1] = propietarios.get(i).getDni();
            taxista[2] = propietarios.get(i).getApellido() + " " + propietarios.get(i).getNombre();
            taxista[3] = String.valueOf(propietarios.get(i).getEdad());
            taxista[4] = propietarios.get(i).getSexo();
            taxista[5] = propietarios.get(i).getEstadoCivil();
            taxista[6] = String.valueOf(propietarios.get(i).getNumeroAutos());
            modeloTabla.addRow(taxista);
        }
    }
    
    private void eliminar() {
        String DNI=propietarios.get(filaSeleccionada).getDni();
        propietarios.remove(filaSeleccionada);
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
            AgregarPropietario agregar = new AgregarPropietario(new Principal(), true, propietarios.get(filaSeleccionada).getDni(), propietarios.get(filaSeleccionada).getNombre(), propietarios.get(filaSeleccionada).getApellido(), String.valueOf(propietarios.get(filaSeleccionada).getEdad()), propietarios.get(filaSeleccionada).getSexo(), propietarios.get(filaSeleccionada).getEstadoCivil());
            agregar.setVisible(true);
            if (agregar.getAgregar()) {
                //remplazamos con el nuevo objeto de retornada del objeto agregar
                propietarios.set(filaSeleccionada, agregar.getPropietario());
                //limpiamos el modelo de la tabla y hoja
                limpiarTabla(modeloTabla);
                hojaEnBlanco(direccionArchivoPropietarios);
                //volvemos agregar los datos
                llenarTabla();
                llenarHojaNuevosDatos(direccionArchivoPropietarios, propietarios,"Propietario");
                //no se puede modificar hasta volver tocar otra fila
                eliminarModificiar = false;
            }
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        if (eliminarModificiar) {
            //eliminamos propietarios y todo lo que este registrado con el como los autos y taxistas que esten con su auto
            eliminar();
            //limpiamos 
            limpiarTabla(modeloTabla);
            hojaEnBlanco(direccionArchivoPropietarios);
            //volvemos agregar los datos
            llenarTabla();
            llenarHojaNuevosDatos(direccionArchivoPropietarios, propietarios,"Propietario");
            //no se puede elminar hasta volver tocar otra fila
            eliminarModificiar = false;
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        AgregarPropietario agregar = new AgregarPropietario(new Principal(), true);
        agregar.setVisible(true);
        //si no hubo ningun incoveniente entonce se retorna un true y si no pues es false y no se agrega
        if (agregar.getAgregar()) {
            propietarios.add(agregar.getPropietario());
            //guardamos el nuevo dato de taxistas en un array para agregar a la tabla
            String[] taxista = new String[8];
            taxista[0] = String.valueOf(modeloTabla.getRowCount() + 1);
            taxista[1] = propietarios.get(propietarios.size() - 1).getDni();
            taxista[2] = propietarios.get(propietarios.size() - 1).getApellido() + " " + propietarios.get(propietarios.size() - 1).getNombre();
            taxista[3] = String.valueOf(propietarios.get(propietarios.size() - 1).getEdad());
            taxista[4] = propietarios.get(propietarios.size() - 1).getSexo();
            taxista[5] = propietarios.get(propietarios.size() - 1).getEstadoCivil();
            taxista[6] = String.valueOf(propietarios.get(propietarios.size() - 1).getNumeroAutos());
            modeloTabla.addRow(taxista);
            //llamamos a la hoja y le agregamos el nuevo objeto de taxistas
            try {
                FileWriter Hoja = new FileWriter(direccionArchivoPropietarios, true);
                if (modeloTabla.getRowCount() > 1) {
                    Hoja.write(System.lineSeparator());
                }
                Hoja.write("///////////////////Propietario " + modeloTabla.getRowCount() + "///////////////////" + System.lineSeparator());
                Hoja.write(propietarios.get(propietarios.size() - 1) + "");
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
