/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Empleado {
    
    private String nombre;
    private double sueldo;

    public void getNombre() {
        System.out.println("El nombre del empleado es: " + nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void getSueldo() {
        System.out.println("El sueldo del empleado es: " + sueldo);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void imprimirDatos(){
        getNombre();
        getSueldo();
    }
    
    public void pagaImpuestos(){
        if(sueldo>3000){
            System.out.println("Debe pagar impuestos.");
        }else{
            System.out.println("No debe pagar impuestos.");
        }
    }
    
    
}
