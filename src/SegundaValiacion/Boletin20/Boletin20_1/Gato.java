
package SegundaValiacion.Boletin20.Boletin20_1;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Gato extends Mamifero implements IPodeCaminar, IPodeNadar{
    @Override
    public void nadar(){
        System.out.println("El gato nada");
    }
}
