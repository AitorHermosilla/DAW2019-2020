/*
1-Escribe un programa que visualice por pantalla un mensaje introdu-
cido por teclado.
*/
package ej1;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
                null, JOptionPane.showInputDialog("Introduce el mensaje que quiere mostrar")
        );
    }
    
}
