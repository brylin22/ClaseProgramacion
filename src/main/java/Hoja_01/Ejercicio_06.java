/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01;

import java.util.Random;

/**
 *
 * @author DAW106
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                System.out.println("Ejercicio 5");
                int brel[]=new int[10];
        int brel2[]=new int[10];
        int mayor = Integer.MIN_VALUE;
        
        Random r = new Random();
        int d = 0;
        
        for(int i = 0;i<brel.length;i++){
            d = (int)Math.round(Math.random()*10);
            brel[i]=d;
        }
        System.out.println("");
        
        System.out.println("Array 1");
        for(int i = 0;i<brel.length;i++){
            System.out.print(brel[i] + " ");
        }
        
        for(int i = 0;i<brel.length;i++){
            if(brel[i]>mayor){
                mayor=brel[i]; 
            }
        }
        System.out.println("El valor mayor del array es " + mayor);

    }
    
}
