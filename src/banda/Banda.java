/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

/**
 *
 * @author conizunino
 */
public class Banda {

    String nombre;
    int edad;  
    String instrumento;
    String estilo;
        
    
    public Banda (String nombre, int edad, String instrumento, String estilo){
        
        System.out.println("Constructor con parametros");
        System.out.println("");
        
        this.nombre = nombre;
        this.edad = edad;
        this.instrumento = instrumento;
        this.estilo = estilo;
        
    }
    
    public void datosxconsola (){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Instrumento: "+instrumento);
        System.out.println("Estilo: "+estilo);
    }
   
    
  
  }

    

    

