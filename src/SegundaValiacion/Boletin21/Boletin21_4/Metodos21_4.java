
package SegundaValiacion.Boletin21.Boletin21_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Metodos21_4 {
    public static int pedirDni(){
        int dni=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu dni sin la letra"));
        return dni;
    }
    public static int calcularResto(int dni){
        int resto = dni % 23;
        return resto;
    }
    public static void calcularLetra(char[] letras, int resto){
        System.out.println(letras[resto]+ " es la letra de tu dni");
    }
}
