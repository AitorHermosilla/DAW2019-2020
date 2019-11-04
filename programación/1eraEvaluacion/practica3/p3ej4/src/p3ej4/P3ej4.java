/*
 */
package p3ej4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 */
public class P3ej4 {

    /**
     */
    public static void main(String[] args) {
        
        switch(Integer.parseInt(JOptionPane.showInputDialog(null,"\"Bien venid@ al programa de calcular fechas\"\n" +
                                                            "+ \"\\n 1-Clase Date\"\n" +
                                                            "+ \"\\n 2-Clase Calendar\"\n" +
                                                            "+ \"\\n 3-Clase LocalDate\""))){
            case 1:ClaseDate();
                break;
            case 2:ClaseCalendar();
                break;
            case 3:ClaseLocalDate();
                break;
        }
          
    }
    public static void ClaseDate(){
        
        boolean error = false;
        
        Date fechaUno = new Date(); 
        Date fechaDos = new Date();
        
        String f1 = JOptionPane.showInputDialog("teclea una fecha con el siguiente formato: dd-MM-yyyy");
        String f2 = JOptionPane.showInputDialog("Introduzca la segunda fecha");
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        
        do{
            try{
                fechaUno = formatter.parse(f1);
                fechaDos = formatter.parse(f2);
            }catch(Exception e){
                error = true;
            }
        }while(error);
        
        JOptionPane.showMessageDialog(null, fechaUno.getTime() - fechaDos.getTime());
    }
    public static void ClaseCalendar(){
        
        try{
            String fechaUno = JOptionPane.showInputDialog("Introduzca la fecha uno con el siguiente formato: dd/MM/aa");
            String fechaDos = JOptionPane.showInputDialog("Introduzca la segunda fecha con el mismo formato: dd/MM/aa");
        
            Calendar cal = Calendar.getInstance();
        
            Calendar calDos = Calendar.getInstance();
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        
            cal.setTime(formato.parse(fechaUno));
        
            cal.setTime(formato.parse(fechaDos));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
    
}
