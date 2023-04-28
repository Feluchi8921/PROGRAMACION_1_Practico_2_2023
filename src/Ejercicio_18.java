import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_18 {
    public static void main (String []args){
        int numero_1;
        double numero_2 = 0, numero_3=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
                System.out.println("Ingrese un numero");
                numero_1=Integer.valueOf(entrada.readLine());
                while(numero_1!=0){
                    System.out.println("Ingrese un numero");
                    numero_2=Double.valueOf(entrada.readLine());
                    System.out.println("Ingrese un numero");
                    numero_3=Double.valueOf(entrada.readLine());
                    break;
                }
                System.out.println("La division de: "+numero_2+" / "+numero_3+" es: "+(numero_2/numero_3));
            }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
