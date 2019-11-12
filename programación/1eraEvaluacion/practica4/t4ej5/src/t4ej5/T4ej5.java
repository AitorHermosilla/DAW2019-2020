/*
Desarrolla un programa que pida los litros de agua ca´ıdos durante un
ano determinado (d ˜ ´ıa, mes y litros). Cuando el usuario nos indique
que no quiere continuar, debemos mostrar lo que ha llovido en cada
uno de los meses del ano. Todos lo datos de entrada son num ˜ ericos y ´
suponemos que correctos.
 */
package t4ej5;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class T4ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr1 = new int[12][31];
        int continuar = 0;
        do{
            int dias = IntroducirDias();
        
            int meses = IntroducirMeses();
            
            arr1[meses][dias] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de lluvia"));
            
            continuar = JOptionPane.showConfirmDialog(null, "¿Quiere continuar?");
            
        }while (continuar == 0);
        
        String mensaje = BuscarEnArray(arr1);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static String BuscarEnArray(int[][] arr1){
        String mensaje = "";
        for(int x = 0; x<arr1.length; x++){
            for(int y = 0; y<arr1[x].length; x++){
                 mensaje = "El " + y + " del mes " + x + "Ha llovido" + arr1[x][y] + "\n";
            }
        }
        
        return mensaje;
    }
    public static int IntroducirDias(){
        boolean error = false;
        int dias = 0;
        try{
            do{
                dias = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia"));
            }while(error);
            
            error = false;
        }catch(NumberFormatException e){
            error = true;
            JOptionPane.showMessageDialog(null,"Error en la transformación de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error desconocido");
        }
        return dias;
    }
    public static int IntroducirMeses(){
        int meses = 0;
        boolean error = false;
        try{
            do{
                meses = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes"));
            }while(error);
            
            error = false;
        }catch(NumberFormatException e){
            error = true;
            JOptionPane.showMessageDialog(null,"Error en la transformación de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error desconocido");
        }
        return meses;
    }
}
