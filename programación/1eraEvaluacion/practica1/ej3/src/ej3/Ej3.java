/*3.  Introduce por teclado los valores correspondientes a la base y la altura
de un rectangulo e imprime su perımetro (2 x base1+2 x altura).*/
package ej3;

import javax.swing.JOptionPane;

public class Ej3 {

    public static void main(String[] args) {
        int bas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la base"));
        
        int alt = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la altura"));
        
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " + 2*bas+2*alt);
    }
    
}
