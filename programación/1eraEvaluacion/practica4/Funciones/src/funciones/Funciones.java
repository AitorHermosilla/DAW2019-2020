/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
    
        int resultado = Calcular(n);
        
        JOptionPane.showMessageDialog(null, "El valor final es:" + resultado);
    }
    public static int Calcular(int n){
        int resultado = n + 100;
        
        return resultado;
    }
}
