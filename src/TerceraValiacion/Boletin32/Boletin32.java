
package TerceraValiacion.Boletin32;

import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Veleros(2, 7, 4));
        barcos.add(new Deportivos(450, 6, 5));
        barcos.add(new Yate(300, 6, 10, 9));
        for(Barco b : barcos)
            b.calcularPrecio(b);
    }
    
}
