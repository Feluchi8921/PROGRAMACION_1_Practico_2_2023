import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_7 {
    public static void main (String []args){
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
                if (caracter>='0'&& caracter<='9') {
                System.out.println("El caracter " + caracter + " es caracter digito");
                }
                else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println("El caracter " + caracter + " es vocal minuscula");
                }
             }
            while(caracter!='*');
        }
        catch(Exception exc){
           System.out.println(exc);
        }
}
}
