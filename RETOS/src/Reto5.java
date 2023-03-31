import java.util.Scanner;



public class Reto5 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        int cantidad = 0;
        int precio = 0;
        int total = 0;
        

            System.out.println("Escriba cuantos productos va ah llevar ");
        cantidad = captura.nextInt();
        for(int i=1;i<=cantidad;i++){
            System.out.println("Escriba los precios de los productos");
            precio = captura.nextInt();
        }  
        total = precio + precio ;
        System.out.println("este es el total " + total );
           
        
        
         
        captura.close();
    }
}
