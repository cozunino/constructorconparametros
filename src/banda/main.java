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
public class main {
    
        public static void main(String[] args) {
       
        Banda integrante1 = new Banda("Federico", 36, "Bateria", "Jazz");
        integrante1.datosxconsola();
       
         Banda integrante2 = new Banda("Juan", 28, "Guitarra", "Rock");
        integrante2.datosxconsola();
        
         Banda integrante3 = new Banda("Pedro", 32, "Bajo", "Jazz");
        integrante3.datosxconsola();
        
         Banda integrante4 = new Banda("Valentino", 34, "Voz", "Rock");
        integrante4.datosxconsola();
        
         Banda integrante5 = new Banda("Julian", 31, "Guitarra", "Jazz");
        integrante5.datosxconsola();
      
    }
    
}
