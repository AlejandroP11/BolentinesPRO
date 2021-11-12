package Boletin9.Boletin9_1;
import javax.swing.JOptionPane;

public class ValorNum {
    public void valores(){
        int j=0;
        int k=0;
        int cero=0;

        for(int i=0;i<10;i++){
            int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            if(num<0){
                j++;
            }
            else if(num>0){
                k++;
            }
            else{
                cero++;
            }
        }
        System.out.println("Hay "+j+" números negativos, "+k+" números positivos y "+cero+" ceros.");
    }
}
