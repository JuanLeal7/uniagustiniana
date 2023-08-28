package com.mycompany.uniagustiniana;

import java.util.Scanner;
public class sobrecarga {
    
    public void comparacion(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("ingrese su promedio");
        int calificacion = tecla.nextInt();
        System.out.println("promedio:"+calificacion);
        
             System.out.println("Juan Leal:49");
             System.out.println("Juana Martinez:48");
             System.out.println("Santiago herrera:48");
             System.out.println("Hugo Alejandro:47");
             System.out.println("Sebastian Ortiz:46");
             System.out.println("Juian Garnica:48");
             System.out.println("Ana Lisa Melo:47");
             
    }
    public void comparacion(String carre){
        Scanner tecla = new Scanner(System.in);
        System.out.println("ingrese su carrera");
        carre = tecla.nextLine();
         System.out.println("carrera:"+carre);
         System.out.println("Juan Leal:desarrollo");
             System.out.println("Juana Martinez:lenguas");
             System.out.println("Santiago herrera:teleco");
             System.out.println("Hugo Alejandro:gastronomia");
             System.out.println("Sebastian Ortiz:arquitectura");
             System.out.println("Juian Garnica:cin y tv");
             System.out.println("Ana Lisa Melo:hoteleria");
             
        
        
    }
}
