/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA07;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Alumno {
    
    private String nombre, alumno;
    private int notas[];

    public Alumno(String nombre, String alumno, int[] notas) {
        this.nombre = nombre;
        this.alumno = alumno;
        this.notas = notas;
    }
    public Alumno(){
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del alumno: ");
        this.nombre = t.nextLine();
        System.out.println("Introduce el numero de notas: ");
        notas = new int [t.nextInt()];
        
        for(int i = 0; i<notas.length;i++){
            System.out.println("Introduce el la nota, para la nota Nro." + (i+1));
            notas[i] = t.nextInt();
            
            
        }
        
        
    }
    public int mayor(){
        int numero = 0;
        for(int i = 0; i<notas.length;i++){
            numero = notas[i]>notas[i+1]? notas[i]:notas[i+1];
            for(int f = 0; f<notas.length;i++){
                
                numero = numero>notas[f]? numero:notas[f];
                
            }
        }
        return numero;
    }
    
    
}
