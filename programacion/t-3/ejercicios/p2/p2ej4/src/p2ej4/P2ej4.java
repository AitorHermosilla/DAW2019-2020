/*
4. Desarrolla una programa en el que el usuario nos proporcione el
nombre de los alumnos de un curso y sus notas en seis asignaturas
distintas. 

El programa terminara cuando como nombre nos tecleen la ´
palabra FIN.
Nuestro programa debe visualizar el nombre de cada uno de los alumnos y su nota media.
Al final, cuando nos tecleen fin, mostraremos la nota media del conjunto de alumnos.
 */
package p2ej4;

import javax.swing.JOptionPane;

public class P2ej4 {

    public static void main(String[] args) {
        String nombre = "";
        double nota = 0;
        String mensaje = "";
        double media = 0;
        
        mensaje = IntroducirDatos(nombre, nota, mensaje, media);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static String IntroducirDatos(String nombre, double nota, String mensaje, double media){
        boolean error = false;
        int confirmacion = 0;
        int cont = 0;
        String notas = "";
        do{
            try{
                do{
             
                    nombre = JOptionPane.showInputDialog("Introduzca el nombre del/la alumn@: ");
                    
                    for (int x = 0; x<6;x++){
                        nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la"+x+"º"+" nota del/la alumn@"));
                        notas = notas + "\n nota de la "+x+"ª "+"asignatura = "+nota;
                    }
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del/la alumn@"));
                
                    mensaje = mensaje + "\n Nombre: " + nombre + " Notas: " + notas;
                    
                    cont ++;
                    media = media + nota;
                    
                    confirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?");
                    
                    error = false;
                }while(confirmacion == 0);
                
                media = media/cont;
                mensaje = mensaje + "\n \n \n La nota media es: " + media;
                
                
            }catch(NumberFormatException e){
               error = true;
               
               JOptionPane.showMessageDialog(null, "He detectado el siguiente error" + "\n\n\n\n"+e+"\n\n\nHas introducido letras en un valor numerico");
            }
            
        }while(error);
        return mensaje;
    }
    
}
