
package SegundaValiacion.Boletin22;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op=0; 
        int filas=3;
        int columnas=3;
        int[][]tabla=new int[filas][columnas];
        String[]equipos=new String[]{"Celta","Malaga","Madrid"};
        String[]jornadas=new String[]{"x1","x2","x3"};
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1- Crear la tabla\n2- Ver la tabla\n3- Ordenar por goles totales\n4- Mas goles por jornada\n5- Buscar equipo\n0- SALIR"));
            switch(op){
                case 1 : tabla=Metodos22.crearTabla(tabla, jornadas, equipos);
                break;
                case 2 : Metodos22.amosarTablaCompleta(tabla, jornadas, equipos);
                break;
                case 3 : Metodos22.ordenarTabla(tabla, equipos);
                break;
                case 4 : Metodos22.masGolesJornada(tabla, equipos, jornadas);
                break;
                case 5 : Metodos22.buscarEquipo(tabla, equipos, jornadas);
                break;
                default : System.out.println("Opción incorrecta");
            }
        }while(op!=0);
    }  
}
