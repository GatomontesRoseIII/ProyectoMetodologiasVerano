package Principal;

import Animacion.Animacion;
import PanelPrincipales.Taxis;
import Registrar.Registrar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author elnoe
 */
public class Principal extends JFrame {
//componentes

    private final ImageIcon iconoBotonMenuExit = new ImageIcon(getClass().getResource("/Iconos/btnMenu.png"));
    ;
    private final ImageIcon iconoBotonMenuEntered = new ImageIcon(getClass().getResource("/Iconos/btnMenuSelect.png"));
    private final JPanel jpnlMenu = new JPanel();
    private final JButton jbtnMenu = new JButton();
    private final JPanel jpnlPrincipal = new JPanel();
    private final JButton BotonesMenu[] = new JButton[4];
    private final String[] nombreBotonMenu = {"Registrar Taxistas", "Registrar Taxis", "Registrar Infracciones", "Configuración"};
    private final JPanel panel = new JPanel();
    private final GroupLayout jpnlPanelPrincipal = new GroupLayout(panel);
    private final Color AzulOscuro = new Color(5, 5, 22);
//inicio

    private void jpanel() {
        //layout layout para agrandar el panelPrincipal proporcion Ventana
        panel.setLayout(jpnlPanelPrincipal);
        jpnlPanelPrincipal.setHorizontalGroup(jpnlPanelPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jpnlPrincipal, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE));
        jpnlPanelPrincipal.setVerticalGroup(jpnlPanelPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jpnlPanelPrincipal.createSequentialGroup().addGap(50, 50, 50).addComponent(jpnlPrincipal, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE).addGap(2, 2, 2)));
        //fin
        panel.setBackground(AzulOscuro);
        getContentPane().add(panel);
    }

    //constructor
    public Principal() {
        setSize(793, 522);
        setResizable(true);
        jpanel();
        iniciarComponentes();
        iniciarAcciones();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

//componentes
    private void iniciarComponentes() {
        jpnlMenu.setLocation(-200, 0);
        jpnlMenu.setSize(200, 485);
        jpnlMenu.setBackground(new Color(10, 20, 30));
        jpnlMenu.setLayout(null);
        panel.add(jpnlMenu);

        jbtnMenu.setLocation(0, 0);
        jbtnMenu.setSize(49, 49);
        jbtnMenu.setIcon(iconoBotonMenuExit);
        jbtnMenu.setBorder(null);
        jbtnMenu.setBackground(AzulOscuro);
        panel.add(jbtnMenu);

        jpnlPrincipal.setLocation(0, 50);
        jpnlPrincipal.setBackground(AzulOscuro);
        jpnlPrincipal.setLayout(new BorderLayout());
        jpnlPrincipal.setSize(40, 40);
        panel.add(jpnlPrincipal);
        accionPnlPrincipalRemplazo(new Registrar());

        int y = 100;
        for (int i = 0; i < BotonesMenu.length; i++) {
            BotonesMenu[i] = new JButton(nombreBotonMenu[i]);
            BotonesMenu[i].setLocation(0, y);
            BotonesMenu[i].setSize(200, 50);
            BotonesMenu[i].setFont(new Font("Segoe UI", 1, 14));
            BotonesMenu[i].setBorder(new MatteBorder(null));
            jpnlMenu.add(BotonesMenu[i]);
            y += 50;
        }
    }
//acciones

    private void iniciarAcciones() {
        jbtnMenu.addActionListener(this::accionBtnMenuClick);
        BotonesMenu[0].addActionListener(this::accionbtnRegistrarTaxistas);
        BotonesMenu[1].addActionListener(this::accionbtnRegistrarTaxis);
        BotonesMenu[2].addActionListener(this::accionbtnRegistrarInfracciones);
        BotonesMenu[3].addActionListener(this::accionbtnConfiguracion);
        jbtnMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                accionBtnMenuExit(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                accionBtnMenuEntered(e);
            }
        });
    }

    //click botonMenu
    private void accionBtnMenuClick(ActionEvent e) {
        int posicion = jbtnMenu.getX();
        if (posicion > 0) {
            Animacion.mover_izquierda(200, 0, 2, 2, jbtnMenu);
            Animacion.mover_izquierda(200, 0, 2, 2, jpnlPrincipal);
            Animacion.mover_izquierda(0, -210, 2, 2, jpnlMenu);
            //layout para agrandar el panelPrincipal proporcion Ventana
            jpnlPanelPrincipal.setHorizontalGroup(jpnlPanelPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jpnlPrincipal, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE));
            jpnlPanelPrincipal.setVerticalGroup(jpnlPanelPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jpnlPanelPrincipal.createSequentialGroup().addGap(50, 50, 50).addComponent(jpnlPrincipal, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE).addGap(2, 2, 2)));
        } else {
            Animacion.mover_derecha(0, 200, 2, 2, jbtnMenu);
            Animacion.mover_derecha(0, 200, 2, 2, jpnlPrincipal);
            Animacion.mover_derecha(-210, 0, 2, 2, jpnlMenu);
            //layout para agrandar el panelPrincipal proporcion Ventana
            jpnlPanelPrincipal.setHorizontalGroup(jpnlPanelPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jpnlPanelPrincipal.createSequentialGroup().addGap(200, 200, 200).addComponent(jpnlPrincipal, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)));
            jpnlPanelPrincipal.setVerticalGroup(jpnlPanelPrincipal.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jpnlPanelPrincipal.createSequentialGroup().addGap(50, 50, 50).addComponent(jpnlPrincipal, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)));
        }
    }

    //brillo imagen boton principal
    private void accionBtnMenuExit(MouseEvent e) {
        jbtnMenu.setIcon(iconoBotonMenuExit);
    }

    private void accionBtnMenuEntered(MouseEvent e) {
        jbtnMenu.setIcon(iconoBotonMenuEntered);
    }

    //llamar paneles por boton del Menu selecionado
    private void accionbtnRegistrarTaxistas(ActionEvent e) {
        accionPnlPrincipalRemplazo(new Registrar());
    }

    private void accionbtnRegistrarTaxis(ActionEvent e) {
        accionPnlPrincipalRemplazo(new Taxis());
    }

    private void accionbtnRegistrarInfracciones(ActionEvent e) {
        accionPnlPrincipalRemplazo(new Taxis());
    }

    private void accionbtnConfiguracion(ActionEvent e) {
        accionPnlPrincipalRemplazo(new Taxis());
    }

//metodos
    //remplazo panelPrincipal
    public void accionPnlPrincipalRemplazo(JPanel p) {
        p.setSize(100, 440);
        p.setLocation(0, 0);
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(p);
        jpnlPrincipal.revalidate();
    }
}
