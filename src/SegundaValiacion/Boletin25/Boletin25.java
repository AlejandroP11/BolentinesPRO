
package SegundaValiacion.Boletin25;

import LibreriaAlex.*;
/**
 *
 * @author dam1
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Metodos esc=new Metodos();
        do{
            op=LeerDatos.leerInt("***MENU***\n1- Agregar libro\n2- Buscar libro\n3- Ver libros");
            switch(op){
                case 1 : esc.escribirObjetos("Libreria.txt");
                break;
                case 2 : esc.consultar("Libreria.txt", "\\s*,\\s*");
                break;
                case 3 : esc.leer("Libreria.txt");
                break;
            }
        }while(op<6);
        
        
    }
    
}
