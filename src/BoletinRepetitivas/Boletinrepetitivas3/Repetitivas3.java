
package BoletinRepetitivas.Boletinrepetitivas3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Repetitivas3 {
    public void hacerRepetitiva(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
        while(num!=0){
            System.out.println("Tu número es: "+num);
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        System.out.println("Fin");
    }

}
