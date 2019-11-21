/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej6;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class T4ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = IntroducirTexto();
        
        String resultado = Comparacion(mensaje);
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    public static String IntroducirTexto(){
        String mensaje = "";
        
        try{
            mensaje = JOptionPane.showInputDialog(null,"Introduce tu frase");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mensaje;
    }
    public static String Comparacion(String mensaje){
        int cont = 0;
        String resultado = "";
        String resul = "";
        for(int x = 0;x<mensaje.length();x++){
            if(!(mensaje.charAt(x)==' ')){
            
                for(int y = 0; y<mensaje.length();y++){
                    if(mensaje.toUpperCase().charAt(x) == mensaje.toUpperCase().charAt(y)){
                    cont = cont + 1;
                    }
                }   
            }
            resultado = resultado + "\n la letra: "+ mensaje.charAt(x) + " se repite " + cont + " Veces";
            cont = 0;
        }
        
        return resultado;
    }
}
