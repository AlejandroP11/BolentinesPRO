
package boletín3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletín3_2 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese ºC");
        int gradosc=sc.nextInt();
        int gradosk=gradosc+273;
        double gradosf=gradosc*1.8+32;
        System.out.println(gradosc+" ºC son "+gradosk+" ºK y "+gradosf+" ºF");
    
    }
    
}
