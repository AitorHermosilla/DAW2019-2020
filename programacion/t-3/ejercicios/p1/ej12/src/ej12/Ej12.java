/*
12.  En una empresa de telefonıa se sigue la siguiente polıtica de facturacion:

Si el consumo mensual no sobrepasa los 300 minutos, se cobra 0.04
por minuto.

Si pasa de los 300 minutos pero no de los 500 se cobra 0.03 por cada
minuto.

Si pasa de los 500 minutos, se cobran los primeros 300 minutos a precio
normal (0.03) y los restantes a 0.02.

Si el consumo mensual, es superior a 800 minutos, se aplica la regla de
asignacion anterior y ademas que se le realiza un descuento de 1.25 % del total.

A partir de lo explicado disena un algoritmo que a partir de los mi-
nutos consumidos muestre el importe a pagar
 */
package ej12;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Ej12 {

    public static void main(String[] args) {
        
        double consumo = 0;
        double dinero = 0;
        
        consumo = ValidarConsumo(consumo);
        
        dinero = MedirConsumo(consumo, dinero);
        
        JOptionPane.showMessageDialog(null, "La factura asciende a " + dinero + "$");
    }
    public static double ValidarConsumo(double consumo){
        
        do{
            consumo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el consumo"));
            
            if (consumo <= 0){
                JOptionPane.showMessageDialog(null, "El consumo tiene que ser positivo");
            }
        }while (consumo <= 0);
            
        
        return consumo;
    }
    public static double MedirConsumo (double consumo, double dinero){
        
        if (consumo <= 300){
            dinero = consumo * 0.4;
        }else if (consumo <= 500){
            dinero = consumo * 0.3;
        }else if (consumo <= 800){
            consumo = consumo - 300;
            dinero = (300*0.3) + (consumo * 0.2);
        }else{
            consumo = consumo - 300;
            dinero = 0.875 * ((300*0.3) + (consumo * 0.2));
        }        
        return dinero;
    }
}
