/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Director {

    String nombre;
    int yearIngreso;
    Seleccion equipo;

    public String mostrarInfo() {

        return "El director se llama " + this.nombre + " dirige en la selecion " + this.equipo.nombre + " desde " + this.yearIngreso;

    }
}
