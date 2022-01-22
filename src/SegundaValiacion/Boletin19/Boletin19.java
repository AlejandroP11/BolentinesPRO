
package SegundaValiacion.Boletin19;

/**
 *
 * @author Alejandro Pereiro G
 */
public class Boletin19 {

    public static void main(String[] args) {
        Canario canario=new Canario();
        hacerCantar(canario);
        Persoa tenor=new Persoa();
        hacerCantar(tenor);
    }
    public static void hacerCantar(IPodeCantar cantor){
        cantor.cantar();
    }
}
