/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceraValiacion.Boletin32;;

/**
 *
 * @author dam1
 */
public class Deportivos extends Barco{
    private int potencia;

    public Deportivos() {
    }

    public Deportivos(int potencia) {
        this.potencia = potencia;
    }

    public Deportivos(int potencia, int esloras, int dias) {
        super(esloras, dias);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Deportivas{ " + "potencia = " + potencia + super.toString() + '}';
    }
    
    @Override
    public void calcularPrecio(Barco barco) {
        int modulo = barco.getEsloras()*10+this.getPotencia()*2;
        float precio = barco.getDias()*modulo;
        System.out.println("El precio del alquiler del deportivo es: " + precio + "€");
    }
    
}
