import java.util.Scanner;



public class Reto3 {
    public static void main(String[] args) {
         Scanner capturar = new Scanner (System.in);
        int aleatorio = 0;
        int res ;
        String nom ;
        System.out.println("escriba su nombre jugador  "  );
        nom = capturar.next();
        System.out.println("escoja 1 si espara cara 2 si es para sello");
        res = capturar.nextInt();
        System.out.println("espere la moneda se esta lanzando.....en juego....");
        aleatorio = (int)(Math.random()*2)+1;
        if (aleatorio==1 && res == 1){
            System.out.println("salio cara"+ nom + "gano");
        } else if (aleatorio==2 && res==2){
            System.out.println("salio sello "+ nom + "gano");
        } else if (aleatorio ==1 && res==2){
            System.out.println("salio cara usted perdio "+ nom);
        } else if (aleatorio == 2 && res==1){
            System.out.println("salio sello  usted perdio " + nom);
        }
      
         capturar.close();
    }
}
