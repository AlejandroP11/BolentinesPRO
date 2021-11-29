
package Boletin14;

/**
 *
 * @author dam1
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro lib=new Libro(123,"Cien años de soledad",1967);
        System.out.println(lib);
        System.out.println(lib.getAño());
        Revista rev=new Revista(65, 124, "Limpia tu casa", 2001);
        System.out.println(rev);
        System.out.println(rev.getCodigo());
    }
    
}
