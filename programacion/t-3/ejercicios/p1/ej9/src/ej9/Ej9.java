/*
9.  Convertir una calificacion numerica que recibimos como dato de entrada
(0 al 10) a muy deficiente, insuficiente, suficiente, bien, notable o sobresaliente
 */
package ej9;

import javax.swing.JOptionPane;

public class Ej9 {

    public static void main(String[] args) {
     
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota que has sacado"));
        
        if (nota <= 3){
            JOptionPane.showMessageDialog(null, "Muy deficiente");
        }else if (nota < 5){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }else if (nota == 5){
            JOptionPane.showMessageDialog(null, "Suficiente");
        }else if (nota <= 7){
            JOptionPane.showMessageDialog(null,"Bien");
        }else if (nota <= 9){
            JOptionPane.showMessageDialog(null, "Notable");
        }else if (nota <= 10){
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }else{
            JOptionPane.showMessageDialog(null, "No has introducido un valor comprendido entre 0 y 10");
        }
        
    }
}
