/*
19. Escribe un programa que calcule el cuadrado de un numero haciendo ´
solo sumas. (El cuadrado de un n ´ umero n es la suma de los n primeros ´
numeros impares).
 */
package ej19;

import javax.swing.JOptionPane;

public class Ej19 {

    public static void main(String[] args) {
        
        int j = 0;
        int total = 0;
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el numero a elevar al cuadrado"));
        
        for(int x = 0; x<n*2;x++){
            if(j%2!=0){
                total = total + x;
            }
            j = j+1;
        }
        JOptionPane.showMessageDialog(null, n + " Elevado al cuadrado = " + total);
    }
    
}
