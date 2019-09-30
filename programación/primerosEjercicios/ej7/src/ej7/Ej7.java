/*
7.  Realiza el diagrama de flujo que calcule la hipotenusa de un triangulo
rectangulo teniendo como datos de entrada los dos catetos. 
(El Teo-rema de Pitagoras nos dice que para cualquier triangulo rectangulo,
la suma de los cuadrados de los catetos es igual al cuadrado de la hipotenusa).
 */
package ej7;

import javax.swing.JOptionPane;

public class Ej7 {

    public static void main(String[] args) {
     
        double cat1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer cateto"));
        
        double cat2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo cateto"));
        
        double h = Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
        
        JOptionPane.showMessageDialog(null, "La hipotenusa es: "+h);
        
    }
}
