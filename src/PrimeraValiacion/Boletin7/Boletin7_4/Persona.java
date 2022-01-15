
package PrimeraValiacion.Boletin7.Boletin7_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Persona{
    Scanner sc;
    public void comparar(){
        String nombreA=leerNombre();
        float pesoA=leerPeso();
        String nombreB=leerNombre();
        float pesoB=leerPeso();
        
        if(pesoA>pesoB)
            System.out.println(nombreA+" es la persona más pesada con "+pesoA+"kilos y la diferencia de peso es de "+(pesoA-pesoB)+" kilos.");
        else 
            System.out.println(nombreB+" es la persona más pesada con "+pesoB+"kilos y la diferencia de peso es de "+(pesoB-pesoA)+" kilos.");
    }
    public float leerPeso(){
        sc=new Scanner(System.in);
        System.out.println("Introduzca su peso");
        float peso=sc.nextFloat();
        return peso;
    }
    public String leerNombre(){
        sc=new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre=sc.next();
        return nombre;
    }
}
