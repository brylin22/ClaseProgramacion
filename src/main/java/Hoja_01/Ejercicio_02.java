/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01;

import java.util.Scanner;

/**
 *
 * @author daw106
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]ciudades = new int[10];
        Scanner t = new Scanner(System.in);
        for(int i = 0;i<ciudades.length;i++){
            System.out.println("Introduce la temperatura de 10 ciudades: ");
            System.out.println("Ciudad " + i + ":");
            ciudades[i] = t.nextInt();
            
            
        }
        System.out.println("La temperatura de las ciudades es: ");
        for(int i = 0;i<ciudades.length;i++){
            System.out.print("\nTemperatura de ciudad: " + i + ": " + ciudades[i] + " ");
            
        }
        
    }
    
}
