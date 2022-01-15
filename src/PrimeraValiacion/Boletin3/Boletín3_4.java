
package PrimeraValiacion.Boletin3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín3_4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero");
        int cantidad=sc.nextInt();
        int cien=cantidad/100;
        int cantidada=cantidad%100;
        int veinte=cantidada/20;
        int cantidadb=cantidada%20;
        int cinco=cantidadb/5;
        int cantidadc=cantidadb%5;
        int moneda=cantidadc;
        System.out.println("El total de billetes de cien es: "+cien+"\nEl total de billetes de veinte es: "+veinte+"\nEl total de billetes de cinco es: "+cinco+"\nEl total de monedas es: "+moneda);
    
    }
    
}
