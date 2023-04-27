import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Ejercicio_1_b {
    public static void main (String [] args){
        int numero;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero:");
            numero=Integer.valueOf(entrada.readLine());
            if(numero>100){
                System.out.println("Grande");
            }
            else {
                System.out.println("chico");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
