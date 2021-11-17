
package Boletin2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín2_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("euros a cambiar =");
        float euro=sc.nextFloat();
        System.out.println("valor del cambio =");
        float cambio=sc.nextFloat();
        float dolar=euro*cambio;
        System.out.println("por "+euro+"euros, recibiras "+dolar+" dolares");
        
               
        
             
    }
    
}
