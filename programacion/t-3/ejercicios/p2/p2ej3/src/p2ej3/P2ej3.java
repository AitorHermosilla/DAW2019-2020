/*
3. Mostrar al usuario el siguiente menu:

1.- Sumar dos numeros.
2.- Restar dos numeros ´
3.-Visualizar la tabla de multiplicar de un numero. ´
4.- Visualizar el cociente y el resto de una division. ´
5.-Salir del programa.

Elige una opcion: ´
Cuando tengamos el resultado de la operacion elegida, lo visualiza- ´
mos en pantalla y volveremos a mostrar el menu hasta que seleccione ´
la opcion de salir
 */
package p2ej3;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class P2ej3 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bien Venid@");
        
        int continuar = 0;
        
        do{
            int opcion = Menu();
        
            MenuSwitch(opcion);
            
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar ?");
        } while (continuar == 0);
    }
    public static int Menu(){
        
        int opcion = 0;
        
        try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una de las siguentes opciónes por favor: "
                + "\n 1- Sumar dos numeros"
                + "\n 2- Restar dos numeros"
                + "\n 3- Tabla de multiplicar"
                + "\n 4- Divisidir"
                + "\n 5- Salir"));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Se a producido un error: \n" + e + "\n¿Segur@ que has introducio un numero?");
        }catch (Exception e){}
    return opcion;
    }
    public static void MenuSwitch(int opcion){
        switch(opcion){
            case 1: Sumar();
                break;
            case 2: Restar();
                break;
            case 3: TablaMultiplicar();
                break;
            case 4: Dividir();
                break;
            case 5: Exit();
        }
    }
    public static void Sumar(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero a sumar"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero a sumar"));
        
        JOptionPane.showMessageDialog(null, "el resultado de la suma = "+ (n1 + n2));
    }
    public static void Restar(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero a restar"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero a restar"));
        
        JOptionPane.showMessageDialog(null, "el resultado de la resta = "+ (n1 - n2));
    }
    public static void TablaMultiplicar(){
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
        String resul = "";
        
        for (int x = 0; x <= 10; x++){
            resul = resul + "\n" + n1 + " * " + x + " = " + (n1*x);
        }
        JOptionPane.showMessageDialog(null, resul);
    }
    public static void Dividir(){
        int resto = 0;
        int cociente = 0;
        
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dividendo"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el divisor de la decision"));
        
        resto = dividendo % divisor;
        cociente = dividendo / divisor;
        
        JOptionPane.showMessageDialog(null, dividendo + " / " + divisor + " = " + cociente + "\n" + "Resto = " + resto);
    }
    public static void Exit(){
        System.exit(0);
    }
}
