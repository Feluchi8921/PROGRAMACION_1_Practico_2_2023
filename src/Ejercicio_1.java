import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Ejercicio_1 {
    public static void main (String [] args){
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Ingrese un numero:");
        numero=Integer.valueOf(entrada.readLine());
        if(numero>=0){
            System.out.println("El numero: "+numero+" es positivo");
        }
        else {
            System.out.println("El numero: " + numero + " es negativo");
        }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
