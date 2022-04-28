
package TerceraValiacion.Boletin33;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Operaciones <T>{

    //metodo que se encarga de encontrar el elemento de menor valor del ArrayList
    public <T extends Comparable> void calcularMenor(ArrayList<T> lista){
        Collections.sort(lista); //ordena la lista de menor a mayor
        System.out.println(lista.get(0)); //enseña el primer elemento del ArrayList, que, despues de ordenarla, es el menor
    }

    //metodo que se encarga de encontrar el elemento de mayor valor del ArrayList
    public <T extends Comparable> void calcularMayor(ArrayList<T> lista){
        Collections.sort(lista); //ordena la lista de menor a mayor
        System.out.println(lista.get(lista.size() - 1)); //enseña el ultimo elemento del ArrayList, que, despues de ordenarla, es el mayor
    }

    //metodo que se encarga de buscar la primera posicion de un elemento en especifico, pedido al usaurio, y devuelve esa posicion
    public int buscar(ArrayList<T> lista){
        int pos = -1; //inicializamos la posicion en -1
        String elebus = JOptionPane.showInputDialog("Introduce el elemento a buscar"); //pedimos el elemento que se va a buscar
        for(T elemento : lista){ //recorremos la lista
            if(elebus.equals(String.valueOf(elemento))){ //si el elemento buscado es igual al valor del elemento de la lista en el que nos encontramos
                pos = lista.indexOf(elemento); //guardamos la posicion del elemento
                System.out.println("La posicion del elemento buscado es: " + pos);
                break;
            }
        }
        if(pos == -1) //si la posicion sigue siendo -1
            System.out.println("El elemento no existe");
        return pos; //devuelve la posicion del elemento buscado
    }

    //metodo que se encarga de borrar un elemento en especifico, pedido al usuario, y devuelve la lista sin el elemento
    public ArrayList<T> borrar(ArrayList<T> lista){
        int pos = this.buscar(lista); //llamada al metodo buscar que devuelve la posicion del elemento buscado
        lista.remove(pos); //se remueve de la lista el elemnto de la poscion que devuelve el metodo buscar
        System.out.println("El elemento ha sido borrado");
        return lista; //devuelve la lista
    }
}
