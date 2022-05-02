
package TerceraValiacion.Boletin34;
/**
 *
 * @author Alejandro Pereiro G
 */
public class Futbolista extends SeleccionFutbol{
    private String demarcacion;
    private int dorsal;

    public Futbolista() {
    }

    public Futbolista(String titulacion, int añosExperiencia) {
        this.demarcacion = titulacion;
        this.dorsal = añosExperiencia;
    }

    public Futbolista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.demarcacion = titulacion;
        this.dorsal = añosExperiencia;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String titulacion) {
        this.demarcacion = titulacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int añosExperiencia) {
        this.dorsal = añosExperiencia;
    }
    
    public void entrevista(){
        System.out.println("El jugador concede una entrevista");
    }
    
    @Override
    public String toString() {
        return "Futbolista{ " + "demarcacion = " + demarcacion + ", dorsal = " + dorsal + '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("EL futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega el partido");
    }
    
}
