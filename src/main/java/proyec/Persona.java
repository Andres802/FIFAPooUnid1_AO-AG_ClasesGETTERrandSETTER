/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Persona {
    
    private String nombre;
    private int fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public String moatrarInfo(){
        
        return this.nombre + " nacio en el year " + this.fechaNacimiento;
        
    }
    
}
