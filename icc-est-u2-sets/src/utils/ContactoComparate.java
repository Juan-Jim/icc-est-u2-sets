package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparate implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        
       // Primero comparo por el apellido alfabeticamente
       int resultComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());

       //si los apellidos son igual es comparare por el nombre
       if(resultComparacionApellido != 0) {
            return resultComparacionApellido;
       }

       int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());       
       return resultComparacionNombre;
    }

    
    
}
