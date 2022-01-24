
package SegundaValiacion.Boletin21.Boletin21_2;

/**
 *
 * @author dam1
 */
public class Boletin21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]notas=new int[30];
        notas=Metodos21_2.crearArrayInt(notas);
        Metodos21_2.comprobarAprobados(notas);
        Metodos21_2.notaMedia(notas);
        Metodos21_2.notaAlta(notas);
    }
    
}
