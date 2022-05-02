/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TerceraValiacion.Boletin34;
/**
 *
 * @author Alejandro Pereiro G
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int añosExperiencia) {
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("El masajista da un masaje");
    }
    
    @Override
    public String toString() {
        return "Masajista { " + " titulacion = " + titulacion + ", años Experiencia = " + añosExperiencia + '}';
    }
    
    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista esta en los entrenamientos");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista esta en los partidos");
    }
    
}
