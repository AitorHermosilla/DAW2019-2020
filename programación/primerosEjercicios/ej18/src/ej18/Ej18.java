/*
18. Disenar un programa que calcule el n- ˜ esimo t ´ ermino de la serie de ´
Fibonacci. La sucesion comienza con los n ´ umeros 1 y 1, y a partir de ´
estos, cada termino es la suma de los dos anteriores. (1, 1, 2, 3, 5,8,13, ´
21,34, 55, 89, 144, 233, 377,...)
 */
package ej18;

import javax.swing.JOptionPane;

public class Ej18 {
    
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        Integer n3 = 0;
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los numeros que quieres en la seguida"));
        
        String resultado = "1\n1";
        
        for (int y = 0; y < x; y++){
            n3 = n1 + n2;
            resultado = resultado + "\n" + n3.toString() ;
            n2 = n1;
            n1 = n3;
                  
        }
        JOptionPane.showMessageDialog(null, resultado);
        
    }
    //INTENTAR HACERLO CON STRINGBUILDER
}
