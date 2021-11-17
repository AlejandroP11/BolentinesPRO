
package Boletin8.Boletin8_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Figura {
    String figura=JOptionPane.showInputDialog("Ingresa el nombre de la figura");

    public void darSuperficie(){
        switch(figura){
            case "circulo":
                float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio del círculo"));
                float radio2=(float)Math.pow(radio, 2);
                float superficiec=(float) (3.14*radio2);
                JOptionPane.showMessageDialog(null, "La superficie del círculo es: "+superficiec);
                break;


            case "triangulo":
                float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura del triángulo"));
                float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base del triángulo"));
                float superficiet=base*altura/2;
                JOptionPane.showMessageDialog(null, "La superficie del triángulo es: "+superficiet);
                break;


            case "cuadrado":
                float lado=Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                float superficiecu=lado*lado;
                JOptionPane.showMessageDialog(null, "La superficie del cuadrado es: "+superficiecu);
                break;


            default: JOptionPane.showMessageDialog(null, "Opción incorrecta");

        }
    }
}