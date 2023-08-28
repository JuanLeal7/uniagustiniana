package com.mycompany.uniagustiniana;

public class hoteleria extends estudiante{
 private String semestre,CEO;
 
    public hoteleria(String semestre, String carrera, String nombre, int promedio,String CEO) {
        super(carrera, nombre, promedio);
        this.semestre = semestre;
        this.CEO = CEO;
    }

    public String getsemestre() {
        return semestre;
    }

    public String getCEO() {
        return CEO;
    }
     @Override
    public String mostrardatos(){
        return "\nCarrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio+
                "\nCEO: "+CEO+
                "\nSemestre: "+semestre;
    }
    
    
} 
   

