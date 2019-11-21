
package t3ej9;

import javax.swing.JOptionPane;

public class T3ej9 {
    
    private static int normal = 21;
    private static int reducido = 10;
    private static int superReducido = 4;


    public static void main(String[] args) {
        
        String factura = "";
        IntroducirDatos(factura);
        
        JOptionPane.showMessageDialog(null, factura);
    }
    public static void IntroducirDatos(String factura){
        int continuar = 0;
        int totalSinIva = 0;
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre");
        String facturaIva = "";
        factura = factura + "Nombre:" + nombre;
        
        factura = factura + "\n LINEAS DE DETALLE:";
        do{
            
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del producto"));
            
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio del producto"));
            
            facturaIva = ParteDelIva(cantidad, precio);
            
            factura = factura + "\n" + cantidad + " X " + precio + " = " + (precio * cantidad); 
            
            totalSinIva = totalSinIva + (cantidad * precio);
            
            continuar = JOptionPane.showConfirmDialog(null, "¿Quiere continuar comprando?");
        }while(continuar == 0);
        
        factura = factura + "\n TOTAL SIN IVA: " + totalSinIva;
    }
    public static String ParteDelIva(int cantidad, int precio){

        int iva = 0;
        String facturaIva = "";
        
        switch(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción del iva correspondiente: "
                    + "\n 1-Normal"
                    + "\n 2-Reducido"
                    + "\n 3-Super Reducido"))){
                case 1: 
                    iva = normal;
                break;
                
                case 2:
                    iva = reducido;
                break;
                
                case 3:
                    iva = superReducido;
                break;
            }
        
        facturaIva = facturaIva + iva + "% de " + (precio*cantidad);
        
        return facturaIva;
    }
}
