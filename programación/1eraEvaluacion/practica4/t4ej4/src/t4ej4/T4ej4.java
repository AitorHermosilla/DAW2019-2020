/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class T4ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arrMeses = new String[12];
        
        arrMeses = LlenarArray(arrMeses);
        
        String mes = Introducir();
        
        String mensaje = Comparar(arrMeses, mes);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static String[] LlenarArray(String[] arrMeses){
        
        arrMeses[0] = "Enero";
        arrMeses[1] = "Febrero";
        arrMeses[2] = "Marzo";
        arrMeses[3] = "Abril";
        arrMeses[4] = "Mayo";
        arrMeses[5] = "Junio";
        arrMeses[6] = "Julio";
        arrMeses[7] = "Agosto";
        arrMeses[8] = "Septiembre";
        arrMeses[9] = "Octubre";
        arrMeses[10] = "Noviembre";
        arrMeses[11] = "Diciembre";
        
        return arrMeses;
    }
    public static String Introducir(){
        
        String meses = "";
        boolean error = false;
        try{
            do{
                meses = JOptionPane.showInputDialog("Introduce el mes");
                error = false;
            }while(error == true);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ha habido un error con los datos");
            error = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha habido un error desconocido" + "\n" + e);
            error = true;
        }
        return meses;
    }
    public static String Comparar(String[] arrMeses, String mes){
        
        String resultado = "Incorrecto";
        
        for(int x = 0; x< arrMeses.length; x++){
            
            if(arrMeses[x].toLowerCase().equals(mes.toLowerCase())){
                
                resultado = "Correcto";
            }
        }
        
        return resultado;
    }
}
