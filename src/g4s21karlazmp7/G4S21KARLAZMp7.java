/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21karlazmp7;

import informacion.Datos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KJS
 */
public class G4S21KARLAZMp7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List<Datos> Listadatos = new ArrayList<Datos>();
    Datos objdatos = new Datos("FERNANDO GOMEZ", 23, "FER@GMAIL.COM");
    Listadatos.add(objdatos);
    objdatos = new Datos();
    objdatos.setNombre("Armando Sanchez");
    objdatos.setCorreo("armando@gmail.com");
    Listadatos.add(objdatos);
    objdatos = new Datos("wendy sanchez", 22,"wendy@gmail.com");
    Listadatos.add(objdatos);
    
    for(Datos datos: Listadatos){
    System.out.println("nombre" + datos.getNombre());
    System.out.println("edad" + datos.getEdad());
    System.out.println("correo" +datos.getCorreo());
    System.out.println(" ");
    }
   
    System.out.println("-----------------------------------------");
    System.out.println("USANDO FOR EACH");
    System.out.println("-----------------------------------------");
    
    
    Listadatos.forEach(datos->{
    System.out.println("nombre" + datos.getNombre());
    System.out.println("edad" + datos.getEdad());
    System.out.println("correo" +datos.getCorreo());
    System.out.println(" ");
    });
    
     System.out.println("-----------------------------------------");
    System.out.println("USANDO STREAM FOR EACH");
    System.out.println("-----------------------------------------");
    
    Listadatos.stream().forEach(datos->{
    System.out.println("nombre" + datos.getNombre());
    System.out.println("edad" + datos.getEdad());
    System.out.println("correo" +datos.getCorreo());
    System.out.println(" ");    
    });
            
   
    
    
    }
    
}
