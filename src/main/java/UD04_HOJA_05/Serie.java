/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA_05;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Serie {
    private double[]serie;
    private char ns;

    public Serie(char ns) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el array: ");
        serie = new double[t.nextInt()];
        for(int i = 0; i<serie.length;i++){
            System.out.println("Introduce el valor del array n" + i +":");
            serie[i]=t.nextDouble();

        }
        
        this.ns = ns;
        
        
        
        
        
        
        
    }
    public double resultado(){
        double suma = 0;
        if(ns=='+'){
            for(int i=0;i<serie.length;i++){
                suma+=serie[i];
            }
            
        }else if(ns=='*'){
            suma=1;
            for(int i=0;i<serie.length;i++){
                
                suma*=serie[i];
            }
        }else{
            System.out.println("Has puesto algo mal");
        }
        
        
        return suma;
    }
    
    
    
    
}
