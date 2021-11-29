
package Boletin14;

/**
 *
 * @author dam1
 */
public class Libro extends Publicacion {
    private boolean prestado;
    public Libro() {
    }
    public Libro(int codigo, String titulo, int año) {
        super(codigo, titulo, año);
    }
    @Override
    public String toString() {
        return super.toString()+", prestado=" + prestado;
    }
}
