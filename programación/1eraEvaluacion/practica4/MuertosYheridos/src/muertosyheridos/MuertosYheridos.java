/*
 */
package muertosyheridos;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/**
 */
public class MuertosYheridos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer num = GenerarNumeroAleatorio();
        
        Integer numUs = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        Comprobar(numUs);
        
        String resultado = MuertosHeridos(num, numUs);
        
    }
    public static int GenerarNumeroAleatorio(){
        
        Double n = Math.random() * 1000;
        
        Integer numero = n.intValue();
        
        return numero;
    }
    public static String MuertosHeridos(Integer num, Integer numUS){
        String mensaje = "";
        
        for(int x = 0; x<num.toString().length();x++){
            
        }
        
        return mensaje;
    }
    public static void Comprobar(Integer numUS){
        for(int x = 0; x<numUS.toString().length();x++){
            
        }
    }
}
