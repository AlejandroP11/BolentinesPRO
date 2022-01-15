
package PrimeraValiacion.BoletinRepetitivas.Boletinrepetitivas2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Repetitivas2 {
    public void hacerRepetitiva(){
        int i=0;
        while(i<5){
            i++;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
            System.out.println("Tu número es: "+num);
        }
    }
}
