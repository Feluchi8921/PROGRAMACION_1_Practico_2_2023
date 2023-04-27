import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_11 {
    public static void main (String []args){
        char c;
        int contador=0;
        try{
           BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Ingrese un caracter: ");
           c=entrada.readLine().charAt(0);
           while(c>='a' && c<='z'){
               System.out.println("Ingrese un caracter: ");
               c=entrada.readLine().charAt(0);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ) {
                  contador++;
              }
           }
            System.out.println("La cantidad de letras minusculas ingresadas son: "+contador);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
