/*
5.  Visualiza los grados Fahrenheit que corresponden a los grados centıgrados que recibas como dato de entrada.
 */
package ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float c = Float.parseFloat(JOptionPane.showInputDialog("Introduce los grados Cº"));
        
        float f = 0;
        
        f= (float) (1.8*c+32);
        
        JOptionPane.showMessageDialog(null, c + " Grados centigrados son: " + f);
        
        
        
    }
    
}
