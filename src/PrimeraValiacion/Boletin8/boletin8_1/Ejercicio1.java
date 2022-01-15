
package PrimeraValiacion.Boletin8.boletin8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    public void clasificarProductos(){
        String nombreP=leerNombre();
        float ventasA=leerVentasA();
        if (ventasA<=100)
            System.out.println(nombreP+" es un producto de bajo consumo");
        else 
            if(ventasA<=500)
                System.out.println(nombreP+" es un producto de consumo medio");
        else
                if(ventasA<=1000)
                    System.out.println(nombreP+" es un producto de alto consumo");
        else
                    System.out.println(nombreP+" es un producto de primera necesidad");
    }
    public float leerVentasA(){
        float ventasA=Float.parseFloat(JOptionPane.showInputDialog("Introduzca las ventas anuales del producto"));
        return ventasA;
    }
    public String leerNombre(){
        String nombre=JOptionPane.showInputDialog("Introduzca el nombre del producto");
        return nombre;
    }
    
}
