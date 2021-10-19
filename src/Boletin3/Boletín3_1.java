
package boletín3_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín3_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserte el precio de tarifa");
        double preciotarifa=sc.nextDouble();
        System.out.println("Inserte el precio pagado");
        double preciopagado=sc.nextDouble();
        double pagado=preciopagado*100/preciotarifa;
        double porcentajedescontado=100-pagado;
        System.out.println("El porcentaje descontado de la compra es "+porcentajedescontado+"%");
        
       
    }
    
}
