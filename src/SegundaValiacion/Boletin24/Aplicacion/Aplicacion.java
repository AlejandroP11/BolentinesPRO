
package SegundaValiacion.Boletin24.Aplicacion;
import SegundaValiacion.Boletin24.Libreria.Libreria;
import SegundaValiacion.Boletin24.Libreria.Libro;
import Libreria.LeerDatos;
import java.util.ArrayList;
/**
 *
 * @author Alejandro Pereiro G
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libro> lista=new ArrayList<Libro>();
        int op;
        do{
            op=LeerDatos.leerInt("***MENU***\n1- Agregar Libro\n2- Vender libros\n3- Ver libros\n4- Dar libros de baja\n5- Buscar libro\n0- SALIR");
            switch(op){
                case 1 : lista=Libreria.añadir(lista);
                break;
                case 2 : lista=Libreria.vender(lista);
                break;
                case 3 : Libreria.amosar(lista);
                break;
                case 4 : lista=Libreria.darBaja(lista);
                break;
                case 5 : Libreria.buscarLibro(lista);
                break;
                case 0 : System.out.println("Salida exitosa");
                break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(op!=0);
    }
    
}
