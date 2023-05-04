package vista;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used for ...
 * @autor Carlos Felipe Montoya carlos.felipe.montoya@correounivalle.edu.co
 * @version v.1.0.0 date:21/03/2023
 */
public class GUI extends JFrame {

    private Header headerProject;
    private JPanel Seccion_1,Seccion_2;
    private JLabel dadosActivos,dadosIncativos,dadosPuntos,dadosUsados;
    private ImageIcon imagen_activos, imagen_inactivos, imagen_puntos, imagen_usados;
    private GridBagConstraints constraints;

    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek of master");
//        this.setSize(400,500);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        //Create Listener Object and Control Object

        //Obtiene el contenedor por defecto de la ventana y le pongo el nuevo layout "GridBagLayout"
        this.getContentPane().setLayout(new GridBagLayout());
        //Se crea un objeto "constrain" para configurar el Grib layout
        constraints = new GridBagConstraints();

        //Set up JComponents
        //Se pone un el texto de cabecera, se igrasan las coordenadas constrain, se añade a la ventana
        headerProject = new Header("The Geek Of Master", Color.BLACK);
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.gridwidth=13;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(headerProject,constraints); //Change this line if you change JFrame Container's Layout

        //Zona dedos Activos
        imagen_activos = new ImageIcon(getClass().getResource("/recursos/zona.png"));
        dadosActivos = new JLabel(imagen_activos);
        dadosActivos.setPreferredSize(new Dimension(250,170));
        dadosActivos.setOpaque(true);
        constraints.gridx=1;
        constraints.gridy=1;
        constraints.gridwidth=4;
        constraints.gridheight=4;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(dadosActivos,constraints); //Change this line if you change JFrame Container's Layout

        //Zona dedos inctivos
        imagen_inactivos = new ImageIcon(getClass().getResource("/recursos/zona.png"));
        dadosIncativos = new JLabel(imagen_inactivos);
        dadosIncativos.setPreferredSize(new Dimension(250,170));
        dadosIncativos.setOpaque(true);
        constraints.gridx=8;
        constraints.gridy=1;
        constraints.gridwidth=4;
        constraints.gridheight=4;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(dadosIncativos,constraints); //Change this line if you change JFrame Container's Layout

        //Zona dedos usados
        imagen_usados = new ImageIcon(getClass().getResource("/recursos/zona.png"));
        dadosUsados = new JLabel(imagen_usados);
        dadosUsados.setPreferredSize(new Dimension(250,170));
        dadosUsados.setOpaque(true);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=4;
        constraints.gridheight=4;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(dadosUsados,constraints); //Change this line if you change JFrame Container's Layout

        //Zona de dados puntos
        imagen_puntos = new ImageIcon(getClass().getResource("/recursos/puntos.png"));
        dadosPuntos = new JLabel(imagen_puntos);
        dadosPuntos.setPreferredSize(new Dimension(250,170));
        dadosPuntos.setOpaque(true);
        constraints.gridx=8;
        constraints.gridy=5;
        constraints.gridwidth=4;
        constraints.gridheight=4;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(dadosPuntos,constraints); //Change this line if you change JFrame Container's Layout
    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha {

    }
}
