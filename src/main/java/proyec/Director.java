/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Director extends Persona{

    
    private int yearIngreso;
    Seleccion equipo;

    public String mostrarInfo() {

        return "El director se llama " + this.getNombre() + " dirige en la selecion " + this.equipo.getNombre() + " desde " + this.getYearIngreso();

    }


    public int getYearIngreso() {
        return yearIngreso;
    }

    public void setYearIngreso(int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

}
