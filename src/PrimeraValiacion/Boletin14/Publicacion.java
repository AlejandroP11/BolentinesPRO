
package PrimeraValiacion.Boletin14;

/**
 *
 * @author dam1
 */
public class Publicacion {
    private int codigo;
    private String titulo;
    private int año;
    public Publicacion() {
    }
    public Publicacion(int codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }
    public int getCodigo() {
        return codigo;
    }
    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", titulo=" + titulo + ", año=" + año ;
    }
    
    
}
