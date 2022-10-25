/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Jugador {

    String nombre;
    int fechaNacimiento;
    String posicion;
    Seleccion equipo;
    String equip;
    Director TC;

    public String mostrarInfo() {
        return this.nombre + " jugador de " + this.equip + " juega en la selección de " + this.equipo.nombre + " su fecha de nacimineto es " + this.fechaNacimiento + " y su director actual de la seleccion es " + this.TC.nombreC;
    }

}
