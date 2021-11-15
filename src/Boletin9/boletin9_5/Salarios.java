
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Salarios {
    public void contarSalarios(){
        int i=0;
        int j=0;
        int k=0;
        float por=0;
        float s=pedirSalario();
        while(s!=0){
            if(s<0){
            }
            else{
                i++;
                if(s>=1000&&s<=1750){
                    k++;
                }
                else if(s<1000){
                    j++;
                    por=100*j/i;
                }
            }
            s=pedirSalario();
        }
        System.out.println(k+" trabajadores ganan entre 1000 y 1750 euros y el "+por+"% cobran menos de 1000 euros");
    }
    public float pedirSalario(){
        float salario=Float.parseFloat(JOptionPane.showInputDialog("Introduce el salario"));
        return salario;
    }
}
