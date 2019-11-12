/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion : "
                + "\n 1- sumar"
                + "\n 2- restar"
                + "\n 3- dividir"
                + "\n 4 - multiplicar"));
        switch(opcion){
            case 1: Suma();
            break;
            case 2: Restar();
            break;
            case 3: Dividir();
            break;
            case 4: Multiplicar();
        }
    }
    private static void Suma(){
            
    }
    private static void Restar(){
        
    }
    private static void Dividir(){
        
    }
    private static void Multiplicar(){
        
    }
    
        
}
