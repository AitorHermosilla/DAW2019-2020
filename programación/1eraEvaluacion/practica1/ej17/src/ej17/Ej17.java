/*
17. Disena un programa que obtenga la calificacion mayor y la calificacion
menor, de un grupo de 40 estudiantes, ademas de los nombres de dichos alumnos.
 */
package ej17;

import javax.swing.JOptionPane;


public class Ej17 {

        private static double nMayor = 0;
        private static double nMenor = 10;
        private static String nombreMayor;
        private static String nombreMenor;
    
    public static void main(String[] args) {
        IntroducirDatos();
        JOptionPane.showMessageDialog(null, "El alumno con la nota más alta ha sido " + nombreMayor + " Con un " + nMayor 
                                            + "\n El alumno con la nota más baja ha sido " + nombreMenor + " Con un " + nMenor);
    }
    public static void IntroducirDatos(){
        for (int x = 0; x < 40; x++){
            
            double nota = ValidarNota();
            
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del/la alumn@");
            
            CompararNotas(nota, nombre);
            
        }
    }
    public static double ValidarNota(){
        
        double nota = 0;
        
        do{
            nota = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la nota del o la alumn@"));
            
            if(nota < 0 || nota > 10){
               JOptionPane.showMessageDialog(null, "La nota introducida es incorrecta");
            }
        }while(nota < 0 || nota > 10);
        
        return nota;
    }
    public static void CompararNotas(double nota,String nombre){
        if(nota > nMayor){
            nMayor = nota;
            nombreMayor = nombre;
        }else{
            if(nota < nMenor){
                nMenor = nota;
                nombreMenor = nombre;
            }
        }
    }
}
    
