/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Prueba {

    /**
     Excepciones
     */
    public static void main(String[] args) {
        boolean error = true;
        while(error==true){
            try{
                int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor numerico"));
                
                error = false;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "EROORRR");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                error = true;
            }   
        }
        
    }
    
}
