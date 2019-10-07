/*
Disena un programa que reciba a través del teclado 
el peso, 
edad, ´
nombre, 
sexo 
y estatura de un grupo de 30 alumnos y, posteriormente,
muestre el numero de niños y de niñas que son aptos para jugar al baloncesto.
Los requisitos para poder jugar al baloncesto son los siguientes: 

Los niños deben tener una estatura mayor de 1.70 metros y pesar más de ´
70 kilos . 

Las ninas deben medir m ˜ as de 1.60 metros y pesar m ´ as de ´
60 kilos.
 */
package ej13;

import javax.swing.JOptionPane;

public class Ej13 {

    public static void main(String[] args) {
        
        String nombre;
        char sexo = 'M';
        int edad;
        double peso = 0;
        double altura = 0;
        int hValidos = 0;
        int mValidas = 0;
        
        
        for (int x = 0; x<30;x++){
            
            nombre = JOptionPane.showInputDialog("Introduce el nombre del / la alumn@");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad de el/la alumn@ "));
            
            sexo = PedirSexo(sexo);
            altura = PedirAltura(altura);
            peso = PedirPeso(peso);
            
            if(sexo == 'M'){
                if (altura > 1.60){
                    if(peso > 60){
                        hValidos = hValidos ++;
                    }
                }
            }
            
            if(sexo == 'H'){
                if (altura > 1.70){
                    if(peso > 70){
                        mValidas = mValidas ++;
                    }
                }
            }
            
        }
        JOptionPane.showMessageDialog(null, "Los niños validos para jugar a baloncesto son: " + hValidos
                                        +"\n Las niñas validas para jugar a baloncesto son: " + mValidas);
    }
    public static char PedirSexo(char sexo){
        do{
            sexo = JOptionPane.showInputDialog("Introduzca el sexo del/la alumn@ (M=mujer|H=hombre)").toUpperCase().charAt(0);
            
            if (sexo != 'M' || sexo != 'H'){
                JOptionPane.showMessageDialog(null, "Por favor introduzca los valores H o M");
            }

        } while((sexo != 'M') || (sexo != 'H'));
        
        return sexo;
    }
    public static double PedirAltura(double altura){
        
        do{
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura del/la alumn@"));
            
            if (altura < 0 || altura > 3){
                JOptionPane.showMessageDialog(null, "Por favor introduzca una altura aceptada");
            }
        }while(altura < 0 || altura > 3);
        
        return altura;
    }
    
    public static double PedirPeso(double peso){
        do {
            peso = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso del/la alumn@"));
            
            if (peso < 0 ||peso > 350){
                JOptionPane.showMessageDialog(null, "El peso introducido no es valido");
            }
        }while(peso < 0 || peso > 350);
        return peso;
    }
    
}
