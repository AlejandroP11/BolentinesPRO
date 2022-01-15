
package SegundaValiacion.Boletin18;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin18 {
    
    public static void main(String[] args){
        float centigrados=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la temperatura en centigrados"));
        ConversorTemperaturas conversor=new ConversorTemperaturas();
        try{
            conversor.centigradosAFharenheit(centigrados);
        }catch(TemperaturaErradaException ex){
            System.out.println(ex.getMessage());
        }
        try{
            conversor.centigradosAReamur(centigrados);
        }catch(TemperaturaErradaException ex){
          
        }
    }
    
}
