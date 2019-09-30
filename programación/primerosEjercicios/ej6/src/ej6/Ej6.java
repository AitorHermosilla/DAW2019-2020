/*
6.  Visualiza el area de la circunferencia que corresponde al radio intro-
ducido por teclado. 
(A=PI * R * R)
 */
package ej6;

import javax.swing.JOptionPane;

public class Ej6 {

    public static void main(String[] args) {
        double R = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la diagonal de la circunferencia: "));
        
        double A = Math.PI * R * R;
        
        JOptionPane.showMessageDialog(null, "El area de la circunferencia es: " + A);
        
    }
    
}
