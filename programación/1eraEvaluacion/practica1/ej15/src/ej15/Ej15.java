/*
15. Disena un programa que permita introducir las notas de cierta canti- ˜
dad de alumnos y que luego muestre la cantidad de aprobados (notas
mayores o iguales a 6.00).
 */
package ej15;

import javax.swing.JOptionPane;

public class Ej15 {
    
    public static void main(String[] args) {
        
        int result = 0;
        int contin;
        
        do{
            double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la nota del/la alumn@"));
            
            if (n >= 6){
                result ++;
            }
            
            contin = JOptionPane.showConfirmDialog(null, "Quieres continuar?");
            
        } while (contin == 0);
        
        JOptionPane.showMessageDialog(null, "El numero de aprobados = " + result);
        
    }
    
}
