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
        
        System.out.println("1, Primer Auto");
        var auto = new Auto();
        
        auto.marca="Toyota";
        auto.placa="ADC3496";
        auto.nombrePropietario = "Andres";
        
        System.out.println(auto.mostrarInfo());
        System.out.println(auto.getPaisMarca());
        
        System.out.println("2. Segundo Auto");
        var auto1 = new Auto();
        
        auto1.marca="Chevrolet";
        auto1.placa="BFG3496";
        auto1.nombrePropietario = "Luis";
        
        System.out.println("" + auto1.mostrarInfo());
        System.out.println("El pais origen de la marca es "+auto1.getPaisMarca());
        
        System.out.println("3. Tercer Auto");
         var auto2 = new Auto();
        
        auto2.marca="Mercedes Benz";
        auto2.placa="VSD3496";
        auto2.nombrePropietario = "Gabriel";
        
        System.out.println("" + auto2.mostrarInfo());
        System.out.println("El pais origen de la marca es "+auto2.getPaisMarca());
        
        System.out.println("4. Cuarto Auto");
        
        var auto3 = new Auto();
        
        auto3.marca="FIAT";
        auto3.placa="UBA3496";
        auto3.nombrePropietario = "Xavier";
        
        System.out.println("" + auto3.mostrarInfo());
        System.out.println("El pais origen de la marca es "+auto3.getPaisMarca());
        
        System.out.println("5. Quinto Auto");
        var auto4 = new Auto();
        
        auto4.marca="Jetour";
        auto4.placa="PBU3496";
        auto4.nombrePropietario = "Mateo";
        
        System.out.println("" + auto4.mostrarInfo());
        System.out.println("El pais origen de la marca es "+auto4.getPaisMarca());
        
    }
    
    
}
