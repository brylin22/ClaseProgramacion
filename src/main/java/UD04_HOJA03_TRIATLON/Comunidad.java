/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA03_TRIATLON;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Comunidad {
    private String nombre;
    private String nose;
    private int np;
    private String[] provincias;
    
    public Comunidad(){
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el nombre de la comunidad: ");
        this.nombre = t.nextLine();
        System.out.println("Introduce el numero de provincias que tiene la comunidad: ");
        this.np = t.nextInt();
        provincias = new String[np];
        for(int i = 0; i<=provincias.length;i++){
            System.out.println("Introduce el nombre de la provinicas nRo " + (i+1) + " :");
            provincias[i] = t.next();
        
        
        }
        System.out.println("Comunidad de " + nombre + " ha sido completada");
    
    
    }
    public String mostrar(){
        String txt="";
        txt = txt + nombre.toUpperCase();
        for(int i = 0; i<provincias.length; i++){
            if(provincias[provincias.length-1-i].length()>=4){
                txt+= " " + provincias[provincias.length-1-i].substring(0, 4);
            }else{
                txt+= " dimension " + provincias[provincias.length - 1 - i];
            }
        }
        
        return txt;
    }
    public String sorteo(){
            
        return provincias[(int)Math.random()*(provincias.length)];
            
            
    }

    public int buscar(String nombre){
        boolean encontrado = false;
        int posicion = -1;
        
        for(int i= 0;(i<provincias.length && !encontrado); i++){
            if(nombre.equalsIgnoreCase(provincias[i])){
                encontrado = true;
                posicion = i;
                
            }
        }
        return posicion;
    }



}
    




