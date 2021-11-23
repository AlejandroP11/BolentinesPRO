
package BoletinE.BoletinE1.BoletínE1_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletínE_2 {

    public static void main(String[] args) {
        System.out.println("Programación");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca primera nota");
        double notauno=sc.nextDouble();
        System.out.println("Introduzca segunda nota");
        double notados=sc.nextDouble();
        double not=notauno*50/100;
        double notu=notados*50/100;
        double notafinal=not+notu;
        System.out.println("La nota final de la materia es: "+notafinal);
        
    }
    
}
