/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect01;

/**
 *
 * @author ochoa
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;
    int year;
    String color;
    double precio;

    public String mostrarInfo() {

        var retorno = "El auto tiene placa " + this.placa + " es de marca " + this.marca + " y el propietario es: " + this.nombrePropietario + ", el auto cuesta " + this.precio + " USD y es modelo: " + this.year + " El color es: " + this.color;

        return retorno;
    }

    public String getProvincia() {

        var retorno = "";
        var primeraLetra = "";
        primeraLetra = this.placa.substring(0, 1);

        switch (primeraLetra) {
            case "A":
                retorno = "Azuay";
                break;
            case "P":
                retorno = "Pichincha";
                break;
            case "G":
                retorno = "Guayas";
                break;
            case "U":
                retorno = "Canar";
                break;

            default:
                retorno = "no definido";

        }

        return retorno;
    }

    public String getPaisMarca() {

        var retorno = "";

        if (this.marca.equals("Chevrolet")) {
            retorno = "EEUU";

        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {
                if (this.marca.equals("Mercedes Benz")) {
                    retorno = "Alemania";
                } else {
                    if (this.marca.equals("FIAT")) {
                        retorno = "Italia ";
                    } else {
                        if (this.marca.equals("Jetour")) {
                            retorno = "China";
                        } else {
                            retorno = "no definido";
                        }
                    }
                }
            }
        }

        return retorno;
    }

    public int getNumeroContinente() {

        var retorno = 0;
        var marcaPais = this.getPaisMarca();

        switch (marcaPais) {

            case "EE.UU":
                retorno = 2;
                break;
            case "Japon":
                retorno = 3;
                break;
            case "China":
                retorno = 4;
                break;
            case "Italia":
                retorno = 5;
                break;
             case "Alemania":
                retorno = 6;
                break;
            default:
                retorno = 0;

        }

        return retorno;
    }

    public double calcularIva() {
        var retorno = 0.0d;
        retorno = this.precio * 12;

        return retorno;
    }

    public int calcularEdad(int yearActual) {
        var retorno = 0;

        retorno = yearActual - this.year;

        return retorno;
    }

    // 10% por cada year // 
    //la depreciacion no puede exceder el precio//+
    public double calcularDepreciacion(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);
        retorno = edad * 0.1 * this.precio;

        return retorno;

    }

    public double calcularCostoMatricula(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);

        return retorno;
    }

    public boolean sePuedeAsegurar(int yearActual) {
        var retorno = false;
        var edad = this.calcularEdad(yearActual);
        if (edad <= 5 && this.precio < 1000) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }
    
    public boolean esTaxi(){
        var retorno = false;
        
        if(this.color=="Amarillo"){
            retorno=true;
        }else{
            
        }
        
        return retorno;
        
    }
    
    
}
