
package SegundaValiacion.Boletin22;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Metodos22 {
    public static int[][] crearTabla(int[][]tabla, String[] jornada, String[]equipo){
        for(int fila=0; fila<tabla.length; fila++){
            for(int columna=0; columna<tabla[fila].length; columna++){
                tabla[fila][columna]=Integer.parseInt(JOptionPane.showInputDialog("Número de goles de "+equipo[fila]+" en la jornada "+jornada[columna]));
            }
        }
        return tabla;
    }
    public static void amosarTablaCompleta(int[][] tabla, String[] jornada, String[] equipo) {
        for (int columna = 0; columna < jornada.length; columna++) {
            System.out.print("        " + jornada[columna]);
        }
        for (int fila = 0; fila < tabla.length; fila++) {
            System.out.print("\n" + equipo[fila] + "      ");
            for (int columna = 0; columna < tabla[fila].length; columna++) {
                System.out.print(tabla[fila][columna] + "      ");
            }
        }
    }
    public static int[] sumarGoles(int[][]tabla, String[]equipos){
        int k=0;
        int tam=equipos.length;
        int[]sumas=new int[tam];
        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++){
                k+=tabla[i][j];
            }
            sumas[i]=k;
        }
        return sumas;
    }
    public static void ordenarTabla(int[][]tabla, String[]equipos){
        int aux;
        String aux2;
        int[] sumas=Metodos22.sumarGoles(tabla, equipos);
        for(int i=0; i<sumas.length; i++){
            for(int j=i; j<sumas.length;j++){
                if(sumas[i]>sumas[j]){
                    aux=sumas[i];
                    aux2=equipos[i];
                    sumas[i]=sumas[j];
                    equipos[i]=equipos[j];
                    sumas[j]=aux;
                    equipos[j]=aux2;
                }
            }
        }
        for(int i=0; i<sumas.length; i++){
            System.out.println("\nEquipo: "+equipos[i]+" goles: "+sumas[i]);
        }
    }
    public static void masGolesJornada(int[][]tabla, String[]equipos, String[]jornadas){
        int aux=tabla[0][0];
        int pos=0;
        for(int i=0; i<tabla.length; i++){
            aux=tabla[0][i];
            System.out.println("\n"+jornadas[i]+" ");
            for(int j=0; j<tabla[i].length; j++){
                if(aux<=tabla[j][i]){
                    pos=j;
                    aux=tabla[j][i];
                }
            }
            System.out.println("Más goles: "+equipos[pos]);
        }
    }
    public static int buscarEquipo(int[][]tabla, String[]equipos, String[]jornadas){
        int pos=0;
        int encontrado=0; //en 1 T en 0 F
        String equ=JOptionPane.showInputDialog("Introduce el equipo a buscar: ");
        String jor=JOptionPane.showInputDialog("Introduce la jornada que deseas ver");
        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++){
                if(equ.equals(equipos[j]) && jor.equals(jornadas[i])){
                    System.out.println("En la jornada "+jornadas[i]+" el "+equipos[j]+" anotó "+tabla[j][i]+" goles.");
                    encontrado=1;
                    pos=tabla[j][i];
                }
            }
        }
        if(encontrado==0){
            System.out.println("No se encontró");
        }
        return pos;
    }
}
