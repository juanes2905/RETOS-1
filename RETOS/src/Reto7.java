import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int aleatorio = 0;
        int res, apuesta ;
        String nom ;
        int acum =0, acum1 =0;
        char co = 1;
        Scanner capturar = new Scanner (System.in);
        do {
             System.out.println("escriba su nombre jugador  "  );
        nom = capturar.next();
        System.out.println("escriba la cantidad de su apuesta ");
        apuesta = captura.nextInt();
        System.out.println("escoja:\n 1 si es para piedra \n 2 si es para papel \n 3 si es para tijeras ");
        res = capturar.nextInt();
        System.out.println("espere esta en juego.........");
        aleatorio = (int)(Math.random()*2)+1;
        if (aleatorio==1 && res == 1){
            System.out.println("usted le gano a la pc sacando piedra"+ nom + "gano");
            acum=acum+(apuesta*2);
        } else if (aleatorio==2 && res==2){
            System.out.println("usted le gano a la pc sacando papel "+ nom + "gano");
            acum=acum+(apuesta*2);
        } else if (aleatorio==3 && res==3){
            System.out.println("usted le gano a la pc sacando tijeras "+ nom + "gano");
            acum=acum+(apuesta*2);
        }
        // hasta aqui usted gana 
        else if (aleatorio ==1 && res==2){
            System.out.println("salio piedra usted perdio gano la pc "+ nom);
            acum1=acum1+(apuesta-apuesta);

        } else if (aleatorio == 2 && res==1){
            System.out.println("salio papel usted perdio gano la pc " + nom);
            acum1=acum1+(apuesta-apuesta);
        } else  if (aleatorio == 3  && res== 2 ){
            System.out.println("salio tijeras usted perdio gano la pc " + nom);
            acum1=acum1+(apuesta-apuesta);
        }
        capturar.nextLine();
        System.out.println("escriba s si quiere seguir jugando o otra tecla para no jugar ");
        co=capturar.next().charAt(0);
       
        System.out.println("el dinero que gano es : " +acum);
         System.out.println("la veces que jugo son :" +co);
        } while (co=='s' && co=='S' );
       
       captura.close();
    }
     
}
