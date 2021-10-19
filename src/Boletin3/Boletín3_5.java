
package boletin3_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su sueldo fijo: ");
        float sueldof=sc.nextFloat();
        System.out.println("Ingrese el total de sus ventas: ");
        float ventas=sc.nextFloat();
        System.out.println("Ingrese el kilometraje recorrido: ");
        float kilometraje=sc.nextFloat();
        System.out.println("Ingrese el total de días desplazados: ");
        float desplazado=sc.nextFloat();
        float salariob= ventas*5/100+kilometraje*2+desplazado*30+sueldof;
        float RETENCION=36;
        float salariol= salariob-(salariob*18/100)-RETENCION;
        System.out.println("Su salario bruto total es de: "+salariob+ "\nSu salario líquido total es de: "+salariol);
     
    }
    
}
