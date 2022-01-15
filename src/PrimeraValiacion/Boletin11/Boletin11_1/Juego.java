
package PrimeraValiacion.Boletin11.Boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Juego {
    public void jugar(){
        int i=0;
        int num=pedirNum();
        int num2=0;
        while(num<1||num>50){
            num=Integer.parseInt(JOptionPane.showInputDialog("Vuelve a introducir el número, debe estar entre 1 y 50"));
        }
        int numi=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos"));
        do{
            num2=pedirNum();
            if(num==num2){
                JOptionPane.showMessageDialog(null, "felicidades, has adivinado el número");
                break;
                }
            else{
                if(num>num2){
                   JOptionPane.showMessageDialog(null, "El número que tecleaste es menor");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El número que tecleaste es mayor");
                }
                i++;
            }
        }while(i<numi);
        JOptionPane.showMessageDialog(null, "Se acabó el juego");
    }
    public int pedirNum(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        return numero;
    }
}
