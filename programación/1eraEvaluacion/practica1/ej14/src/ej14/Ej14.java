/*
14. Escribe un programa que calcule la suma de 10 numeros. 
El programa ira pidiendo numeros al usuario y, cuando tenga 10, 
mostrara el resultado y terminara
 */
package ej14;

import javax.swing.JOptionPane;

public class Ej14 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bien venido a la suma de 10 numero");
        
        int resultado = Suma();
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
                
    }
    public static int Suma(){
        int resultado = 0;
        for (int x = 0;x<10;x++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero: " + x));
            resultado = resultado + n;
        } 
        return resultado;
    }
}
