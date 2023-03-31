import java.util.Scanner;

public class Reto2 {
    public static void main(String [] args) {
        //declaramos las variables 
        
        // instanciar clase
        Scanner lectura=new Scanner(System.in);
        //solicitamos datos

        System.out.println(" Centro de salud famisalud ");
        System.out.println("Datos requeridos ");
        
        System.out.println("Porfavor ingrese en nombre de la mama");

        String $nom_mama = lectura.nextLine();
        

        System.out.println("Porfavor ingrese en nombre de la bebe");

        String $nom_bebe=lectura.nextLine();
       
        System.out.println("Porfavor ingrese en nombre de la vacuna");

        String $nom_vacuna=lectura.nextLine();
        
        System.out.println("Porfavor ingrese los meses del bebe");

        double $meses_del_bebe= lectura.nextDouble();
        
        System.out.println("Porfavor ingrese el peso del bebe");

        double $peso_del_bebe= lectura.nextDouble();

        double $dosis_vacuna = (($peso_del_bebe + 10 ) / ($meses_del_bebe * 10)) * 8 ;
        System.out.println("la dosis del bebe seria:"  + $dosis_vacuna);
        lectura.close();
         
        
    }
}
