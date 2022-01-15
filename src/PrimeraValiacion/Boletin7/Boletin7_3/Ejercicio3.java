
package PrimeraValiacion.Boletin7.Boletin7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {
    public void numdi(){
        float num=Float.parseFloat(JOptionPane.showInputDialog("Teclea un número"));
        if(num>0)
            JOptionPane.showMessageDialog(null, "+");
        else if(num<0)
            JOptionPane.showMessageDialog(null, "-");
        else
            JOptionPane.showMessageDialog(null, "0");
    }
    
}
