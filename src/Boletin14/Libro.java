
package Boletin14;

/**
 *
 * @author dam1
 */
public class Libro extends Publicacion {
    private String prestado;
    public Libro() {
    }
    public Libro(int codigo, String titulo, int año) {
        super(codigo, titulo, año);
    }
    public String getPrestado() {
        return prestado;
    }
    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }   
    @Override
    public String toString() {
        return super.toString()+", prestado=" + prestado;
    }
}
