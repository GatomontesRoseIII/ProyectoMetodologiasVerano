package Registrar;

import Persona.Propietario;
import javax.swing.JOptionPane;
import Persona.Taxista;
import java.awt.Color;


/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class AgregarPropietario extends javax.swing.JDialog {
    
    //atributes
    private Propietario Propietario;
    private boolean agregar=false;
    //methods
    public AgregarPropietario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public AgregarPropietario(java.awt.Frame parent, boolean modal,String DNI, String Nombres, String Apellidos, String Edad, String Sexo, String EstadoCivil) {
        super(parent, modal);
        initComponents();
        jtxtDni.setText(DNI);
        jtxtNombres.setText(Nombres);
        jtxtApellidos.setText(Apellidos);
        jtxtEdad.setText(Edad);
        jcbxSexo.setSelectedItem(Sexo);
        jcbxSexo.setSelectedItem(EstadoCivil);
        jbtnAgregar.setText("Registrar Modificación");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtApellidos.setText("1");
        jPanel1.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 190, 40));

        jLabel1.setText("Apellidos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 184, 26));

        jLabel2.setText("Estado Civil:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 184, 30));

        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 184, 26));

        jtxtNombres.setText("1");
        jPanel1.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 184, 40));

        jLabel4.setText("DNI:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, 184, 26));

        jtxtDni.setText("1");
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 184, 40));

        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 184, 30));

        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 184, 30));

        jtxtEdad.setText("1");
        jPanel1.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 184, 40));

        jcbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado" }));
        jPanel1.add(jcbxEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 190, 40));

        jcbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(jcbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 190, 40));

        jbtnAgregar.setText("Registrar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
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
            Propietario=new Propietario(jtxtNombres.getText(), jtxtApellidos.getText(), jtxtDni.getText(), Integer.parseInt(jtxtEdad.getText()),String.valueOf(jcbxSexo.getSelectedItem()), String.valueOf(jcbxEstadoCivil.getSelectedItem()));
            agregar=(!"".equals(Propietario.getApellido()))?(!"".equals(Propietario.getNombre()))?(!"".equals(Propietario.getDni())):false:false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ingresar los datos Correctamente.");
            agregar=false;
        }
        if (agregar) {
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Llene todos los datos correctamente");
        }
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JComboBox<String> jcbxEstadoCivil;
    private javax.swing.JComboBox<String> jcbxSexo;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtDni;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtNombres;
    // End of variables declaration//GEN-END:variables
//retorno Datos
    public Propietario getPropietario() {
        return Propietario;
    }

    public boolean getAgregar() {
        return agregar;
    }
    
}
