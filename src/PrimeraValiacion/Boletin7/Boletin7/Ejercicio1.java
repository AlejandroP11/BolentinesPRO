
package PrimeraValiacion.Boletin7.Boletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    
    public void numPos(){
        float num=Float.parseFloat(JOptionPane.showInputDialog("Teclea un número: "));
        if (num>0)
            JOptionPane.showMessageDialog(null,"es positivo");
    
    }

    
}
