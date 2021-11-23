
package Boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Garaje {
    private int numeroCoches;
    private int matricula;
    public void estacionar(){
        final int cochesmax=5;
        final float precio=1.5f;
        final float precioextra=0.2f;
        float preciototal;
        int tiempo;
        float tiempoex;
        float pago;
        float cambio;
        numeroCoches=pedirNumCoches();
        while(numeroCoches<cochesmax){
            JOptionPane.showMessageDialog(null, "Plazas disponibles");
            numeroCoches++;
            matricula=pedirMatricula();
            tiempo=Integer.parseInt(JOptionPane.showInputDialog("Indique el tiempo total en el estacionamiento"));
            if(tiempo<180)
                preciototal=precio;
            else{
                tiempoex=(tiempo-180)/60;
                preciototal=precio+tiempoex*precioextra;
            }
            JOptionPane.showMessageDialog(null, "Debe pagar "+preciototal+" €");
            pago=Float.parseFloat(JOptionPane.showInputDialog("Indique el pago realizado"));
            cambio=pago-preciototal;
            System.out.println("Factura \nMatricula coche "+matricula+"\nTiempo "+tiempo+"\nPrecio "+preciototal+"\nDinero recibido "+pago+"\nDinero devuelto "+cambio+"\nGracias por usar nuestro aparcamiento");
        }
        JOptionPane.showMessageDialog(null, "Completo");
        
        
    }
    public int pedirNumCoches(){
        numeroCoches=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número de coches"));
        return numeroCoches;
    }
    public int pedirMatricula(){
        matricula=Integer.parseInt(JOptionPane.showInputDialog("Inserta la matrícula"));
        return matricula;
    }
    
}
