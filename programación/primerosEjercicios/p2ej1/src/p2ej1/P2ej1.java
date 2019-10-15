/*
1. Introducir por teclado el numero de horas trabajadas por un empleado ´
e imprimir el sueldo que le corresponde cobrar teniendo en cuenta que
cada 
hora normal se paga a 10 euros y cada hora extra a 15.
Las horas extras son aquellas superiores a las cuarenta.

En algunos casos, a la nomina calculada hay que sumarle un plus de ´
100 euros segun el estado civil y el nivel de estudios del empleado. ´
Esta ultima informaci ´ on tambi ´ en la obtendremos a trav ´ es del teclado. ´

El estado civil puede ser S de soltero, C de casado, V de viudo y D de
divorciado (S C V D ).

El nivel de estudios puede ser P de primario, M de medo y S de
superior (P M S).

Llevan el plus de 100 euros las siguientes combinaciones: SP VS SM
CS VP SS DS.
 */
package p2ej1;

import javax.swing.JOptionPane;

public class P2ej1 {

    public static void main(String[] args) {
        
        int h = 0;
        String estadoCivil = "";
        String estudios = "";
        JOptionPane.showMessageDialog(null, "Bien Venid@ al programa calcula sueldo");
        
        double money = IntroducirDatos(h, estadoCivil, estudios);
        
        JOptionPane.showMessageDialog(null, "Su sueldo es de : " + money);

    }
    public static double IntroducirDatos(int h, String estadoCivil, String estudios){
        do{
            h = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas"));
            
            if(h<0){
                JOptionPane.showMessageDialog(null,"No puedes haber trabajado negativamente!");
            }
        }while(h < 0);
        
        do{
            estadoCivil = JOptionPane.showInputDialog("Introduzca su estado civil"
                                                        + "\n S = Soltero"
                                                        + "\n C = Casado"
                                                        + "\n D = Divorciado"
                                                        + "\n v = Viudo"
                                                    );
        estadoCivil = estadoCivil.toUpperCase();
            
        if(!"S".equals(estadoCivil)&&!"C".equals(estadoCivil)&&!"D".equals(estadoCivil)&&!"V".equals(estadoCivil)){
            
            JOptionPane.showMessageDialog(null, "Por favor introduzca un valor de los solicitados");
        }
            
        }while(!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("D") && !estadoCivil.equals("V"));
        
                do{
            estudios = JOptionPane.showInputDialog("Introduzca su grado de estudiante"
                                                        + "\n P = Primario"
                                                        + "\n M = Medio"
                                                        + "\n S = Superior"
                                                    );
        estudios = estudios.toUpperCase();
            
        if(!"P".equals(estudios) && !"M".equals(estudios) && !"S".equals(estudios)){
            
            JOptionPane.showMessageDialog(null, "Por favor introduzca un valor de los solicitados");
        }
            
        }while(!estudios.equals("P") && !estudios.equals("M") && !estudios.equals("S"));
        
        double money = CalcularExtra(h, estadoCivil, estudios);
        
        return money;
    }
    public static double CalcularExtra(int h, String estadoCivil, String estudios){
        double money = 0;
        
        String combi = estadoCivil + estudios;
        
        if(h > 40){
            h = h-40;
            money = (40*10) + (h*15);
        }
        
        if (combi.equals("SP") || combi.equals("VS") || combi.equals("SM") || combi.equals("CS") 
            || combi.equals("VP") || combi.equals("SS") || combi.equals("DS")){
            
            money = money + 100;
            
        }
    
    return money;
    }
}
