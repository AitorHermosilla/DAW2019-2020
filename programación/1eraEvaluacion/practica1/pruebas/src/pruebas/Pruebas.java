/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int continu = 0;
        do{
            continu = JOptionPane.showConfirmDialog(null, "Continuar");
            Double t = Math.random()*100;
            int tiempo = t.intValue();
            JOptionPane.showMessageDialog(null, tiempo);
        }while(continu == 0);
    }
    
}
