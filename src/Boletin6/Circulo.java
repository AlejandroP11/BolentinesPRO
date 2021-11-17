
package Boletin6;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Circulo {
    private double radio;
    private static final double pi=3.14;
    public Circulo(){
        
    }
    public Circulo(double ra){
        radio=ra;
    }
    public void setRadio(double ra){
        radio=ra;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        double area=pi*Math.pow(radio, (double)2);
        return area;
    }
    public double calcularLonxitude(){
        double longitud=2*pi*radio;
        return longitud;
    }
}
