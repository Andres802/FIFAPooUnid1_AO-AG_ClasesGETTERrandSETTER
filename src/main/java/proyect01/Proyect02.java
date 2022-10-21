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
        
        System.out.println("----------------- Vector ------------------");
        var arreglo = new Arreglo();
        var vector1= arreglo.crearVector(5);
        var vector2= arreglo.crearVector(5);
        
        var vectorSumado = arreglo.sumaVector(vector1, vector2);
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(vector2[i]);
        }
        System.out.println("" + vector1 + "+" + vector2 + " =" + vectorSumado);
        
        System.out.println("------------------ Matriz -----------------");
        var matriz1= arreglo.crearMatriz(3,3);
        var matriz2= arreglo.crearMatriz(3,3);
        var matrizSumado = arreglo.sumaMatriz(matriz1.length, matriz2.length);
        
        System.out.println("" + matrizSumado);
        for (int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j<matriz2.length;j++){
            System.out.println(matriz1[i][j]);
            
        }
        }
        
        
       /* System.out.println(" -----------------------------------------------------");
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
            arregl[i] = nm;
            System.out.println(nm);
        }
        for (i = 0; i < numeros; i++) {
            System.out.println("sus nuemros ingresados son " + arregl[i]);
        }

        System.out.println("Ingrese el número de filas que tendrá la matriz");
        var filas = lectura.nextInt();
        System.out.println("Ingrese el número de columnas que tendrá la matriz");
        var columnas = lectura.nextInt();

        var matriz = new int[2][3];

        System.out.println("Ingrese el valor correspondiente a la posición 0,0");
        matriz[0][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,1");
        matriz[0][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,2");
        matriz[0][2] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,0");
        matriz[1][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,1");
        matriz[1][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,2");
        matriz[1][2] = lectura.nextInt();

        System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
        System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);

        var matriz1 = new int[2][3];
        matriz[0][0] = 00;
        matriz[0][1] = 01;
        matriz[0][2] = 02;
        matriz[1][0] = 10;
        matriz[1][1] = 11;
        matriz[1][2] = 12;

        while (i < matriz.length) {
            var j = 0;
            while (j < matriz[i].length) {
                System.out.println(matriz[i][j]);
                j++;
            }
            i++;
        }
        for (i = 0; i < matriz.length; i++) {
            for (var j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] * 10);
            }
        }
        for (int x1[] : matriz1) {
            for (var y : x1) {
                System.out.println(y * 100);
            }
        }

        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isAlphabetic('C'));*/
    }
}
