/*
 16. Calcula el promedio de edades de un grupo de estudiantes de los
cuales no se conoce la cantidad.
 */
package ej16;

import javax.swing.JOptionPane;

public class Ej16 {

    public static void main(String[] args) {
        
        int sum = 0;
        int cont = 0;
        
        int edadMed = IntroducirEdades(sum, cont);
        
        JOptionPane.showMessageDialog(null, "La media de todas las notas es: " + edadMed);
    }
    public static int IntroducirEdades(int sum, int cont){
        
        int contin = 0;
        
        do{
            
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad del/la alumn@"));
            
            sum = sum + edad;
            
            cont ++;
            
            contin = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        }while(contin == 0);
        
        int edadMed = 0;
        
        edadMed = sum/cont;
        
        return edadMed;
    }
    
}
