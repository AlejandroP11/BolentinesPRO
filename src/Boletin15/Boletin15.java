
package Boletin15;

/**
 *
 * @author dam1
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula unaPelicula=new Pelicula("Morgan Freeman", "Scarlett Johansson", "Lucy", "Luc Bensson", "35mm", 90);
        System.out.println(unaPelicula.getActorPrincipal());
        System.out.println(unaPelicula);
        Disco unDisco=new Disco("Rock and roll", "Tattoo you", "The Rolling Stones", "MP3", 44);
        System.out.println(unDisco.getGenero());
        System.out.println(unDisco);
    }
    
}
