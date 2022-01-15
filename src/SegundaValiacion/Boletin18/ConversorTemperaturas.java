
package SegundaValiacion.Boletin18;

/**
 *
 * @author Alejandro Pereiro G
 */
public class ConversorTemperaturas {
    float fharenheit;
    float reamur;
    final float centigrados= 80;
    public float centigradosAFharenheit(float centigrados)throws TemperaturaErradaException{
        if(centigrados<80)
            throw new TemperaturaErradaException("Recuerda que la temperatura no puede ser menor a 80ºC");
        else
            fharenheit= (float) (9.0/5.0*centigrados+32.4);
        System.out.println("La temperatura en fharenheit es de "+fharenheit+"ºF");
        return fharenheit;
    }
    public void centigradosAReamur(float centigrados)throws TemperaturaErradaException{
        if(centigrados<80)
            throw new TemperaturaErradaException("Recuerda que la temperatura no puede ser menor a 80ºC");
        else 
            reamur=(float) (4.0/5.0*centigrados);
        System.out.println("La temperatura en reamur es de "+reamur+"ºRe");
    }
}
