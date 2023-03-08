package Registrar;

import javax.swing.JOptionPane;
import Persona.Taxista;
import static Registrar.metodosParaRegistrar.stringDeLinea;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class AgregarTaxista extends javax.swing.JDialog {

    //atributes
    private Taxista taxista;
    private boolean agregar = false;

    //methods
    public AgregarTaxista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AgregarTaxista(java.awt.Frame parent, boolean modal, String DNI, String Nombres, String Apellidos, String Edad, String Sexo, String EstadoCivil, String placaTaxi) {
        super(parent, modal);
        initComponents();
        jtxtDni.setText(DNI);
        jtxtNombres.setText(Nombres);
        jtxtApellidos.setText(Apellidos);
        jtxtEdad.setText(Edad);
        jcbxSexo.setSelectedItem(Sexo);
        jcbxSexo.setSelectedItem(EstadoCivil);
        jtxtTaxiPlaca.setText(placaTaxi);
        jbtnAgregar.setText("Registrar Modificación");
    }

    private boolean propietarioExistente(String Placa) {
        String direccion = "C:\\Users\\elnoe\\Escritorio\\archivos\\Verano segundo a tercer ciclo\\Metodologias\\Proyecyo\\ProyectoTaxis\\src\\Archivos\\Autos.txt";
        ArrayList<String> Auto = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(direccion));) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lector.readLine();
                lector.readLine();
                Auto.add(stringDeLinea(7, lector.readLine()));
                lector.readLine();
                lector.readLine();
                lector.readLine();
            }
        } catch (IOException e) {
        }
        boolean existente = false;
        for (var i = 0; i < Auto.size(); i++) {
            if (Auto.get(i).equals(Placa)) {
                existente = true;
                break;
            }
        }
        return existente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtEdad = new javax.swing.JTextField();
        jcbxEstadoCivil = new javax.swing.JComboBox<>();
        jcbxSexo = new javax.swing.JComboBox<>();
        jbtnAgregar = new javax.swing.JButton();
        jtxtTaxiPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtApellidos.setText("1");
        jPanel1.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 190, 40));

        jLabel1.setText("Placa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 184, 26));

        jLabel2.setText("Estado Civil:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 184, 30));

        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 184, 26));

        jtxtNombres.setText("1");
        jPanel1.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 184, 40));

        jLabel4.setText("DNI:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, 184, 26));

        jtxtDni.setText("1");
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 184, 40));

        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 184, 30));

        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 184, 30));

        jtxtEdad.setText("1");
        jPanel1.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 184, 40));

        jcbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado" }));
        jPanel1.add(jcbxEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 40));

        jcbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(jcbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 40));

        jbtnAgregar.setText("Registrar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 620, 40));

        jtxtTaxiPlaca.setText("1");
        jPanel1.add(jtxtTaxiPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 184, 40));

        jLabel7.setText("Apellidos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 184, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //guardar datos
    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        try {
            taxista = new Taxista(jtxtNombres.getText(), jtxtApellidos.getText(), jtxtDni.getText(), Integer.parseInt(jtxtEdad.getText()), String.valueOf(jcbxSexo.getSelectedItem()), String.valueOf(jcbxEstadoCivil.getSelectedItem()), jtxtTaxiPlaca.getText());
            agregar = !"".equals(taxista.getApellido()) ? !"".equals(taxista.getNombre()) ? !"".equals(taxista.getDni()) ? !"".equals(taxista.getTaxiPlaca()) : false : false : false;
            agregar = propietarioExistente(taxista.getTaxiPlaca());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar los datos Correctamente.");
            agregar = false;
        }
        if (agregar) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos correctamente");
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JComboBox<String> jcbxEstadoCivil;
    private javax.swing.JComboBox<String> jcbxSexo;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtDni;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtTaxiPlaca;
    // End of variables declaration//GEN-END:variables
//retorno Datos
    public Taxista getTaxista() {
        return taxista;
    }

    public boolean getAgregar() {
        return agregar;
    }

}
