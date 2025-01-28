/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA08;

/**
 *
 * @author DAW106
 */
public class Ciudad {
    private String ciudad;
    private double latitud, longitud;
    private int habitantes;

    public Ciudad(String ciudad, double latitud, double longitud, int habitantes) {
        this.ciudad = ciudad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.habitantes = habitantes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ciudad=" + ciudad + ", habitantes=" + habitantes + '}';
    }
    
    
    
    
    
}
