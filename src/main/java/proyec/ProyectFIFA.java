/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class ProyectFIFA {

    public static void main(String[] args) {

        System.out.println("-------------------- SELECCION --------------------");
        var ecuador = new Seleccion();
        ecuador.setCodigoFIFA ("ECU");
        ecuador.setNombre ("Federacion Ecuatoriana de Futbol (FEF)");
        ecuador.setParticipacionesMundial (4);
        
        System.out.println(ecuador.obtienePais());
        

        var brasil = new Seleccion();
        brasil.setCodigoFIFA ("BRA");
        brasil.setNombre ("Confederacion Brasileña de Futbol (CBF)");
        brasil.setParticipacionesMundial(1);
        
        System.out.println(brasil.obtienePais());

        var arg = new Seleccion();
        arg.setCodigoFIFA ("ARG");
        arg.setNombre ("Federación Argentina de Fútbol (FAF)");
        arg.setParticipacionesMundial (9);
        
        System.out.println(arg.obtienePais());

        System.out.println("-------------------- DIRECTOR --------------------");
        var TC1 = new Director();
        TC1.setNombre("Gustavo Alfaro");
        TC1.setYearIngreso(2010);
        TC1.equipo = ecuador;
        
        System.out.println("1. " + TC1.mostrarInfo());

        var TC2 = new Director();
        TC2.setNombre("Carlos Caetano Bledorn");
        TC2.setYearIngreso(2016);
        TC2.equipo = brasil;
        
        System.out.println("2. " + TC2.mostrarInfo());

        var TC3 = new Director();
        TC3.setNombre(" Lionel Scaloni");
        TC3.setYearIngreso(2017);
        TC3.equipo = arg;
        
        System.out.println("3. " + TC3.mostrarInfo());

        System.out.println("-------------------- JUGADORES --------------------");
        var enner = new Jugador();
        enner.setNombre ("Enner Valencia");
        enner.setPosicion ("Goleador");
        enner.setFechaNacimiento (1989);
        enner.equipo = ecuador;
        enner.TC = TC1;
        enner.setEquip ("Fenerbahçe S. K");
        
        System.out.println("1. " + enner.mostrarInfo());

        var silva = new Jugador();
        silva.setNombre ("Thiago Silva");
        silva.setPosicion("Defensa");
        silva.setFechaNacimiento(1984);
        silva.TC = TC2;
        silva.setEquip("Chelsea");
        silva.equipo = brasil;
        
        System.out.println("2." + silva.mostrarInfo());

        var reyMessi = new Jugador();
        reyMessi.setNombre("Lionel Messi");
        reyMessi.setPosicion( "DC");
        reyMessi.setFechaNacimiento (1987);
        reyMessi.TC = TC3;
        reyMessi.setEquip("PSG");
        reyMessi.equipo = arg;
        

        var persona = new Persona();
        persona.setNombre("Andres");
        persona.setFechaNacimiento(1992);
        System.out.println("3." + reyMessi.mostrarInfo());
        

        System.out.println("-------------------- Info de la Seleccion --------------------");
         ecuador.director = TC1;
         System.out.println("-" + ecuador.mostrarInfo());
         System.out.println(""+ persona.moatrarInfo());
         brasil.director = TC2;
         System.out.println("-" + brasil.mostrarInfo());
         arg.director = TC3;
         System.out.println("-" + arg.mostrarInfo());
         
    }
}
