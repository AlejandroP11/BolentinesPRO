
package PrimeraValiacion.Boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Notas {
    float notab;
    float examen1;
    float examen2;    
    float notaE;
    float examenPrac;
    float notaEP;
    float notaFinal;
    String fin;
    public void calcularNotaFinal(){
        do{
        float boletines=Float.parseFloat(JOptionPane.showInputDialog("Introduce el número de boletínes entregados: "));
        boletines=boletines*100/20;
        if(boletines>90)
            notab=2;
        else if(boletines<=90&&boletines>=70)
            notab=1;
        else
            notab=0;
        examen1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del primer examen"));
        examen2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del segundo examen"));
        notaE=(float) (((examen1+examen2)/2)*0.4);
        examenPrac=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del examen práctico"));
        notaEP= (float) (examenPrac*0.4);
        notaFinal=notab+notaE+notaEP;
        JOptionPane.showMessageDialog(null, "Tu nota final es: "+notaFinal);
        fin=JOptionPane.showInputDialog("¿Quieres calcular otra nota?");
        }while(!fin.equals("no"));
    }
}
