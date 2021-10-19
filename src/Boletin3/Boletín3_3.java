
package boletín3_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín3_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de billetes de cien");
        int billetescien=sc.nextInt();
        System.out.println("Ingresa la cantidad de billetes de veinte");
        int billetesveinte=sc.nextInt();
        System.out.println("Ingresa la cantidad de billetes de cinco");
        int billetescinco=sc.nextInt();
        System.out.println("Ingresa la cantidad de monedas de uno");
        int monedas=sc.nextInt();
        int buno=billetescien*100;
        int bdos=billetesveinte*20;
        int btres=billetescinco*5;
        int equivalente=buno+bdos+btres+monedas;
        System.out.println("El total en euros es de "+equivalente);
        

    }
    
}
