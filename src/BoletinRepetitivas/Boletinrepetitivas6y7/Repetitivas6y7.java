
package BoletinRepetitivas.Boletinrepetitivas6y7;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Repetitivas6y7 {
    public void calcularArea(){
        int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado: "));
        while(lado<0){
            JOptionPane.showMessageDialog(null, "El lado no puede ser negativo");
            lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado, este no puede ser negativo"));
        }
        int area=(int) Math.pow(lado, lado);
        System.out.println("El área del cuadrado es: "+area);
    }
}
