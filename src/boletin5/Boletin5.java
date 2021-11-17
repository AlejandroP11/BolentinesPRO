package boletin5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumo objCon1=new Consumo();
        objCon1.setLitros(50);
        objCon1.setPGas(1.57f);
        Consumo objCon2=new Consumo(1, 2, 3, 4);
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilometros recorridos");
        float km=sc.nextFloat();
        objCon2.setKms(km);
        System.out.println("Ingrese la cantidad de litros consumidos");
        float l=sc.nextFloat();
        objCon2.setLitros(l);
        System.out.println("Ingrese la velocidad media");
        float vm=sc.nextFloat();
        objCon2.setVMed(vm);
        System.out.println("Ingrese el precio de la gasolina");
        float pg=sc.nextFloat();
        objCon2.setPGas(pg);
        System.out.println(objCon2.consumoMedio());
   
        
    }
    
}
