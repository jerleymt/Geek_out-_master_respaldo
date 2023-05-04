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
    private JLabel Label_1,Lasbe_2;
    private ImageIcon imgen_1, imagen_2;
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
        constraints.gridwidth=4;
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(headerProject,constraints); //Change this line if you change JFrame Container's Layout
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
