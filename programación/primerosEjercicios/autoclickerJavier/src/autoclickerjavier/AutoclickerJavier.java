/*
hola javi este es tu autoclicker xd
 */
package autoclickerjavier;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class AutoclickerJavier {
    
    private static Robot robot = null;

    public static void main(String[] args) {
        
        try{
            robot = new Robot();
        }
        catch (AWTException e){
            e.printStackTrace();
       }
        
        //Menu
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Viene venido al erAutoclicker"
                + "\n 1-Iniciar erAutoclicker"
                + "\n 2-¡Dame un abrazo maquina!"
                + "\n 3-Salir"));
        
        switch (opcion){
            case 1: Iniciar();
                    break;
            case 2: Abrazo();
                    break;
            case 3: Exit();
                    break;
        }
    }
    public static void Iniciar(){
        
        int limit = 50;
            
        try{
            limit = Integer.parseInt(JOptionPane.showInputDialog("Señor Francisco Javier Mateos, por favor seleccióne las repeticiónes a realizar"));
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Señor Javi, le he pedido un valor NUMERICO");
            }
            catch(Exception e){
                JOptionPane.showInternalMessageDialog(null, "Error, looos cabrones me han pillado");
            }
        
        
        while (limit>0){
            try {
                Double t = CalcularTiempo();
                
                int tiempo = t.intValue() * 60000;
                JOptionPane.showMessageDialog(null, tiempo/60000);
                Thread.sleep(tiempo);
               
            } 
            catch (Exception e) {
               System.out.println(e);
            }
               robot.mousePress(MouseEvent.BUTTON1_MASK);
               robot.mouseRelease(MouseEvent.BUTTON1_MASK);
               limit = limit++;
           }
    }
    
    public static double CalcularTiempo(){
        
        double t = 0;
        
        do{
            t = Math.random()*100;
        }while(t > 10 || t<5);
        
        return t;
    }
    
    public static void Abrazo(){
        JOptionPane.showMessageDialog(null, "Lo siento señor, es usted un poco pervertido, las maquinas no tenemos vuestros simples agujeros sexuales, somos penetrados constatnemete por bits mas largos que tu pene");
    }
    
    public static void Exit(){
        System.exit(0);
    }
    
}
