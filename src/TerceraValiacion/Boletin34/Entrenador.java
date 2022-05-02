
package TerceraValiacion.Boletin34;
/**
 *
 * @author Alejandro Pereiro G
 */
public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void planificarEntranamiento(){
        System.out.println("El entrenador planifica el entrenamiento");
    }
    
    @Override
    public String toString() {
        return "Entrenador { " + "id Federacion = " + idFederacion + '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concetra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El entranador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador dirige el partido");
    }
    
}
