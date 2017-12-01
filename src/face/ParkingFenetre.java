package face;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class ParkingFenetre extends JFrame{

    public ParkingFenetre(){
        super();

        build();//On initialise notre fenêtre
    }

    private void build(){
        setTitle("PassionateParking"); //On donne un titre à l'application
        setSize(600,500); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
        setContentPane(buildContentPane());
    }
    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel("Bienvenue dans Passionate Parking, l'application de gestion de parking pour passioné!");

        panel.add(label);

        return panel;
    }
}