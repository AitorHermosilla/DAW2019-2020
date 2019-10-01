/*
10.  Introducir por teclado un numero comprendido entre el 1 y el 7 e imprimir
el dıa de la semana al que hace referencia. Por ejemplo, si introducen el
1 se visualizara Lunes.
 */
package ej10;

import javax.swing.JOptionPane;

public class Ej10 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de la semana"));
        
        Comprobar(num);
        
        switch(num){
            case 1: JOptionPane.showMessageDialog(null, "LUNES!");
                break;
            case 2: JOptionPane.showMessageDialog(null, "MARTES!");
                break;
            case 3: JOptionPane.showMessageDialog(null, "MIERCOLES!");
                break;
            case 4: JOptionPane.showMessageDialog(null, "JUEVES!");
                break;
            case 5: JOptionPane.showMessageDialog(null, "VIERNES!");
                break;
            case 6: JOptionPane.showMessageDialog(null, "SABADO!");
                break;
            case 7: JOptionPane.showMessageDialog(null, "DOMINGO!");
                break;
        }
    }
    
    public static int Comprobar(int num){
        
        while (num <1 || num >7){
            JOptionPane.showMessageDialog(null, "El numero no esta entre el 1 y el 7");
            
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de la semana"));
        }
            
        return num;
    }
}
