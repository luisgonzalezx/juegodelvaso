package juegodelvaso;
import java.util.Random;
import javax.swing.JOptionPane;

public class JuegodelVaso {

    
    public static void main(String[] args) {
        
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
        
        int seleccion = JOptionPane.showOptionDialog(null,"Encuentre la pelotita escondida","Juego del Vaso",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        new Object []{"Vaso 1", "Vaso 2","Vaso 3"},"Vaso 1" );
        
        if (pelotita==seleccion){
           JOptionPane.showMessageDialog(null,"MUY BIEN", "Juego del Vaso",JOptionPane.INFORMATION_MESSAGE);
                 
        } else {
           JOptionPane.showMessageDialog(null,"MUY MAL", "Juego del Vaso",JOptionPane.INFORMATION_MESSAGE);
        }
            
        
        
        
    
        
    }
    
}
