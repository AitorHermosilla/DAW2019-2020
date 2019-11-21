/*
2. En un cursillo de programacion se estudian cuatro lenguajes: 
Visual.Net, Cobol, Java y SQL. 

La nota final del curso depende de una
practica que se realiza en los cuatro lenguajes.

La nota en cada una de las practicas es apto ono apto y la nota del curso
puede ser un sobresaliente, notable, bien, suficiente o insuficiente.

Para calcular la nota del curso hay que seguir las siguientes instrucciones:
    Apto en los cuatro lenguajes Sobresaliente
    Apto en SQL, Cobol y uno de los otros dos Notable
    Apto en Cobol y SQL Bien
    Apto en SQL y uno entre Java y Visual.Net Suficiente
    Apto en Cobol y uno entre Java y Visual.Net Suficiente

Resto de los casos Insuficiente.
Desarrolla un programa que permita visualizar la nota de los alumnos
recibiendo por teclado el apto o no apto en cada uno de los lenguajes
 */
package p2ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class P2ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char v;
        char c;
        char j;
        char s;
        
            v = JOptionPane.showInputDialog(null,"Visual.Net Introduzca: "
                                            + "\n A para Apto"
                                            + "\n S para Suspendido").toUpperCase().charAt(0);

            c = JOptionPane.showInputDialog(null,"Cobol Introduzca: "
                                            + "\n A para Apto"
                                            + "\n S para Suspendido").toUpperCase().charAt(0);

            j = JOptionPane.showInputDialog(null,"Java Introduzca: "
                                            + "\n A para Apto"
                                            + "\n S para Suspendido").toUpperCase().charAt(0);

            s = JOptionPane.showInputDialog(null,"SQL Introduzca: "
                                            + "\n A para Apto"
                                            + "\n S para Suspendido").toUpperCase().charAt(0);
        
        String evaluado = AptoNoApto(v,c,j,s);
        
        JOptionPane.showMessageDialog(null,evaluado);
        
        
    }
    public static String AptoNoApto (char v, char c, char j, char s){
        String evaluado = "";
        
        if("A".equals(s) && "A".equals(c) && "A".equals(j) && "A".equals(v)){
            evaluado = "Sobresaliente";
        } else if ("A".equals(s) && "A".equals(c) && ("A".equals(j) || "A".equals(v))){
            evaluado = "Notable";
        } else if ("A".equals(c) && "A".equals(s)){
            evaluado = "Bien";
        } else if ("A".equals(s) && ("A".equals(j)||"A".equals(v))){
            evaluado = "Notable";
        } else if ("A".equals(c) && "A".equals(j) && "A".equals(v)){
            
        }else {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return evaluado;
    }
    
}