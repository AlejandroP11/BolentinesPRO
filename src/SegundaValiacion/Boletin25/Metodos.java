
package  SegundaValiacion.Boletin25;;

import LibreriaAlex.*;
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
            fich=new FileWriter(nombreFichero,true);
            es=new PrintWriter(fich);
            int agregar=LeerDatos.leerInt("Introduce el número de libros que deseas agregar");
            for(int i=0;i<agregar;i++){
                String t=LeerDatos.leerString("Introduce el titulo del libro");
                String a=LeerDatos.leerString("Introduce el autor del libro");
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
            bus.setNombre(LeerDatos.leerString("Introduce el titulo del libro que deseas buscar"));
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
            System.out.println("Error 5 "+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
