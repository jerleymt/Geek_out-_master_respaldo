package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private Header headerProject;
    private JPanel panelActivos,panelIncativos,panelPuntos,panelUsados;
    private JLabel dadosActivos,dadosIncativos,dadosPuntos,dadosUsados;
    private ImageIcon imagen_activos, imagen_inactivos, imagen_puntos, imagen_usados,imagen_dado;
    private GridBagConstraints constraints; // referencias del grid
    private JButton atras, salir; // lanza los dados
//    private Escucha escucha;

    /**
     * Constructor of GUI class
     */
    public Menu(){
        //Default JFrame configuration
        this.setTitle("menu");
        this.setSize(new Dimension(200,200));
        this.setBackground(Color.BLACK);
        this.isOpaque();
//        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


