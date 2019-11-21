/*
20. Crea un minijuego en el que el ordenador elija un numero aleatorio ´
comprendido entre 0 y 100 para que el usuario intente adivinarlo.
(numero = aleatorio(0,100))
Cada vez que el usuario haga un intento le daremos pistas de si el
numero que busca es m ´ as alto o m ´ as bajo que el que ha escrito, hasta ´
que acierte o escriba la palabra FIN para terminar el juego.
 */
package ej20;

import javax.swing.JOptionPane;

public class Ej20 {

    public static void main(String[] args) {
        int continuar = 0;
        
        do {
            int random = GenerarNumero();
            
            Jugar(random);
            
            continuar = JOptionPane.showConfirmDialog(null,"¿Otra Partidita ?");
        }while (continuar == 0);
        
    }
    public static int GenerarNumero(){
        Double random = Math.random()*101;
        int ran = random.intValue();
        
        JOptionPane.showMessageDialog(null, "Generando numero...");
        
    return ran;
    }
    public static void Jugar(int random){
        boolean acierto = true;
        do{
            int n = Integer.parseInt(JOptionPane.showInputDialog("Empecemos la partida! dame un numero del 1 al 100"));

            if (n == random){
                JOptionPane.showMessageDialog(null, "FELICIDADES! ¡has acertado!");
                acierto = true;
            }else{
                acierto = false;
                if(n>random){
                    JOptionPane.showMessageDialog(null, "El numero generado es mas pequeño!");
                }else{
                    JOptionPane.showMessageDialog(null, "El numero generado es más grande!");
                }
            }
        }while (!acierto);    
    }
}
