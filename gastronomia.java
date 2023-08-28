package com.mycompany.uniagustiniana;

public class gastronomia extends estudiante{
     private String plato;

    public gastronomia(String plato, String carrera, String nombre, int promedio) {
        super(carrera, nombre, promedio);
        this.plato = plato;
        
    }

    public String getplato() {
        return plato;
    }

    
     @Override
    public String mostrardatos(){
        return "\nCarrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio+
                "\nEspecialidad: "+plato;
                
    }
    
}

