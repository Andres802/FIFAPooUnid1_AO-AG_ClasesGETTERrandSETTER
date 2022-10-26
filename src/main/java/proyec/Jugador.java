/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Jugador extends Persona{

    private int fechaNacimiento;
    private String posicion;
    Seleccion equipo;
    private String equip;
    Director TC;

    public String mostrarInfo() {
        return this.getNombre() + " jugador de " + this.getEquip() + " juega en la selección de " + this.equipo.getNombre() + " su fecha de nacimineto es " + this.getFechaNacimiento() + " y su director actual de la seleccion es " + this.TC.getNombre();
    }

    
 
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public Director getTC() {
        return TC;
        
    }

    
    public void setTC(Director TC) {
        this.TC = TC;
    }
    

}
