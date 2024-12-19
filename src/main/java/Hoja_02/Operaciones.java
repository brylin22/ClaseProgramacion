/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Operaciones {
    int opArray [] = new int[5];
    public Operaciones(){
        Scanner t = new Scanner(System.in);
        
        for(int i =0; i<opArray.length; i++){
            System.out.println("Introduce un numero entero: " + (i+1) + "/5");
            
            opArray[i] = t.nextInt();
            
        }
        
    }
    
    public void Multiplica(){
        for(int i =0; i<opArray.length; i++){
            opArray[i]*=2;
            
        }      
    }
    
    public void Mostrar(){
        for(int i =0; i<opArray.length; i++){
            System.out.print(opArray[i] + " ");
            
            
            
        }
        
    }
    public int SumaPares(){
        int suma = 0;
        for(int i = 0;i<opArray.length; i+=2){
            System.out.println("Suma posicione pares: ");
            
            suma +=opArray[i];
            System.out.print(suma);
            
        }
        return suma;
    }
    public void Esta(){
        
        System.out.println("Introduce el número que quieras evaluar: ");
        
        
        
    }
            
}
