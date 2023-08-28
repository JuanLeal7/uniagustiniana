package com.mycompany.uniagustiniana;

public class teleco extends estudiante{
private String semestre;
private int edad;
    public teleco(String semestre, String carrera, String nombre, int promedio,int edad) {
        super(carrera, nombre, promedio);
        this.semestre = semestre;
        this.edad = edad;
    }

    public String getsemestre() {
        return semestre;
    }

    public int getedad() {
        return edad;
    }
     @Override
    public String mostrardatos(){
        return "\nCarrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio+
                "\nEdad: "+edad+
                "\nSemestre: "+semestre;
    }
    
    
}
