
package boletin6;

import java.util.Scanner;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin6 {

    public static void main(String[] args) {
       //Coche coche1 = new Coche();
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingrese la aceleración del coche: ");
        int a= sc.nextInt();
        coche1.acelerar(a);
        System.out.println("La velocidad del coche es: "+coche1.getVelocidade());
        System.out.println("Ingrese la frenada del coche: ");
        int f=sc.nextInt();
        coche1.frenar(f);
        System.out.println("La velocidad del coche es: "+coche1.getVelocidade());
        Satelite satelite1=new Satelite();
        satelite1.verPosicion();
        System.out.println("Ingrese el paralelo del satelite");
        double p= sc.nextDouble();
        System.out.println("Ingrese el merdiano del satelite");
        double m=sc.nextDouble();
        System.out.println("Ingrese la distancia con la tierra del satelite");
        double d=sc.nextDouble();
        Satelite satelite2=new Satelite(p,m,d);
        satelite2.verPosicion();*/
        Circulo cir1=new Circulo();
        cir1.setRadio(5);
        System.out.println("El radio del triángulo es: "+cir1.getRadio()+ "\nEl área del círculo es: "+cir1.calcularArea()+"\nLa longitud del círculo es: "+cir1.calcularLonxitude());
        System.out.println("Ingrese el radio del círculo: ");
        double ra=sc.nextDouble();
        Circulo cir2=new Circulo(ra);
        System.out.println("El radio del triángulo es: "+cir2.getRadio()+ "\nEl área del círculo es: "+cir2.calcularArea()+"\nLa longitud del círculo es: "+cir2.calcularLonxitude());
    }
    
}
