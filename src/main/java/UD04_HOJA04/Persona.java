/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre =nombre;
        this.edad = edad;
        
    }
    public void imprimir(){
        System.out.println("DATOS DE LA PERSONA ");
        System.out.println("El nombre de la persona es " + nombre);
        System.out.println("Laa edad " + edad + "anos");
        
    
    
    
    }
    public boolean esMayorEdad(){
        return edad >= 18;
    }
}