import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_10{
    public static void main(String[] args) {
        int numero, suma=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Ingrese un numero entero: ");
                numero = Integer.valueOf(entrada.readLine());
                if(numero>=1 && numero<=10) {
                    suma += numero;
                }
            }
            while(numero>=1 && numero<=10);
            System.out.println("La suma de los numeros ingresados dio: "+suma);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
 