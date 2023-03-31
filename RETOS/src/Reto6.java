import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        String a,b,c;
        int aleatorio = 0;
        int res, ap , acum = 0, acum1 = 0 ;
        String nom ;
        char co = 1;
        Scanner capturar = new Scanner (System.in);
        do {
            System.out.println("escriba su nombre jugador  "  );
        nom = capturar.next();
        System.out.println("Escriba la cantidad de su apuesta");
        ap = capturar.nextInt();
        System.out.println("escoja: \n 1 si espara cara \n 2 si es para sello");
        res = capturar.nextInt();
        System.out.println("espere la moneda se esta lanzando.....en juego....");
        aleatorio = (int)(Math.random()*2)+1;

        if (aleatorio==1 && res == 1){
            System.out.println("salio cara"+ nom + "gano");
            acum=acum+(ap*2);
        } else if (aleatorio==2 && res==2){
            System.out.println("salio sello "+ nom + "gano");
            acum=acum+(ap*2);
            // acum1
        } else if (aleatorio ==1 && res==2){
            System.out.println("salio cara usted perdio "+ nom);
            acum1=acum1+(ap-ap);
        } else if (aleatorio == 2 && res==1){
            System.out.println("salio sello  usted perdio " + nom);
            acum1=acum1+(ap-ap);
        }
           capturar.nextLine();
           System.out.println("escriba s si quiere seguir jugando o otra tecla para no jugar ");
           co=capturar.next().charAt(0);
          
           System.out.println("el dinero que gano es : " +acum);
            System.out.println("la veces que jugo son :" +co);
        } while (co=='s' && co=='S' );
        
         capturar.close();
    }
}
