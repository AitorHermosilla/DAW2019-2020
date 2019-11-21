/*
2. Dada una cadena de caracteres invertir la misma y mostrar por pantalla. Ejemplo:
Entrada: casa blanca
Salida: acnalb asac
 */
package t3ej2;

import javax.swing.JOptionPane;

public class T3ej2 {

    public static void main(String[] args) {
        String ent = Entrada();
        String gir = Girar(ent);
        
        JOptionPane.showMessageDialog(null, "Frase anterior: " + ent + "\n Frase nueva: " + gir);
    }
    public static String Entrada(){
        String ent = "";
        try{
            ent = JOptionPane.showInputDialog("Introduzca la frase a girar");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + "\n" + e);
        }
        return ent;
    }
    public static String Girar(String ent){
        char car ;
        String gir = "";
        
        for(int x = ent.length()-1; x!=-1;x--){
            
            car = ent.charAt(x);
            
            gir = gir + car;
            
        }
        return gir;
    }
}
