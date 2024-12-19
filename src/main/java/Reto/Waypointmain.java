package Reto;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DAW106
 */
public class Waypointmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        //private RETO retoPerteneciente;
        int distancia;
        TipoWaypoint Tipo;
        String Foto;
        double latitud;
        double longitud;
        System.out.println("Distancia Waypoint: ");
        distancia = t.nextInt();
        System.out.println("Latitud: ");
        latitud = t.nextDouble();
        System.out.println("Longitud: ");
        longitud = t.nextDouble();
        System.out.println("");
        Waypoint brel = new Waypoint(distancia, TipoWaypoint.WAYPOINT, "url", latitud, longitud  );
        
        brel.VerWaypoint();
        
    }
    
}
