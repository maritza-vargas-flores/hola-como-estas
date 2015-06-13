
package clase;

/**
 *
 * @author LAB-203
 */
public class multiplicar {
    public int numero;
    public void tablaSimple(int numeroTabla){
        int contador = 1;
        while (contador <=numero){
           System.out.println(numeroTabla +" x "+contador+" = " + numeroTabla*contador);
            contador++;
        }
    }
    public void mostrarTabla(){
      tablaSimple(numero);
    }
     public static void main(String[] args) {
        multiplicar myMultiplicar = new multiplicar();
        myMultiplicar.numero=3;
        myMultiplicar.mostrarTabla();
      
       
    }
}
