
package TerceraValiacion.Boletin34;
/**
 *
 * @author Alejandro Pereiro G
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
    
    public void seleccionarJugador(){
        System.out.println("El seleccionador selecciona un jugador");
    }
    
    @Override
    public String toString() {
        return "Seleccionador ";
    }
    
    @Override
    public void concentrarse() {
        System.out.println("El seleccionador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El selecciondor viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador esta en el partido");
    }
    
}
