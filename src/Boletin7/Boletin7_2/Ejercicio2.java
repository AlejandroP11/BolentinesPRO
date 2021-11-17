
package Boletin7.Boletin7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {
    public void numRe(){
        short num1=lernum();
        short num2=lernum();
        if(num1>=num2)
            System.out.println("La resta da: "+(num1-num2)+" y la suma da: "+(num1+num2));
        else 
            System.out.println("La suma da: "+num1+num2);
    }
    public short lernum(){
        short num=Short.parseShort(JOptionPane.showInputDialog("Teclea un número"));
        return num;
    }
    
}
