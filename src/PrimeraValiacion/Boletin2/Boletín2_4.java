
package PrimeraValiacion.Boletin2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín2_4 {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("indica el primer número");
        float numuno=sc.nextFloat();
        System.out.println("indica el segundo número");
        float numdos=sc.nextFloat();
        float suma=numuno+numdos;
        System.out.println("la suma de "+numuno+"+"+numdos+" es "+suma);
        float resta=numuno-numdos;
        float restauno=numdos-numuno;
        System.out.println("la resta puede ser "+resta+" o "+restauno);
        float producto=numuno*numdos;
        System.out.println("el producto es "+producto);
        float cociente=numuno/numdos;
        float cocien=numdos/numuno;
        System.out.println("el cociente puede ser "+cociente+" o "+cocien);
        
       
    }
    
}
