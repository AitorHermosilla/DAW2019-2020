/*
3. Dada una cadena de caracteres y un caracter, verificar cuantas veces ´
se repite el caracter en la cadena, por ejemplo: ´
Entrada: casa blanca ’a’
Salida: El caracter ’a’ se repite 4 veces
 */
package t3ej3;

import javax.swing.JOptionPane;

public class T3ej3 {

    public static void main(String[] args) {
        String frase = "";
        int cnt = 0;
        
        frase = JOptionPane.showInputDialog(null, "Introduzca la frase deseada").toLowerCase();
        
        cnt = ContarCaracteres(frase, cnt);
        
        JOptionPane.showMessageDialog(null, "El caracter seleccionado se muestra: " + cnt +" veces");
        
    }
    public static int ContarCaracteres(String frase, int cnt){
        
        boolean error = false;
        
        do{
            try{
                String cadena = JOptionPane.showInputDialog("Introduzca el caracter a contar").toLowerCase();

                if(cadena.length()>1)
                {
                    throw new NotChar();
                }
                error = false;

            }catch(NotChar e){
                JOptionPane.showMessageDialog(null, "Debes de introducir un unico caracter.");
                error = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error: NumberFormatException");
                error = true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "error desconocido: \n" + e);
                error = true;
            }
            
        }while(error);
 
        Character caracter = frase.charAt(0);
        
        for(int x = 0; x < frase.length()-1;x++){
            if(caracter.compareTo(frase.charAt(x))==0){
                cnt ++;
            }
        }
        
    return cnt;
    }
}
