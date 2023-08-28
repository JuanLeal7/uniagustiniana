import java.util.Scanner;
public class main {

    private static String carre;

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        estudiante agustiniana[] = new estudiante[7];
        
        
        agustiniana[0]=new estudiante("Desarrollo","Juan Pablo Leal",49);
        agustiniana[1]=new lenguas("cuarto","lenguas modernas","Juana Martinez",48);
        agustiniana[2]=new teleco("Segundo","Telecomunicaciones","Santiago herrera",48,18);
        agustiniana[3]=new gastronomia("Mazamorra paisa","gastronomia","Hugo Alejandro",47);
        agustiniana[4]=new arquitectura("Los grillos","Arquitectura","Sebastian Ortiz",46);
        agustiniana[5]=new cineytv("stutz","Cine y Tv","Juian Garnica",48);
        agustiniana[6]=new hoteleria("Primero","Hoteleria y turismo","Ana Lisa Melo",47,"hotel transilvania");
        
        System.out.println("Estudiantes con mejor desempeño de la agustiniana");
        for (estudiante estudiante:agustiniana){
            
            System.out.print( estudiante.mostrardatos());
            System.out.println(" ");
            
        } 
        
        
        System.out.println("seleccione la opcion ");
        System.out.println("1:comparar notas");
         System.out.println("2:comparar carreras");
         int dato = scanner.nextInt();
        sobrecarga carga=new sobrecarga();
     switch(dato){
         case 1 -> carga.comparacion();
         case 2 -> carga.comparacion(carre);
         default -> System.out.println("error");
         
            
         
     }
    }
}
