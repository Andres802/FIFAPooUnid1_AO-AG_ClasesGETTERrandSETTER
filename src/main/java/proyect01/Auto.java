/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect01;

/**
 *
 * @author ochoa
 */
public class Auto {
 
    String placa;
    String marca;
    String nombrePropietario;
    
    
    public String mostrarInfo() {
    
        var retorno ="El auto tiene placa " + this.placa + " es de marca " + this.marca +" y el propietario es: "+ this.nombrePropietario;
        
        
       return retorno;
}
 
     public String getProvincia() {
    
         
         
         
        var retorno ="";
        
        
       return retorno;
}
     
         public String getPaisMarca() {
    
        var retorno ="";
    
        if(this.marca.equals("Chevrolet")){
             retorno = "EEUU";
             
         }else {
            if(this.marca.equals("Toyota")){
             retorno = "Japon";
        }else{
                retorno = "No definido";
            }
        }
       return retorno;
}
   
       public int getNumeroContinente() {
    
        var retorno =0;
        
        
       return retorno;
}
}
