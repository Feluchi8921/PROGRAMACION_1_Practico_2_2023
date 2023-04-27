import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_12 {
    public static void main (String []args){
        char c, menor='z', mayor='a';
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Ingrese un caracter: ");
                c = entrada.readLine().charAt(0);
                if('a'<=c && c <= 'z'){
                if(c<=menor){
                    menor=c;
                }
                else if(c>=mayor){
                    mayor=c;
                }
                }
            }
            while (('a' <= c) && (c <= 'z'));
            System.out.println("La letra minuscula menor que ha ingresado es: "+menor+" y la mayor: "+mayor);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
