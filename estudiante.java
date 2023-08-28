package com.mycompany.uniagustiniana;

public class estudiante{
    protected String carrera,nombre;
    protected int promedio;

    public estudiante(String carrera, String nombre, int promedio) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getcarrera() {
        return carrera;
    }

    public void setcarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpromedio() {
        return promedio;
    }

    public void setpromedio(int año) {
        this.promedio = año;
    }
    public String mostrardatos(){
        return "Carrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio;
                
        
    }
}
