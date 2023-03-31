import java.net.NetPermission;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        int numero, contador = 0;
        int aleatorio ;
        Scanner capturar = new Scanner(System.in);
        aleatorio =(int)(Math.random()*100) ; // aqui se genera un numero aleatorio 0-100
        do {
            System.out.println("Escriba un numero: ");
            numero = capturar.nextInt();
            if (aleatorio > numero){
                System.out.println("Escribe un numero mayor ");
            } else {
                System.out.println("Escribe un numero menor ");
            }
            contador++;// se aunmenta uno mas al contador 
        } while (numero != aleatorio);
        System.out.println("Felicitaciones adivino el numero " + "\n" + "Estos son sus intentos: " + contador);
    }
}
