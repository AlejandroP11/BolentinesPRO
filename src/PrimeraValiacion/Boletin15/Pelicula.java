
package PrimeraValiacion.Boletin15;

/**
 *
 * @author dam1
 */
public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;
    public Pelicula() {
    }
    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }
    public String getActorPrincipal() {
        return actorPrincipal;
    }
    public String getActrizPrincipal() {
        return actrizPrincipal;
    }
    @Override
    public String toString() {
        return super.toString()+" actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal ;
    }        
}
