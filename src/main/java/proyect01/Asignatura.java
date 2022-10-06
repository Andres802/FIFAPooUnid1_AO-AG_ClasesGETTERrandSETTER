/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect01;

/**
 *
 * @author ochoa
 */
public class Asignatura {
    
    boolean virgente;
    int codigo;
    String nombre;
    int horas;
    String nombreDocente;
    double costoHora;
    
   String mostrarInformacion(){
       var retorno = "la asignatura es:" + this.nombre + " el docente es: " + this.nombreDocente + " y la asignatura cuesta: " +this.calcular();
       return retorno;
   } 
   
   public double calcular(){
      var retorno = this.costoHora * this.horas;
      return retorno;
    }
    
    
}
