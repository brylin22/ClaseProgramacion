/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class pruebaconsola2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce un n´mero entero: ");
        
        int n = 3;
        n = t.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n * i);
            
        }
    }
    
}
