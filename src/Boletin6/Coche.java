
package boletin6;

/**
 * @author Alejandro Pereiro G
 */
public class Coche {
    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Se utiliza para acelerar el coche
     * @param valor
     */

    public void acelerar(int valor) {
        velocidade = velocidade + valor;
    }

    /**
     * Se utiliza para frenar el coche
     * @param menos
     */

    public void frenar(int menos) {
        velocidade = velocidade - menos;
    }

}
