/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo por pantalla.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_14 {
    public static final int MAX=10;
    public static void main (String [] args) {
        int [] arrint = new int [MAX];
        int contador=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for(int i=0; i<10;i++){
                System.out.println("Ingrese un numero entero");
                arrint[i]=Integer.valueOf(entrada.readLine());
            }
            for(int i=0; i<10;i++) {
                if (arrint[i]%2==0) {
                    contador++;}
            }
            System.out.print("La cantidad de numeros pares ingresados son: "+contador);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
