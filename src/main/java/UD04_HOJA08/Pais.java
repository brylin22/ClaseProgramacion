/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA08;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Pais {
    
    private String nombre;
    private Ciudad[] ciudades;
    private int nciudades;
    
    
    public Pais(String nombre){
        this.nombre = nombre;
//        ciudades = new Ciudad[25];
        this.nciudades = 0;
    }
    
    public void añadirCiudad(String nombre, int habitantes){
        Scanner t = new Scanner(System.in);
        
        if(nciudades < ciudades.length){
            System.out.println("(DAtos de "+ nombre.toUpperCase());
            System.out.println("Introduce la latitud");
            double latitudCiudad = Double.parseDouble(t.nextLine());
            System.out.println("Introduce la poblacion: ");
            double poblacionCiudad = Double.parseDouble(t.nextLine());
            
            double longitudCiudad = Double.parseDouble(t.nextLine());
            
//            ciudades[nciudades] = new Ciudad(nombre, latitudCiudad, longitudCiudad, poblacionCiudad);
//            this.numeroCiudades++;
        }else{
            System.out.println("No es posible añadir ninguna ciudad más: ");
            
        }
    }
//    public void ciudadMasPoblada2(){
//        Ciudad ciudadMasPoblada = ciudades[0];
//        for(int i = 0; i< this.numeroCiudades;i++){
//            
//        }
//    }
    public void poblacionMedia(){
        if(nciudades == 0){
            System.out.println("No hay ciudades aúnJ");
            
        }else{
            double suma = 0;
            for(int i = 0; i<this.nciudades; i++){
                suma+=ciudades[i].getHabitantes();
            }
        }
    }
    @Override
    public String toString(){
        String msg ="DATOS DE LAS CIUDADES\n";
        for(int i = 0; i<this.nciudades; i++){
            msg+="Nombre -> + " + ciudades[i].getCiudad() + "\tPoblacion ->" + ciudades[i].getHabitantes() + "habitantes.\n";
            
        }
        return msg;
    }
}
