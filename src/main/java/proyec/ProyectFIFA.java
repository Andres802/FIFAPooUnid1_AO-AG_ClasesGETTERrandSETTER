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
        ecuador.codigoFIFA = "ECU";
        ecuador.nombre = "Federacion Ecuatoriana de Futbol (FEF)";
        ecuador.participacionesMundial = 4;
        System.out.println(ecuador.obtienePais());

        var brasil = new Seleccion();
        brasil.codigoFIFA = "BRA";
        brasil.nombre = "Confederacion Brasileña de Futbol (CBF)";
        System.out.println(brasil.obtienePais());

        var arg = new Seleccion();
        arg.codigoFIFA = "ARG";
        arg.nombre = "Federación Argentina de Fútbol (FAF)";
        arg.participacionesMundial = 9;
        System.out.println(arg.obtienePais());

        System.out.println("-------------------- DIRECTOR --------------------");
        var TC1 = new Director();
        TC1.nombre = "Gustavo Alfaro";
        TC1.yearIngreso = 2010;
        TC1.equipo = ecuador;
        System.out.println("1. " + TC1.mostrarInfo());

        var TC2 = new Director();
        TC2.nombre = "Carlos Caetano Bledorn";
        TC2.yearIngreso = 2016;
        TC2.equipo = brasil;
        System.out.println("2. " + TC2.mostrarInfo());

        var TC3 = new Director();
        TC3.nombre = " Lionel Scaloni";
        TC3.yearIngreso = 2017;
        TC3.equipo = arg;
        System.out.println("3. " + TC3.mostrarInfo());

        System.out.println("-------------------- JUGADORES --------------------");
        var enner = new Jugador();
        enner.nombre = "Enner Valencia";
        enner.posicion = "Goleador";
        enner.fechaNacimiento = 1989;
        enner.equipo = ecuador;
        enner.TC = TC1;
        enner.equip = "Fenerbahçe S. K";
        System.out.println("1. " + enner.mostrarInfo());

        var silva = new Jugador();
        silva.nombre = "Thiago Silva";
        silva.posicion = "Defensa";
        silva.fechaNacimiento = 1984;
        silva.TC = TC2;
        silva.equip = "Chelsea";
        silva.equipo = brasil;
        System.out.println("2." + silva.mostrarInfo());

        var reyMessi = new Jugador();
        reyMessi.nombre = "Lionel Messi";
        reyMessi.posicion = "DC";
        reyMessi.fechaNacimiento = 1987;
        reyMessi.TC = TC3;
        reyMessi.equip = "PSG";
        reyMessi.equipo = arg;

        System.out.println("3." + reyMessi.mostrarInfo());

    }
}
