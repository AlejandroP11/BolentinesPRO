
package Boletin11.Boletin11_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class JuegoMáquina {
    public void jugar(){
        int distancia;
        int i=0;
        int num=0;
        Random claseRandom=new Random();
        int randomInt=claseRandom.nextInt(50-1);
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            if(num==randomInt)
                JOptionPane.showMessageDialog(null, "Felicidades, acertaste el número");
            else{
                i++;
                distancia=Math.abs(num - randomInt);
                if(distancia>20){
                    JOptionPane.showMessageDialog(null, "muy lejos");
                }
                else{
                    if(distancia>=10&&distancia<=20){
                        JOptionPane.showMessageDialog(null, "lejos");
                    }
                    else{
                        if(distancia<10&&distancia>5){
                            JOptionPane.showMessageDialog(null, "cerca");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "muy cerca");
                        }
                    }
                }
            }
        }while(num!=randomInt);
    }
}
