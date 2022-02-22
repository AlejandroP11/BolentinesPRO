
package SegundaValiacion.Boletin24.Libreria;

import Libreria.LeerDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Libreria {
    public static ArrayList<Libro> añadir(ArrayList<Libro> lista){
        String ISBN=LeerDatos.leerString("Introduce el ISBN del libro");
        boolean rep= true;
        Iterator<Libro> it=lista.iterator();
        while(it.hasNext()){
            Libro li=it.next();
            if(li.getISBN().equals(ISBN)){
                System.out.println("El ISBN ya existe");
                int uni=LeerDatos.leerInt("Introduce el numero de nuevas unidades totales");
                li.setNumUni(li.getNumUni()+uni);
                System.out.println("Actualizado el stock");
                String res=LeerDatos.leerString("Deseas cambiar el precio");
                if(res.equalsIgnoreCase("si")){
                    li.setPrecio(LeerDatos.leerFloat("Introduce el nuevo precio"));
                    System.out.println("Actualizado el precio");
                }
                rep=false;
            }
        }
        if(rep){
            String ti=LeerDatos.leerString("Introduce el titulo del libro");
            String autor=LeerDatos.leerString("Introduce el autor del libro");
            float pre=LeerDatos.leerFloat("Introduce el precio del libro");
            int uni=LeerDatos.leerInt("Introduce el numero de unnidades del libro");
            lista.add(new Libro(ti, autor, ISBN, pre, uni));
        }
        return lista;
    }
    public static ArrayList<Libro> vender(ArrayList<Libro> lista){
        String ISBN=LeerDatos.leerString("Introduce el ISBN del libro vendido");
        Iterator<Libro> it =lista.iterator();
        while(it.hasNext()){
            Libro li=it.next();
            if(li.getISBN().equals(ISBN)){
                int ven=LeerDatos.leerInt("Introduce el numero de libros vendidos");
                int uni=li.getNumUni();
                li.setNumUni(uni-ven);
                System.out.println("Actualizado el stock");
            }
        }
        return lista;
    }
    public static void amosar(ArrayList<Libro> lista){
        Collections.sort(lista, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return new String(l1.getTitulo()).compareTo(new String(l2.getTitulo()));
            }
        });
        Iterator<Libro> itr = lista.iterator();
        while (itr.hasNext()) {
            System.out.println("*****");
            System.out.println(itr.next());
        }
    }
    public static ArrayList<Libro> darBaja(ArrayList<Libro> lista){
        Iterator<Libro> it=lista.iterator();
        while(it.hasNext()){
            Libro l = it.next();
            if(l.getNumUni()<=0){
                lista.remove(lista.indexOf(l));
            }
        }
        return lista;
    }
    public static void buscarLibro(ArrayList<Libro> lista){
        String ti=LeerDatos.leerString("Introduce el nombre del libro que deseas buscar");
        Iterator<Libro> it=lista.iterator();
        while(it.hasNext()){
            Libro l=it.next();
            if(l.getTitulo().equals(ti)){
                System.out.println(l);
            }
        }
    }
}
