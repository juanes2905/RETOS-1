import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int aleatorio = 0;
        int res ;
        String nom ;
        Scanner capturar = new Scanner (System.in);
        System.out.println("escriba su nombre jugador  "  );
        nom = capturar.next();
        System.out.println("escoja:\n 1 si es para piedra \n 2 si es para papel \n 3 si es para tijeras ");
        res = capturar.nextInt();
        System.out.println("espere esta en juego.........");
        aleatorio = (int)(Math.random()*2)+1;
        if (aleatorio==1 && res == 1){
            System.out.println("usted le gano a la pc sacando piedra"+ nom + "gano");
        } else if (aleatorio==2 && res==2){
            System.out.println("usted le gano a la pc sacando papel "+ nom + "gano");
        } else if (aleatorio==3 && res==3){
            System.out.println("usted le gano a la pc sacando tijeras "+ nom + "gano");
        }
        // hasta aqui usted gana 
        else if (aleatorio ==1 && res==2){
            System.out.println("salio piedra usted perdio gano la pc "+ nom);
        } else if (aleatorio == 2 && res==1){
            System.out.println("salio papel usted perdio gano la pc " + nom);
        } else  if (aleatorio == 3  && res== 2 ){
            System.out.println("salio tijeras usted perdio gano la pc " + nom);
        }
       captura.close();
    }
     
}