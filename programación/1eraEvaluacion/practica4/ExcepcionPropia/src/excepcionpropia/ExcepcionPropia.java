/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionpropia;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class ExcepcionPropia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean error = true;
        try{
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if(n>10 && n<0){
                throw new NumeroIncorrecto();
            }
        }catch(NumeroIncorrecto e){
            JOptionPane.showMessageDialog(null, "El numero no puede ser mas pequeño que 0 ni mas grande que 10");
        }
    }
}
