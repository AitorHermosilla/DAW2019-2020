/*
4.  Pide que te introduzcan por teclado los valores de las diagonales de
un rombo. Calcula y muestra su area (area = D * d/2)
 */
package ej4;

import javax.swing.JOptionPane;

public class Ej4 {

    public static void main(String[] args) {
       String Dnoparse = JOptionPane.showInputDialog(null, "Introduce la diagonal grande");
       
       int D = Integer.parseInt(Dnoparse);
       
       JOptionPane.showMessageDialog(
               null, "El area del rombo es: " 
                       + 
                       D*Integer.parseInt(
                               JOptionPane.showInputDialog("Introduce la diagonal pequeña del rombo")
                       )/2);
       
    }
    
}
