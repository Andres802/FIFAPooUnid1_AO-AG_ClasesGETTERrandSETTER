/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect01;

import java.util.Scanner;

/**
 *
 * @author ochoa
 */
public class Proyect02 {

    public static void main(String[] args) {
        System.out.println(" -----------------------------------------------------");
        var a = 0;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);
        System.out.println(" -----------------------------------------------------");

        while (a < 10) {
            System.out.println("a = " + a);
            a++;
        }
        System.out.println(" -----------------------------------------------------");
        //leer los datos del teclado
        var numero = 0;
        do {

            var lectura = new Scanner(System.in);
            System.out.println("Ingresar numeros menores a 10");
            numero = lectura.nextInt();
            System.out.println("numero = " + numero);
        } while (numero < 10);

        System.out.println(" -----------------------------------------------------");

        var texto = new Scanner(System.in);
        var x = "";
        do {
            System.out.println("Ingrese un texto");
            x = texto.next();
            System.out.println("su palabra ingresado es " + x);

        } while (x.equals("continuar"));

        System.out.println(" -----------------------------------------------------");
        for (var i = 0; i < 10; i++) {
            System.out.println("numero " + i);
        }

        System.out.println(" -----------------------------------------------------");

        var numerosList = new int[5];
        numerosList[0] = 7;
        numerosList[1] = 9;
        numerosList[2] = 11;
        numerosList[3] = 2;
        numerosList[4] = 4;
        System.out.println(numerosList[0]);
        System.out.println(numerosList[1]);
        System.out.println(numerosList[2]);
        System.out.println(numerosList[3]);
        System.out.println(numerosList[4]);

        System.out.println("---------------------for-------------------------");
        for (var i = 0; i < numerosList.length; i++) {
            System.out.println("su numero es: " + numerosList[i]);
        }

        System.out.println(" -----------------------------------------------------");
        var numeroDecimalList = new double[5];
        numeroDecimalList[0] = 8.8;
        numeroDecimalList[1] = 6.8;
        numeroDecimalList[2] = 10.5;
        numeroDecimalList[3] = 7.5;
        numeroDecimalList[4] = 3.7;

        System.out.println(numeroDecimalList[0]);
        System.out.println(numeroDecimalList[1]);
        System.out.println(numeroDecimalList[2]);
        System.out.println(numeroDecimalList[3]);
        System.out.println(numeroDecimalList[4]);

        System.out.println("---------------------for ----------------------");

        for (var i = 0; i < numeroDecimalList.length; i++) {
            System.out.println("su numero es: " + numeroDecimalList[i]);

        }
        System.out.println(" -----------------------------------------------------");
        var nombrePersona = new String[3];
        nombrePersona[0] = "maria";
        nombrePersona[1] = "paula";
        nombrePersona[2] = "andres";

        for (var i = 0; i < nombrePersona.length; i++) {
            System.out.println("su nombres son : " + nombrePersona[i]);
        }

        var nm = 0;
        var numeros = 0;
        var i = 0;
        var lectura = new Scanner(System.in);
        var num = new Scanner(System.in);
        System.out.println("Ingresar la dimension del arreglo");
        numeros = lectura.nextInt();
        var arregl = new int[numeros];
        for (i = 0; i < numeros; i++) {
            System.out.println("Ingrese el numero");
            nm = num.nextInt();
            arregl[i]=nm;
            System.out.println("su numero ingresado son: " + nm);
        }
        for (i = 0; i < numeros; i++) {
            System.out.println("sus nuemros ingresados son " + arregl[i]);
        }

    }
}
