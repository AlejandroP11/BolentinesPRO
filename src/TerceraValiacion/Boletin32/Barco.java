
package TerceraValiacion.Boletin32;;

/**
 *
 * @author dam1
 */
public abstract class Barco {
    private int esloras;
    private int dias;

    public Barco() {
    }

    public Barco(int esloras, int dias) {
        this.esloras = esloras;
        this.dias = dias;
    }

    public int getEsloras() {
        return esloras;
    }

    public void setEsloras(int esloras) {
        this.esloras = esloras;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return " esloras = " + esloras + ", dias = " + dias;
    }
    
    public abstract void calcularPrecio(Barco barco);
}
