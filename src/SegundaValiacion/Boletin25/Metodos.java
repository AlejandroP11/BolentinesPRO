
package  SegundaValiacion.Boletin25;

import Libreria.LeerDatos;
import java.util.Iterator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author dam1
 */
public class Metodos {
    FileWriter fich;
    PrintWriter es;
    BufferedWriter bf;
    Libro l;
    Scanner sc;
    
    public void escribirObjetos(String nombreFichero){
        try {
            fich=new FileWriter(nombreFichero);
            es=new PrintWriter(fich);
            int agregar=LeerDatos.leerInt("Introduce el número de libros que deseas agregar");
            for(int i=0;i<agregar;i++){
                String t=LeerDatos.leerStrting("Introduce el titulo del libro");
                String a=LeerDatos.leerStrting("Introduce el autor del libro");
                float p=LeerDatos.leerFloat("Introduce el precio del libro");
                int u=LeerDatos.leerInt("Introduce el número de unidades del libro");
                l=new Libro(t,a,p,u);
                es.print(l.getNombre()+", ");
                es.print(l.getAutor()+", ");
                es.print(l.getPrecio()+", ");
                es.println(l.getUnidades());
            }
            System.out.println("Fichero actualizado");
        } catch (IOException ex) {
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            try {
                es.close();
                fich.close();
            } catch (IOException ex) {
                System.out.println("No se puede cerrar el fichero");
            }
        }
    }
    public void consultar(String nombreFichero, String delimitador){
        try {
            int si=0; //Si esta en 0 no se encontro
            String cadena;
            File fich=new File(nombreFichero);
            sc=new Scanner(fich);
            Libro bus=new Libro();
            bus.setNombre(LeerDatos.leerStrting("Introduce el titulo del libro que deseas buscar"));
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                String[]linea=cadena.split(delimitador);
                l=new Libro(linea[0],linea[1],Float.parseFloat(linea[2]),Integer.parseInt(linea[3]));
                if(bus.equals(l)){
                    bus.setPrecio(l.getPrecio());
                    si=1;
                    break;
                }
            }
            if(si==1){
                System.out.println("El precio del libro es "+bus.getPrecio());
                }
            else
                System.out.println("No tenemos el libro en la libreria");
        } catch (FileNotFoundException ex) {
            System.out.println("Error de lectura"+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    public void leer(String nombreFichero){
        try {
            File fich=new File(nombreFichero);
            String cadena;
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                System.out.println(cadena);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error de lectura "+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    public void borrar(String nombreFichero){
        ArrayList<Libro>lista=new ArrayList<Libro>();
        try {
            String cadena;
            File fic=new File(nombreFichero);
            sc=new Scanner(fic);
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                String[]linea=cadena.split("\\s*,\\s*");
                l=new Libro(linea[0],linea[1],Float.parseFloat(linea[2]),Integer.parseInt(linea[3]));
                if(l.getUnidades()>0)
                    lista.add(l);
                }
            try {
                fich=new FileWriter(nombreFichero);
                es=new PrintWriter(fich);
                for(Libro x:lista){
                    es.print(x.getNombre()+", ");
                    es.print(x.getAutor()+", ");
                    es.print(x.getPrecio()+", ");
                    es.println(x.getUnidades());
                    }
            System.out.println("Stock actualizado");                
            } catch (IOException ex) {
                System.out.println("Error de escritura"+ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error de lectura"+ex.getMessage());
        }
        finally{
            try {
                es.close();
                fich.close();
                sc.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo"+ex.getMessage());
            }
        }
    }
    public void modificar(String nombreFichero, String delimitador){
        ArrayList<Libro>lista=new ArrayList<Libro>();
        try {
            int si=0; //Si esta en 0 no se encontro
            String cadena;
            File fic=new File(nombreFichero);
            sc=new Scanner(fic);
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                String[]linea=cadena.split(delimitador);
                l=new Libro(linea[0],linea[1],Float.parseFloat(linea[2]),Integer.parseInt(linea[3]));
                lista.add(l);
            }
            try {
                fich=new FileWriter(nombreFichero);
                bf= new BufferedWriter(fich);
                String bus=LeerDatos.leerString("Introduce el titulo del libro al que le quieres cambiar el precio");
                Iterator<Libro>it=lista.iterator();
                while(it.hasNext()){
                    Libro li=it.next();
                    if(li.getNombre().equals(bus)){
                        li.setPrecio(LeerDatos.leerFloat("Introduce el nuevo precio del libro"));
                        System.out.println("Actualizado el precio");
                        si=1;
                    }
                    bf.write(li.getNombre()+", ");
                    bf.write(li.getAutor()+", ");
                    bf.write(li.getPrecio()+", ");
                    bf.write(li.getUnidades()+"\n");
                }
                bf.close();
                if(si==0)
                    System.out.println("No contamos con ese libro en la libreria");
            } catch (IOException ex) {
                System.out.println("Error de escritura");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error de lectura"+ex.getMessage());
        }
        finally{
            try {
                fich.close();
                sc.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
