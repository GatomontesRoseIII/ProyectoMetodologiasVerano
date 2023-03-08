package Registrar;

import Persona.Propietario;
import Principal.Principal;
import Persona.Taxista;
import Vehiculo.Autos;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static Registrar.metodosParaRegistrar.llenarArrayAutosTxt;
import static Registrar.metodosParaRegistrar.llenarArrayPropietariosTxt;
import static Registrar.metodosParaRegistrar.llenarArrayTaxistasTxt;
import static Registrar.metodosParaRegistrar.hojaEnBlanco;
import static Registrar.metodosParaRegistrar.limpiarTabla;
import static Registrar.metodosParaRegistrar.llenarHojaNuevosDatos;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class RegistrarAutos extends javax.swing.JPanel {

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

    //constructor
    public RegistrarAutos() {
//        autosInicio();
        llenarArrayAutosTxt(autos, direccionArchivoAuto);
        llenarArrayPropietariosTxt(propietarios, direccionArchivoPropietarios);
        llenarArrayTaxistasTxt(taxistas, direccionArchivoTaxistas);
        modeloTabla();
        initComponents();
    }

    //methods

    private void modeloTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("N°");
        modeloTabla.addColumn("Propietario");
        modeloTabla.addColumn("Placa");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Color");
        LLenarTabla();
    }

    private void LLenarTabla() {
        for (var i = 0; i < autos.size(); i++) {
            String[] auto = new String[6];
            auto[0] = String.valueOf(modeloTabla.getRowCount() + 1);
            auto[1] = autos.get(i).getPropietario();
            auto[2] = autos.get(i).getPlaca();
            auto[3] = autos.get(i).getModelo();
            auto[4] = autos.get(i).getMarca();
            auto[5] = autos.get(i).getColor();
            modeloTabla.addRow(auto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtnModificar1 = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDatosAutos = new javax.swing.JTable();

        jPanel2.setBackground(AzulOscuro);

        jbtnModificar1.setForeground(verde);
        jbtnModificar1.setText("Modificar");
        jbtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificar1ActionPerformed(evt);
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

        jtableDatosAutos.setModel(modeloTabla);
        jScrollPane1.setViewportView(jtableDatosAutos);
        ListSelectionListener oyenteSeleccion=new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    eliminarModificiar=true;
                    filaSeleccionada=jtableDatosAutos.getSelectedRow();
                    System.out.println(filaSeleccionada);
                }
            }
        };
        jtableDatosAutos.getSelectionModel().addListSelectionListener(oyenteSeleccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jbtnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1)))
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnAgregar)
                    .addComponent(jbtnModificar1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificar1ActionPerformed
        if (eliminarModificiar) {
            //llamamos a al jdialog con parametros los datos
            AgregarAuto agregar = new AgregarAuto(new Principal(), true, autos.get(filaSeleccionada));
            agregar.setVisible(true);
            if (agregar.getAgregar()) {
                //remplazamos con el nuevo objeto de retornada del objeto agregar
                autos.set(filaSeleccionada, agregar.getAuto());
                //limpiamos el modelo de la tabla y hoja
                limpiarTabla(modeloTabla);
                hojaEnBlanco(direccionArchivoAuto);
                //volvemos agregar los datos
                LLenarTabla();
                llenarHojaNuevosDatos(direccionArchivoAuto, autos, "Auto");
                //no se puede modificar hasta volver tocar otra fila
                eliminarModificiar = false;
            }
        }
    }//GEN-LAST:event_jbtnModificar1ActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        if (eliminarModificiar) {
            autos.remove(filaSeleccionada);
            //limpiamos
            limpiarTabla(modeloTabla);
            hojaEnBlanco(direccionArchivoAuto);
            //volvemos agregar los datos
            LLenarTabla();
            llenarHojaNuevosDatos(direccionArchivoAuto, autos,"Auto");
            //no se puede elminar hasta volver tocar otra fila
            eliminarModificiar = false;
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        AgregarAuto agregar = new AgregarAuto(new Principal(), true);
        agregar.setVisible(true);
        //si no hubo ningun incoveniente entonce se retorna un true y si no pues es false y no se agrega
        if (agregar.getAgregar()) {
            autos.add(agregar.getAuto());
            //guardamos el nuevo dato de taxistas en un array para agregar a la tabla
            String[] auto = new String[6];
            auto[0] = String.valueOf(modeloTabla.getRowCount() + 1);
            auto[1] = autos.get(autos.size() - 1).getPropietario();
            auto[2] = autos.get(autos.size() - 1).getPlaca();
            auto[3] = autos.get(autos.size() - 1).getModelo();
            auto[4] = autos.get(autos.size() - 1).getMarca();
            auto[5] = autos.get(autos.size() - 1).getColor();
            modeloTabla.addRow(auto);
            //llamamos a la hoja y le agregamos el nuevo objeto de taxistas
            try {
                FileWriter Hoja = new FileWriter(direccionArchivoAuto, true);
                if (modeloTabla.getRowCount() > 1) {
                    Hoja.write(System.lineSeparator());
                }
                Hoja.write("///////////////////Autos " + modeloTabla.getRowCount() + "///////////////////" + System.lineSeparator());
                Hoja.write(autos.get(autos.size() - 1) + "");
                Hoja.close();
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnModificar1;
    private javax.swing.JTable jtableDatosAutos;
    // End of variables declaration//GEN-END:variables

}
