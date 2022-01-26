
package SegundaValiacion.Boletin21.Boletin21_3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos21_3 {
    public static String[] crearArrayString(String[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=JOptionPane.showInputDialog("Introduce el nombre del alumno");
        }
        return lista;
    }
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
    public static void visualizarAprobados(String[]lista, int[]listai){
        for(int i=0;i<listai.length;i++){
            if(listai[i]>=5)
                System.out.println(lista[i]+" está aprobad@");
        }
    }
    public static void ordenarAlumnos(String[]lista, int[]listai){
        int aux=0;
        String aux1=null;
        for(int i=0; i<listai.length-1; i++){
            for(int j=i+1; j<listai.length; j++){
                if(listai[i]>listai[j]){
                    aux=listai[i];
                    aux1=lista[i];
                    listai[i]=listai[j];
                    lista[i]=lista[j];
                    listai[j]=aux;
                    lista[j]=aux1;
                }
            }
        }
        for(int i=0; i<listai.length;i++){
            System.out.println(lista[i]+" sacó un "+listai[i]);
        }
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
