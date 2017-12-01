package face;

import javax.swing.*;

public class Lanceur {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                //On crée une nouvelle instance de notre JDialog
                ParkingFenetre fenetre = new ParkingFenetre();
                fenetre.setVisible(true);//On la rend visible
            }
        });
    }
}