/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto;

/**
 *
 * @author DAW106
 */
public class Waypoint {
    private int numWaypoint = 0;
    //private RETO retoPerteneciente;
    private int distancia;
    private TipoWaypoint Tipo;
    private String Foto;
    private double latitud;
    private double longitud;

    public Waypoint(int distancia, TipoWaypoint Tipo, String Foto, double latitud, double longitud) {
        this.numWaypoint++;
        this.distancia = distancia;
        this.Tipo = Tipo;
        this.Foto = Foto;
        this.latitud = latitud;
        this.longitud = longitud;
        this.Tipo = Tipo.WAYPOINT;
    }
    public void VerWaypoint(){
        System.out.println("Numero del Waypoint: " + numWaypoint);
        System.out.println("Distancia del inicio: " + distancia);
        System.out.println("Coordenadas: Latitud = " + latitud + " y Longitud = " + longitud);
        System.out.println("Tipo de Waypoint: " + Tipo.WAYPOINT);
        System.out.println("Foto de Waypoint: " + Foto);
    }

 
    
    
}
