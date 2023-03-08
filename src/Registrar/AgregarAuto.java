package Registrar;

import Persona.Propietario;
import static Registrar.metodosParaRegistrar.stringDeLinea;
import Vehiculo.Autos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author elnoe
 */
public class AgregarAuto extends javax.swing.JDialog {

    private Autos Autos;
    private boolean agregar = false;

    public AgregarAuto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AgregarAuto(java.awt.Frame parent, boolean modal, Autos auto) {
        super(parent, modal);
        initComponents();
        jtxtColor.setText(auto.getColor());
        jtxtDNIPropietario.setText(auto.getPropietario());
        jtxtMarca.setText(auto.getMarca());
        jtxtModelo.setText(auto.getModelo());
        jtxtPlaca.setText(auto.getPlaca());
        jbtnAgregar.setText("Registrar Modificación");
    }

    private boolean propietarioExistente(String propietarioIngresado) {
        String direccion = "C:\\Users\\elnoe\\Escritorio\\archivos\\Verano segundo a tercer ciclo\\Metodologias\\Proyecyo\\ProyectoTaxis\\src\\Archivos\\Propietarios.txt";
        ArrayList<String> DNIpropietarios = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(direccion));) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lector.readLine();
                lector.readLine();
                DNIpropietarios.add(stringDeLinea(5, lector.readLine()));
                lector.readLine();
                lector.readLine();
                lector.readLine();
                lector.readLine();
            }
        } catch (IOException e) {
        }
        boolean existente = false;
        for (var i = 0; i < DNIpropietarios.size(); i++) {
            if (DNIpropietarios.get(i).equals(propietarioIngresado)) {
                existente = true;
                break;
            }
        }
        return existente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtPlaca = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jtxtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtDNIPropietario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Marca:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 184, 26));

        jLabel4.setText("Color:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, 184, 26));

        jtxtColor.setText("1");
        jPanel2.add(jtxtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 184, 40));

        jLabel6.setText("Placa:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 120, 260, 30));

        jtxtPlaca.setText("1");
        jPanel2.add(jtxtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 150, 260, 40));

        jbtnAgregar.setText("Registrar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 640, 40));

        jtxtMarca.setText("1");
        jPanel2.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 200, 40));

        jLabel5.setText("Modelo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 10, 200, 26));

        jtxtModelo.setText("1");
        jPanel2.add(jtxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 40, 200, 40));

        jLabel7.setText("DNI del propietario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 330, 26));

        jtxtDNIPropietario.setText("1");
        jPanel2.add(jtxtDNIPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 350, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        Autos = new Autos(jtxtDNIPropietario.getText(), jtxtPlaca.getText(), jtxtMarca.getText(), jtxtModelo.getText(), jtxtColor.getText());
        agregar = (!"".equals(jtxtDNIPropietario.getText())) ? (!"".equals(jtxtPlaca.getText())) ? (!"".equals(jtxtMarca.getText())) ? (!"".equals(jtxtModelo.getText())) ? (!"".equals(jtxtColor.getText())) : false : false : false : false;
        agregar = propietarioExistente(jtxtDNIPropietario.getText());
        if (agregar) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos correctamente");
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JTextField jtxtColor;
    private javax.swing.JTextField jtxtDNIPropietario;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtModelo;
    private javax.swing.JTextField jtxtPlaca;
    // End of variables declaration//GEN-END:variables

    public Autos getAuto() {
        return Autos;
    }

    public boolean getAgregar() {
        return agregar;
    }

}
