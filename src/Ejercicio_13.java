import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_13 {
    public static void main (String []args){
        char c;
        int numero;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            c=entrada.readLine().charAt(0);
            while(c>='a' && c<='z'){
                System.out.println("Ingrese un numero: ");
                numero=Integer.valueOf(entrada.readLine());
                if(numero>=1 && numero<=5){
                    System.out.println("La tabla de multiplicar del: "+numero+" es");
                    for(int i=0; i<=10;i++){
                        System.out.println(numero+" * "+i+"= "+(numero*i));
                    }
                }
                System.out.println("Ingrese un caracter: ");
                c=entrada.readLine().charAt(0);
           }

        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
