
package PrimeraValiacion.Boletin9.Boletin9_2;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {
    public void calcularProdSum(){
            int s=0;
            double p=1;
            for(int i=10;i<91;i++){
                s+=i;
                p*=i;
            }
            System.out.println("La suma es: "+s+" el producto es: "+p);
    }
    
}
