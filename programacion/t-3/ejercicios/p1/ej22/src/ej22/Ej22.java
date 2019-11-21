/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej22;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero del cual se mostrá por pantalla los Nº primos anteriores a su valor"));
        int divi = 0;
        Integer cont = 0;
        String resultado = "";
        
        while(cont != n){
            for (int x = 1; x<cont;x++){
                if(cont%x == 0){
                    divi = divi +1;
                }
            }
            if(divi ==2){
                resultado = resultado + "\n" + cont.toString();
            }
            cont++;
            divi = 0;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
