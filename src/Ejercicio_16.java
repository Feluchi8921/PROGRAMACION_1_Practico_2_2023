/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de ‘a’ seguidas que se ingresaron.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_16 {
    public static final int MAX=6;
    public static void main (String []args){
        char c;
        int contador=1;
        int arrchar[] = new int [MAX];
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i=0;i<MAX;i++){
                System.out.println("Ingrese un caracter");
                c=entrada.readLine().charAt(0);
                arrchar[i]=c;
                }
            for(int i=0;i<MAX;i++){
                if(arrchar[i]=='a' && arrchar[i++]=='a'){
                    contador++;
                    break;
                }
                else{
                    contador=0;
                }
            }
            System.out.println("La cantidad de 'a' seguidas ingresadas es: "+contador);

        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
