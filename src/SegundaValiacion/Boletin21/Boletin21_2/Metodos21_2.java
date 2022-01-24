
package SegundaValiacion.Boletin21.Boletin21_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos21_2 {
    public static int[] crearArrayInt(int[]lista){
        for(int i = 0; i<lista.length;i++){
            lista[i]=Integer.parseInt(JOptionPane.showInputDialog("Teclea nota"));
        }
        return lista;
    }
    public static void comprobarAprobados(int[]lista){
        int j=0;
        int k=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>=5)
                j++;
            else
                k++;
        }
        System.out.println("Hay "+j+" aprobados y "+k+" suspensos");
    }
    public static void notaMedia(int[]lista){
        int j=0;
        for(int i=0;i<lista.length;i++){
            j+=lista[i];
        }
        System.out.println("La nota media es: "+j/lista.length);
    }
    public static void notaAlta(int[]lista){
        Arrays.sort(lista);
        System.out.println("La nota más alta es: "+lista[lista.length-1]);
    }
        
}
