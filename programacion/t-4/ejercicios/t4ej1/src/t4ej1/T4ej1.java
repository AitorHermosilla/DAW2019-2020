/*
Crear un array de 10 elementos para guardar en el valores de tipo real
(float o double) que iremos introduciendo por teclado hasta finalizar.
Una vez le´ıdos y almacenados se visualizara el valor m ´ aximo y el ´
m´ınimo.
 */
package t4ej1;

import javax.swing.JOptionPane;

/**
 */
public class T4ej1 {

    /**
     */
    public static void main(String[] args) {
        double[] arr1 = new double[10];
        
        arr1 = LlenarNumeros(arr1);
        
        String lista = BuscarMaxMin(arr1);
        
        MostrarArray(arr1);
        
        JOptionPane.showMessageDialog(null, lista);
    }
    public static double[] LlenarNumeros(double[] arr1){
        
        for(int x=0;x<arr1.length;x++){
            arr1[x] = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el numero " + x + "de el listado"));
        }
        
        return arr1;
    }
    public static String BuscarMaxMin(double[] arr1){
        String lista = "";
        
        double max = -1;
        double min = 1000;
        
        for(int x = 0; x < arr1.length; x++){
            if(arr1[x] > max){
                max = arr1[x];
            }else if (arr1[x]<min){
                min = arr1[x];
            }
        }
        
        lista = "El numero maximo es: " + max
                + "\nEl numero minimo es: " + min;
        
        return lista;
    }
    public static void MostrarArray(double[] arr1){
        String arr1S = "";
        
        for(int x=0;x<arr1.length;x++){
            arr1S = arr1S + x + ": " + arr1[x] + "\n";
        }
        JOptionPane.showMessageDialog(null, arr1S);
    }
}
