
package PrimeraValiacion.Boletin15;

/**
 *
 * @author dam1
 */
public class Disco extends Multimedia {
    public String genero;
    public Disco() {
    }
    public Disco(String genero, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    @Override
    public String toString() {
        return super.toString()+ " genero=" + genero ;
    }       
}
