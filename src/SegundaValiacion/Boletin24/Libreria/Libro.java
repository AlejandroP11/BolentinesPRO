
package SegundaValiacion.Boletin24.Libreria;;

import java.util.Objects;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    private int numUni;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float precio, int numUni) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numUni = numUni;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumUni() {
        return numUni;
    }

    public void setNumUni(int numUni) {
        this.numUni = numUni;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", numUni=" + numUni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }

    
    
}
