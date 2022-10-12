/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyect01;

/**
 *
 * @author ochoa
 */
public class Proyect01 {

       
    public static void main(String[] args) {
        
        System.out.println("Clase 01.01.03");
        System.out.println("hola mundo");
        
        var proga = new Asignatura();
        
        proga.nombre = " Progamacion";
        proga.nombreDocente = "Diego ";
        proga.horas = 23;
        proga.codigo = 123;
        proga.costoHora = 43;
        proga.virgente = true;
        
        System.out.println(proga.mostrarInformacion());
        
        var Calculo = new Asignatura();
        
        Calculo.nombre = " Calculo de Varias Variables";
        Calculo.nombreDocente = "Angel Soto ";
        Calculo.horas = 64;
        Calculo.codigo = 567;
        Calculo.costoHora = 10;
        Calculo.virgente = true;
        
        System.out.println(Calculo.mostrarInformacion());
        
        
        var Circuito = new Asignatura();
        
        Circuito.nombre = " Circuitos Electricos";
        Circuito.nombreDocente = "Luis Fernandez ";
        Circuito.horas = 34;
        Circuito.codigo = 644;
        Circuito.costoHora = 15;
        Circuito.virgente = true;
        
        System.out.println(Circuito.mostrarInformacion());
        
        System.out.println("--------------------------------------------------------------------------------------");
        
        var auto = new Auto();
        
        auto.marca="Chevrolet";
        auto.placa="AGG3496";
        auto.nombrePropietario = "Andres";
    }
    
    
}
