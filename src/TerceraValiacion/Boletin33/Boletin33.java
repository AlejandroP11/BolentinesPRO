/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TerceraValiacion.Boletin33;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        lista.add(14);
        lista.add(23);
        lista.add(33);
        lista.add(3);
        lista.add(45);
        lista.add(11);
        lista.add(15);
        lista.add(50);
        lista.add(1);
        Operaciones obj = new Operaciones();
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("*** MENU ***\n1. Minimo\n2. Maximo\n3. Buscar\n4. Borrar\n5. SALIR"));
            switch(op){
                case 1 : obj.calcularMenor(lista);
                break;
                case 2 : obj.calcularMayor(lista);
                break;
                case 3 : obj.buscar(lista);
                break;
                case 4 : obj.borrar(lista);
                break;
                case 5 : System.exit(0);
                break;
            }
        }while(op != 0);
    }
    
}

