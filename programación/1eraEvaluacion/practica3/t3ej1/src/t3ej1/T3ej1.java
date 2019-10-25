/*
1. Dada una cadena de caracteres mostrar por pantalla la cantidad de
vocales que tiene. Ejemplo:
Entrada: Hola tu
Salida: La cantidad de vocales es 3
 */
package t3ej1;

import javax.swing.JOptionPane;

public class T3ej1 {

    public static void main(String[] args) {
        String ent = Entrada();
        int voc = ContarVocales(ent);
        
        JOptionPane.showMessageDialog(null, "El numero de vocales de la frase es: " + voc);
    }
    
    public static String Entrada(){
        
        String ent = "";
        
        try{
            ent = JOptionPane.showInputDialog("Introduzca la frase");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e + "\n \n Introduzca los datos correctos");
        }catch(Exception e){
        
        }
        return ent;
    }
    public static int ContarVocales(String ent){
        ent = ent.toUpperCase();
        int voc = 0;
        for(int x = 0; x<ent.length();x++){
            if(ent.charAt(x)=='A' || ent.charAt(x)=='E'||ent.charAt(x)=='I'||ent.charAt(x)=='O'||ent.charAt(x)=='U'){
                voc = voc + 1;
            }
        }
        return voc;
    }
}
