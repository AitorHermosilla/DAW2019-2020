/*
11. Nos piden que implementemos el software para 
una maquina expendedora de golosinas.

Cada golosina tiene un nombre y un precio
Tambien tendrán una cantidad inicial que en principio será de 5. ´

Tendremos un pequeno menú con las siguientes opciones:

    --> Pedir golosina: pedira la posición de la golosina que quiera. 
        Esta maquina tiene golosinas en cada posición, 
        identificados por su fila y columna, que sera lo que introduzca 
        el usuario al pedir una golosina, por ejemplo si el usuario teclea 
        20 significa que esta pidiendo la golosina que esta en la fila 2 columna 0.
        Cuando no haya mas golosinas se le indicará al usuario. 
        Solo puede pedir una golosina.

    --> Mostrar golosinas: mostrara todas las golosinas disponibles. 
        Mostrara el código que debe introducir el usuario, el nombre y el precio. 
        La cantidad disponible no se mostrara. 

    --> Rellenar golosinas: esta es una funcion exclusiva de un técnico 
        por lo que nos pedira una contraseña, si el usuario escribe 
        MaquinaExpendedora2019 le pedira la posición de la golosina y la cantidad.

    --> Apagar máquina: sale del programa. Antes de salir mostrara las 
        ventas totales durante la ejecucion del programa. 
 */
package t4p11;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class T4p11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "BienVenido a la MAQUINA EXPENDEDORA DE GOLOSINAS: "
                        + "1- Pedir golosina"
                        + "2- Mostrar golosinas"
                        + "3- Rellenar golosinas"
                        + "4- Apagar máquina"));
    }
    public static void PedirGolosinas(){
        
    }
    public static void MostrarGolosina(){
        
    }
    public static void RellenarGolosinas(){
        
    }
    public static void ApagarMaquina(){
        System.exit(0);
    }
}
