package Registrar;

import Registrar.RegistrarAutos;
import Registrar.RegistrarTaxistas;
import java.awt.Color;


/**
 *
 * @author elnoe
 */
public class Registrar extends javax.swing.JPanel {
    //atributos
    Color AzulOscuro=new Color(5, 5, 22);
    //methods
    public Registrar() {
        
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        setBackground(AzulOscuro);

        jTabbedPane1.setBackground(AzulOscuro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Registrar Autos", new RegistrarAutos());
        jTabbedPane1.addTab("Registrar Propietarios", new registrarPropietarios());
        jTabbedPane1.addTab("Registrar Taxistas", new RegistrarTaxistas());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}