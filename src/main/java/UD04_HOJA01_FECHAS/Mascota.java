/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA01_FECHAS;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author DAW106
 */
public class Mascota {
    private String nombre;
    private LocalDate fechaNacimiento;
    
    public Mascota(String nombre, int year, int mes, int dia){
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.of(year, mes, dia);
    }
    public int getEdad(){
        int edad;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    
    public String getNombre(){
        return nombre;
    }
}
