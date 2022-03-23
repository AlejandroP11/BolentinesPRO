
package SegundaValiacion.Boletin25;
import Libreria.LeerDatos;
/**
 *
 * @author dam1
 */
public class Boletin25 {

    public static void main(String[] args) {
        int op;
        Metodos esc=new Metodos();
        do{
            op=LeerDatos.leerInt("***MENU***\n1- Agregar libro\n2- Buscar libro\n3- Ver libros\n4- Borrar libros sin stock"
                    + "\n5- Modificar el precio de un libro\n0- SALIR");
            switch(op){
                case 1 : esc.escribirObjetos("Libreria.txt");
                break;
                case 2 : esc.consultar("Libreria.txt", "\\s*,\\s*");
                break;
                case 3 : esc.leer("Libreria.txt");
                break;
                case 4 : esc.borrar("Libreria.txt");
                break;
                case 5 : esc.modificar("Libreria.txt", "\\s*,\\s*");
                break;
                case 0 : System.out.println("Salida exitosa");
                break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(op!=0);
        
        
    }
    
}
