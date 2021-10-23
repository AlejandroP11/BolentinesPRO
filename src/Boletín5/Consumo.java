
package boletin5;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Consumo {
     private float km;
    private float litros;
    private float vMed;
    private float pGas;
    public Consumo (){
    }
    public Consumo (float km, float l, float vM, float pG){
        this.km=km;
        litros=l;
        vMed=vM;
        pGas=pG;
    }
    public float getTempo(){
        float tiempo=km/vMed;
        return tiempo;
    }
    public float consumoMedio(){
        float consumoMedio=litros*100/km;
        return consumoMedio;
    }
    public float consumoEuros(){
        float consumoEuros=litros*100/km*pGas;
        return consumoEuros;
    }
    public void setKms(float km){
        this.km=km;
    }
    public void setLitros(float l){
        litros=l;
    }
    public void setvMed(float vm){
        vMed=vm;
    }
    public void setpGas(float pg){
        pGas=pg;
    }
    public float getvMed(){
        return vMed;
    }
}
