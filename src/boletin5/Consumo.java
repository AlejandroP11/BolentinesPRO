package boletin5;

/**
 *
 * @author dam1
 */
public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    public Consumo(){
        
    }
    public Consumo(float km, float l, float vMed, float pg){
        this.km=km;
        litros=l;
        this.vMed=vMed;
        pGas=pg;
    }
    
    public float getTiempo(){
        float tiempo=km/vMed;
        return tiempo;
    }
    
    public float consumoMedio(){
        float consumoM=litros*km/100;
        return consumoM;
    }        
    
    public float consumoEuros(){
        float consumoE=pGas*km/100;
        return consumoE;
    }
    public void setKms(float km){
        this.km=km;
    }
    public void setLitros(float l){
        litros=l;
    }
    public void setVMed(float vm){
        vMed=vm;
    }
    public void setPGas(float pg){
        pGas=pg;
    }

}
