/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec;

/**
 *
 * @author ochoa
 */
public class Seleccion {

    private String codigoFIFA;
    private String nombre;
    private String pais;
  private  int participacionesMundial;
    Director director;

    public String obtienePais() {

        var retorno = "Desconocido";
        switch (getCodigoFIFA()) {
            case "ECU":
                retorno = "ECUADOR";
                break;

            case "ARG":
                retorno = "ARGENTINA";
                break;

            case "BRA":
                retorno = "BRASIL";
                break;
            case "CHI":
                retorno = "CHILE";
                break;

            default:
                throw new AssertionError();
        }
        return retorno;
    }
    public String mostrarInfo(){
        return "El nombre de la seleccion es " + this.getNombre() + " su codigo de Fifa es " + this.getCodigoFIFA() + " que es de " + this.obtienePais() + " su numero de participacion al mundial es " + this.getParticipacionesMundial() + " y el director del equipo es " + this.director.getNombreC(); 
    }

    public String getCodigoFIFA() {
        return codigoFIFA;
    }

    public void setCodigoFIFA(String codigoFIFA) {
        this.codigoFIFA = codigoFIFA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getParticipacionesMundial() {
        return participacionesMundial;
    }

    public void setParticipacionesMundial(int participacionesMundial) {
        this.participacionesMundial = participacionesMundial;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    

}
