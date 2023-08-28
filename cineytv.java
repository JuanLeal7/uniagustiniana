package com.mycompany.uniagustiniana;

public class cineytv extends estudiante{
    private String documental;

    public cineytv(String documental, String carrera, String nombre, int promedio) {
        super(carrera, nombre, promedio);
        this.documental = documental;
        
    }

    

    public String getdocumental() {
        return documental;
    }

   
     @Override
    public String mostrardatos(){
        return "\nCarrera: "+carrera+
                "\nNombre: "+nombre+
                "\nPromedio: "+promedio+
                "\nDocumental: "+documental;
              
    }
    
}


