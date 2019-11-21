/*
11.  Crear un diagrama de flujo que pida tres numeros y muestre cual es
el mayor y cual es el menor.
 */
package ej11;

import javax.swing.JOptionPane;

public class Ej11 {

    public static void main(String[] args) {
        double nG = 0;
        double nP = -1;
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el numero 1"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el numero 2"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el numero 3"));
        
        if (n1 > n2 && n1 > n3){
                nG = n1;
            }else if(n2 > n1 & n2 > n3){
                nG = n2;
            }else{
                nG = n3;
            }
        
        if (n1 < n2 && n1 < n3){
            nP = n1;
            }else if(n2 < n1 && n2 < n3){
                nP = n2;
            }else{
                nP = n3;
            }
        
        JOptionPane.showMessageDialog(null, "El numero mas alto es: " + nG + "\n"
                                            + "El numero mas pequeño es: " + nP);
    }
    
}
