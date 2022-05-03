
package TerceraValiacion.Boletin32;;

/**
 *
 * @author dam1
 */
public class Yate extends Barco{
    private int potencia;
    private int camarote;

    public Yate() {
    }

    public Yate(int potencia, int camarote) {
        this.potencia = potencia;
        this.camarote = camarote;
    }

    public Yate(int potencia, int camarote, int esloras, int dias) {
        super(esloras, dias);
        this.potencia = potencia;
        this.camarote = camarote;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    @Override
    public String toString() {
        return "Yate{ " + "potencia = " + potencia + ", camarote = " + camarote + super.toString() + '}';
    }

    @Override
    public void calcularPrecio(Barco barco) {
        int modulo = barco.getEsloras()*10 + this.getPotencia()*2 + this.getCamarote()*25;
        float precio = barco.getDias()*modulo;
        System.out.println("El precio del alquiler del yate es: " + precio + "€");
    }
}
