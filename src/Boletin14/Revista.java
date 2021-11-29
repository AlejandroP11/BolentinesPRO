
package Boletin14;

/**
 *
 * @author dam1
 */
public class Revista extends Publicacion {
    public int numero;
    public Revista(int numero, int codigo, String titulo, int año) {
        super(codigo, titulo, año);
        this.numero = numero;
    }
    @Override
    public int getAño(){
        return super.getAño();
    }
    @Override
    public int getCodigo(){
        return super.getCodigo();
    }
    @Override
    public String toString() {
        return super.toString()+ ", numero=" + numero ;
    }
}
