
package Boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Area {
    public void caluclarArea(){
        int b;
        int h;
        float a=0;
        do{
            b=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            h=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            if(b>0&&h>0)
                a=b*h/2;
            else
                System.out.println("Deben ser positivos");
        }while(b<0||h<0);
                
                
        System.out.println("El area del triángulo es: "+a);
    }
}
