
package TerceraValiacion.Boletin34;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> listaSel = new ArrayList<>();
        listaSel.add(new Entrenador(2020,165020, "Juan Andres", "Montes Rodriguez", 46));
        listaSel.add(new Futbolista("delantero", 9, 2050, "Gerard", "Moreno", 30));
        listaSel.add(new Masajista("Fisioterapeuta", 10, 106, "Manuel", "Perdomo Rojas", 34));
        listaSel.add(new Seleccionador(204, "Luis Enrique", "Martinez Garcia", 51));
        for(SeleccionFutbol sel : listaSel)
            sel.concentrarse();
    }
    
}
