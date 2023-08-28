package com.mycompany.uniagustiniana;
public class arquitectura extends estudiante{
    private String proyecto;

    public arquitectura(String proyecto,String carrera, String nombre, int promedio) {
        super(carrera, nombre, promedio);
        this.proyecto = proyecto;

    }

    public String getproyecto() {
        return proyecto;
    }

    
     @Override
    public String mostrardatos(){
        return "\nCarrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio+
                "\nProyecto: "+proyecto;
                
    }
}