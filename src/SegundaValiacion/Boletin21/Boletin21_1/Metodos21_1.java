
package SegundaValiacion.Boletin21.Boletin21_1;

/**
 *
 * @author dam1
 */
public class Metodos21_1 {
    public static int[] crearArraysAleatoria(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*51);
        }
        return lista;
    }
    public static void amosarArrayAlReves(int[]lista){
         for(int i=lista.length-1;i>=0;i--){
            System.out.println("Posición: "+i+" = "+lista[i]);
        }
    }
}

