
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Multiplo {
    public void calcularMultiplo(){
    String numero;
    numero=JOptionPane.showInputDialog("Introduce un número");
    
    int num=Integer.parseInt(numero);
    while(num>0){
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
        JOptionPane.showInputDialog("Introduce un número");
    }
}
    
}
