import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_3 {
    public static void main(String []args){
        int numero;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero mayor a 50");
            numero=Integer.valueOf(entrada.readLine());
            if(numero%2==0 || numero%3==0){
                System.out.println(numero);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
