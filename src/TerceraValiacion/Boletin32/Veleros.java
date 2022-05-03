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
public class Veleros extends Barco{
    private int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(int mastiles, int dias, int esloras) {
        super(dias, esloras);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Veleros{ " + "mastiles = " + mastiles + super.toString() + '}';
    }
    
    @Override
    public void calcularPrecio(Barco barco){
        int modulo = barco.getEsloras()*10+this.getMastiles()*8;
        float precio = barco.getDias()*modulo;
        System.out.println("El precio del alquiler del velero es: " + precio + "€");
    }
}
