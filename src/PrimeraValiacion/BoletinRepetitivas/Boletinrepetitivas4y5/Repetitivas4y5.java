
package PrimeraValiacion.BoletinRepetitivas.Boletinrepetitivas4y5;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Repetitivas4y5 {
    public void hacerRepetitivas(){
     int i=0, c=0;
     int num=1;
     while(i<4){
         i++;
         if(num>0){
             num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
             System.out.println("Tu número es: "+num);  
             c+=num;
         }
     }
        System.out.println("La suma de todos tus número es: "+c);
    }
}
