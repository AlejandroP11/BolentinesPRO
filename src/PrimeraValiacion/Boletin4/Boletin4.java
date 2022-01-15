
package PrimeraValiacion.Boletin4;

/**
 *
 * @author dam1
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro objLi1 = new Libro("aaa","aa",2021,(short)450);
        objLi1.amosar();
        Libro unlibro = new Libro();
        unlibro.setautor("J.K. Rowling");
        unlibro.settitulo("Harry Potter y la Piedra Filosofal");
        unlibro.setaño(1997);
        unlibro.setvaloracion(9.2f);
        unlibro.setPaginas((short) 233);
        unlibro.amosar();
    }
    
}
