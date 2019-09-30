/*
8.  Convierte una calificacion numerica que recibes como dato de entrada
(0 al 10) a un aprobado ( mayor o igual que 5) o suspenso ( menor que 5) 
y muestralo en pantalla.
 */
package ej8;

import javax.swing.JOptionPane;

public class Ej8 {

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Introducemela la nota"));
        
        if (nota >= 5){
            JOptionPane.showMessageDialog(null, "Felicidades! Has aprobado con un: " + nota);
        }else{
            JOptionPane.showMessageDialog(null, "Necesitas un 5 minimo para aprobar y has sacado un: " + nota);
        }
    }
    
}
