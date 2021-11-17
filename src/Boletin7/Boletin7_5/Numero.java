
package Boletin7.Boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Numero {
    public void compararNumero(){
        float num1=leerNumero();
        float num2=leerNumero();
        float num3=leerNumero();
        if(num1>num2)
            if(num1>num3)
                JOptionPane.showMessageDialog(null, num1+" es el mayor");
            else 
                JOptionPane.showMessageDialog(null, num3+" es el mayor");
        else 
            if(num2>num3)
                JOptionPane.showMessageDialog(null, num2+" es el mayor");
            else 
                JOptionPane.showMessageDialog(null, num3+" es el mayor");
    }
    public float leerNumero(){
        float num=Float.parseFloat(JOptionPane.showInputDialog("Teclea un número"));
        return num;
    }
}
