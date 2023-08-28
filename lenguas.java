package com.mycompany.uniagustiniana;
public class lenguas extends estudiante{
    private String semestre;

    public lenguas(String semestre, String carrera, String nombre, int promedio) {
        super(carrera, nombre, promedio);
        this.semestre = semestre;
        
    }

    public String getsemestre() {
        return semestre;
    }

   
    
    @Override
    public String mostrardatos(){
        return "\nCarrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio+
                "\nSemestre: "+semestre;
                
    }
    
}

    


