/*
2-Escribe un programa que muestre el resultado de multiplicar dos numeros
introducidos por teclado.
 */
package ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader (isr);
        
        System.out.print("Introduce el primer numero \n");
        
        int n1 = Integer.parseInt(br.readLine());
        
        System.out.print("Introduce el segundo numero \n55");
        
        int n2 = Integer.parseInt(br.readLine());
        
        System.out.print("Resultado: " + n1 + "*"+ n2 + " = " + n1*n2 + "\n");
    }
    
}
