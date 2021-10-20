
package boletin4;

/**
 *
 * @author dam1
 */
public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int año;
    private short numPaginas;
    private float valoracion;

    //constructores
    public Libro() {
    }

    public Libro(String t, String au, int a, short np) {
        titulo = t;
        autor = au;
        año = a;
        numPaginas = np;
    }

    //metodos
    public void settitulo(String t) {
        titulo = t;
    }

    public void setautor(String au) {
        autor = au;
    }

    public void setaño(int a) {
        año = a;
    }

    public void setPaginas(short np) {
        numPaginas = np;
    }

    public void setvaloracion(float v) {
        valoracion = v;
    }

    public String gettitulo() {
        return titulo;
    }

    public String getautor() {
        return autor;
    }

    public int getaño() {
        return año;
    }

    public short getpaginas() {
        return numPaginas;
    }

    public float getvaloracion() {
        return valoracion;
    }

    public void amosar() {
        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nAño: " + año + "\nNúmero de páginas" +
                numPaginas + "\nValoración: " + valoracion);
    }
}


