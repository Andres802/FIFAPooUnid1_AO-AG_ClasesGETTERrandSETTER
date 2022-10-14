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
        
        System.out.println("---------- CLASE AUTO ----------");
        
        //-------------------------------------------------------//
        System.out.println("1, Primer Auto");
        var auto = new Auto();
        
        auto.marca="Toyota";
        auto.placa="ADC3496";
        auto.nombrePropietario = "Andres";
        auto.color= "azul";
        auto.placa = "ABU123";
        auto.precio = 34;
        auto.year = 2002;
        System.out.println("-La provincia de matricula es: "+ auto.getProvincia());
        System.out.println("-El numero de continente es: " + auto.getNumeroContinente());
        System.out.println("-El auto tiene " + auto.calcularEdad(2022) + " year");
        System.out.println("-El iva del auto es " + auto.calcularIva());
        System.out.println("-El auto es taxi: " + auto.esTaxi());
        System.out.println("-El costo de la matricula es " + auto.calcularCostoMatricula(50));
        System.out.println("-Su carro se puede asegurar? " + auto.sePuedeAsegurar(20000));
        
        System.out.println("-"+auto.mostrarInfo());
        System.out.println("-Su auto fue fabricado en: "+auto.getPaisMarca());
        System.out.println("Su placa es " + auto.esPlacaValida());
        
        //---------------------------------------------------//
        System.out.println("2. Segundo Auto");
        var auto1 = new Auto();
        
        auto1.marca="Chevrolet";
        auto1.placa="BFG3496";
        auto1.nombrePropietario = "Luis";
        auto1.placa = "ABU123";
        auto1.precio = 334;
        auto1.year = 2020;
        auto1.color = "Gris";
        System.out.println("-La provincia de matricula es: "+ auto1.getProvincia());
        System.out.println("-El numero de continente es: " + auto1.getNumeroContinente());
        System.out.println("-El auto tiene " + auto1.calcularEdad(2022) + " year");
        System.out.println("-El iva del auto es " + auto1.calcularIva());
        System.out.println("-El auto es taxi: " + auto1.esTaxi());
        System.out.println("-El costo de la matricula es " + auto1.calcularCostoMatricula(670));
        System.out.println("-Su carro se puede asegurar? " + auto1.sePuedeAsegurar(5000));
        
        System.out.println("-" + auto1.mostrarInfo());
        System.out.println("-Su auto fue fabricado en: "+ auto1.getPaisMarca());
        System.out.println("Su placa es " + auto1.esPlacaValida());
        
        //--------------------------------------------------------//
        System.out.println("3. Tercer Auto");
         var auto2 = new Auto();
        
        auto2.marca="Mercedes Benz";
        auto2.placa="VSD3496";
        auto2.nombrePropietario = "Gabriel";
        auto2.placa = "GBU123";
        auto2.precio = 100;
        auto2.year = 1970;
        auto.color = "Amarillo";
        System.out.println("-La provincia de matricula es: "+ auto2.getProvincia());
        System.out.println("-El numero de continente es: " + auto2.getNumeroContinente());
        System.out.println("-El auto tiene " + auto2.calcularEdad(2022) + " year");
        System.out.println("-El iva del auto es " + auto2.calcularIva());
        System.out.println("-El auto es taxi: " + auto2.esTaxi());
        System.out.println("-El costo de la matricula es " + auto2.calcularCostoMatricula(500));
        System.out.println("-Su carro se puede asegurar? " + auto2.sePuedeAsegurar(76000));
        
        System.out.println("-" + auto2.mostrarInfo());
        System.out.println("-Su auto fue fabricado en: " + auto2.getPaisMarca());
        System.out.println("Su placa es " + auto2.esPlacaValida());
        
        //--------------------------------------------------------------------------//
        System.out.println("4. Cuarto Auto");
        
        var auto3 = new Auto();
        
        auto3.marca="FIAT";
        auto3.placa="UBA3496";
        auto3.nombrePropietario = "Xavier";
        auto3.placa = "ABU123";
        auto3.precio = 50;
        auto3.year = 1999;
        auto3.color = "Rojo";
        System.out.println("-La provincia de matricula es: "+ auto3.getProvincia());
        System.out.println("-El numero de continente es: " + auto3.getNumeroContinente());
        System.out.println("-El auto tiene " + auto3.calcularEdad(2022) + " year");
        System.out.println("-El iva del auto es " + auto3.calcularIva());
        System.out.println("-El auto es taxi: " + auto3.esTaxi());
        System.out.println("-El costo de la matricula es " + auto3.calcularCostoMatricula(40));
        System.out.println("-Su carro se puede asegurar? " + auto3.sePuedeAsegurar(20050));
        
        System.out.println("-" + auto3.mostrarInfo());
        System.out.println("-Su auto fue fabricado en: "+ auto3.getPaisMarca());
        System.out.println("Su placa es " + auto3.esPlacaValida());
        
        //---------------------------------------------------------------------//
        System.out.println("5. Quinto Auto");
      
        var auto4 = new Auto();
        
        auto4.marca="Jetour";
        auto4.placa="PBU3496";
        auto4.nombrePropietario = "Mateo";
        auto4.placa = "UBA333";
        auto4.precio = 44;
        auto4.year = 1983;
        auto4.color = "Amarillo";
        System.out.println("-La provincia de matricula es: "+ auto4.getProvincia());
        System.out.println("-El numero de continente es: " + auto4.getNumeroContinente());
        System.out.println("-El auto tiene " + auto4.calcularEdad(2022) + " year");
        System.out.println("-El iva del auto es " + auto4.calcularIva());
        System.out.println("-El auto es Taxi: " + auto4.esTaxi());
        System.out.println("-El costo de la matricula es " + auto.calcularCostoMatricula(950));
        System.out.println("-Su carro se puede asegurar? " + auto.sePuedeAsegurar(234400));
        
        System.out.println("-" + auto4.mostrarInfo());
        System.out.println("-Su auto fue fabricado en: " + auto4.getPaisMarca());
        System.out.println("Su placa es " + auto4.esPlacaValida());
        
        
    }
    
    
}
