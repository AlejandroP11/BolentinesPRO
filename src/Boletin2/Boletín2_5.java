
package Boletin2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín2_5 {

    public static void main(String[] args) {
        final int METRO=1852;
        Scanner sc=new Scanner(System.in);
        System.out.println("indica la distancia en millas marinas");
        double milla=sc.nextDouble();
        double metros=milla*METRO;
        System.out.println(milla+" estas millas equivalen a "+metros+" metros");
        
    }
   
    
}
