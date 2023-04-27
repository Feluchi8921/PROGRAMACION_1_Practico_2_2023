import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_9 {
    public static void main(String[] args) {
        char c;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Ingrese un caracter: ");
                c = entrada.readLine().charAt(0);
                if (c>='0'&& c<='9') {
                    System.out.println("El caracter " + c + " es digito");
                }
                else if(c>='a'&&c<='z'){
                    if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                        System.out.println("El caracter " + c + " es vocal");
                    }
                    else{
                        System.out.println("El caracter " + c + " es consonante");
                    }
                }

            }
            while ((c>='0'&& c<='9')||(c>='a'&&c<='z'));
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
