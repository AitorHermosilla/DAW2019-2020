/*
ENUNCIADO:
DISEÑA UN PROGRAMA QUE CUMPLA LAS SIGUIENTES FUNCIONES:
    1-VALIDAR UN DNI (9 digitos y una letra)
    2-INTRODUCIR UNA FECHA Y MOSTRAR EN DIAS MESES Y AÑOS LA DIFERENCIA CON LA FECHA ACTUAL
    3-INTRODUCIR UNA HORA Y DECIR SI ES ANTES O DESPUES DE LA HORA ACTUAL
    4-INTRODUCIR UNA FRASE Y DEVOLVERLA VOLTEADA (HOLA = ALOH)
    5-INTRODUCIR NOTAS HASTA QUE EL USUARIO QUIERA Y CALCULAR SU MEDIA

TODO CON LAS CORRESPONDIENTES EXCEPCIONES.
 */
package miejercicio;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class MiEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        PRIMERO HARÉ UN MENÚ CON LAS OPCIONES DE EL EJERCICIO
        ADEMAS, CADA OPCION DEL SWITCH NOS LLEVARA A UNA FUNCION DISTINTA
        DONDE TRATAREMOS EL PROBLEMA EN CUESTION
        */
        
        /*
        TRY CATCH PARA ASEGURAR QUE SE SELECCIONA UN NUMERO DEL 1 - 6
        TODO DENTRO DE UNA REPETITIVA DO-WHILE PARA PODER VOLVER A INTRODUCIR LOS DATOS
        SI FALLAMOS
        */
        
        boolean error = false; //booleana para salir de la repetitiva
        /*
        CUIDADO, si hacemos un while en vez de do-while si la iniciamos en false
        nunca entrará en la repetitiva
        */
        
        do{
            try{

                /*
                yo he dividido el menú en 2, parte grafica y el switch como tal
                */
                
            int opcion = MenuGR();//parte grafica (JOptionPane.ShowMessageDialog)

            MenuSW(opcion);//switch
            
            error = false;

            }catch(NumberFormatException e){//Siempre que exista un parse
                JOptionPane.showMessageDialog(null, "Has tenido un error en la transformación de datos");
                error = true;
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error desconocido");
            error = true;
            }//catch generico
        }while(error);//esto es lo mismo que error == true
        
        
    }
    public static int MenuGR(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opcion  deseada"
                + "\n1-Validador DNI"
                + "\n2-Calculadora de fechas"
                + "\n3-Cuanto tiempo falta"
                + "\n4-Voltear frase"
                + "\n5-Calcular notas"));
        return opcion;
    }
    public static void MenuSW(int opcion){
        switch(opcion){
            case 1: ValidarDni();
            break;
            case 2: Fechas();
            break;
            case 3: Tiempo();
            break;
            case 4: VoltearFrase();
            break;
            case 5: CalcularNotas();
            break;
        }
    }
    public static void ValidarDni(){
        
        /*
        PARA VALIDAR EL DNI PRIMERO INTRODUCIMOS LOS DATOS Y LOS TRATAMOS
        LA PARTE ENCARGADA DE VALIDAR QUE TENGA 9 CIFRAS Y 8 NUMERO Y UNA LETRA
        LA HAREMOS CON UNA EXCEPCION PERSONALIZADA DniNoValido
        */
        try{
            String dni = JOptionPane.showInputDialog("Introduzca el numero del dni");//Introduce el dni
            
            /*
                LA CONDICION ES LA SIGUIENTE CON .LENGTH SABREMOS SU LONGITUD
                PARA ASEGURAR QUE SON 9 CARACTERES
                
                &&
            
                LA SEGUNDA PARTE ES PARA SABER SI EL CARACTER 9 ES UNA LETRA
                CON CHARACTER.ISLETTER CONSEGIMOS SABER SI ES LETRA Y DE PARAMETRO
                LE METEMOS EL CARACTER 9 DE EL STRING DE DNI
            */
            //Lo divido en dos if por que si no me daria una excepcion por que no hay caracter Nº9
            
            if(dni.length()!=9){//CUANDO PASE ESTO
                throw new DniNoValido();//SE LANZA ESTO
            }else if(Character.isLetter(dni.charAt(9))){//CUANDO PASE ESTO
                throw new DniNoValido();//SE LANZA ESTA EXCEPCIÓN
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Has tenido un error en la transformación de datos");
        }catch(DniNoValido e){
            JOptionPane.showMessageDialog(null, "El dni que has introducido es ilegal");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error desconocido");
        }
        }
    public static void Fechas(){
        try{
            /*Introducimos la primera fecha y creamos el formato*/
            String fechaUno = JOptionPane.showInputDialog("Introduzca la fecha con el siguiente formato: dd/MM/yyyy");            
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            /*Formateamos la primera fecha y la segunda la pillamos del sistema */
            
            LocalDate fecha1 = LocalDate.parse(fechaUno, formato);
            LocalDate fecha2 = LocalDate.now();
            
            /*hacemos el calculo con duration*/
            
            Duration duration = Duration.between(fecha1, fecha2);
            JOptionPane.showMessageDialog(null, duration);//La mostramos
            
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Error con la transformación de fecha");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error\n" + e);
        }
    }
    
    public static void Tiempo(){
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los minutos"));
        LocalTime hora1 = LocalTime.of(horas, minutos);
        
        LocalTime hora2 = LocalTime.now();
        
        if(hora1.isBefore(hora2)){
            JOptionPane.showMessageDialog(null, "La hora introdcido es antes que la actual");
        }else{
            JOptionPane.showMessageDialog(null, "La hora introdcido es despues que la actual");
        }
        
        
        
        
    }
        
    public static void VoltearFrase(){
        String frase = JOptionPane.showInputDialog("Introduzca la frase a voltear");
        String fraseV = "";
        int y = frase.length()-1;
        for(int x = 0; x<frase.length();x++ ){
            fraseV = fraseV + frase.charAt(y);
            y = y-1;
        }
        JOptionPane.showMessageDialog(null, fraseV);
    }
            
    public static void CalcularNotas(){
        int continuar = 0;
        int media = 0;
        int cont = 0 ;
        do{
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            media = media + nota;
            cont ++;
            continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar?");
        }while(continuar != 1);
        
        JOptionPane.showMessageDialog(null, "La media es: " + (media/cont));
    }
    
    
}
