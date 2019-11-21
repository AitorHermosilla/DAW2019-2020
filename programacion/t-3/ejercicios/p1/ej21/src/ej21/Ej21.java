/*
21. Haz un programa que pida al usuario un numero y diga si ese n ´ umero ´
es primo o no.
 */
package ej21;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Ej21 {

    public static void main(String[] args) {
        int cont = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero a evaluar"));
        
        for(int x = 1; x<n+1;x++){
            if(n%x == 0){
                cont++;
            }
        }
        
        if (cont == 2){
            JOptionPane.showMessageDialog(null, n + " Es un numero primo");
        }else{
            JOptionPane.showMessageDialog(null, n + " No es un numero primo");
        }
    }
}
