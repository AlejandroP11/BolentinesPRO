
package boletin4;

/**
 *
 * @author dam1
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro unlibro = new Libro();
        unlibro.setautor("J.K. Rowling");
        unlibro.settitulo("Harry Potter y la Piedra Filosofal");
        unlibro.setaño(1997);
        unlibro.setvaloracion(9.2f);
        unlibro.setPaginas((short) 233);
        System.out.println("El libro es: "+unlibro.gettitulo()+"\nSu autor es: "+unlibro.getautor()+"\nEl año en el que fue publicado es: "+
        unlibro.getaño()+"\nTiene "+unlibro.getpaginas()+" páginas \nY su valoración es de: "+unlibro.getvaloracion());
    }
    
}
