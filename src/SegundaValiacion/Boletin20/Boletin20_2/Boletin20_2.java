
package SegundaValiacion.Boletin20.Boletin20_2;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avestruz cabeza=new Avestruz();
        hacerCaminar(cabeza);
        Papagaio pap=new Papagaio();
        hacerCaminar(pap);
        hacerVolar(pap);
        Morcego chupa=new Morcego();
        hacerCaminar(chupa);
        hacerVolar(chupa);
        Gato garfield=new Gato();
        hacerCaminar(garfield);
        hacerNadar(garfield);
        Tigre toño=new Tigre();
        hacerCaminar(toño);
        hacerNadar(toño);
    }
    public static void hacerCaminar(IPodeCaminar caminante){
        caminante.caminar();
    }
    public static void hacerVolar(IPodeVolar volador){
        volador.volar();
    }
    public static void hacerNadar(IPodeNadar nadador){
        nadador.nadar();
    }
}
