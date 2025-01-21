/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_06.Ej3;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int opcion = -1;
        System.out.println("Introduce el numero máximos de clientes que quieres que tenga el banco: ");
        int nmax; 
        nmax = t.nextInt();
        Banco banco = new Banco(nmax);
        System.out.println("El numero max de lcint");
        
        do{
            System.out.println("Introduce las siguiente opciones: ");
            System.out.println("1. Ingresar un cliente ");
            System.out.println("1. Ingresar un cliente ");
            System.out.println("1. Ingresar un cliente ");
            System.out.println("1. Ingresar un cliente ");
            System.out.println("1. Ingresar un cliente ");
            System.out.println("");
            System.out.println("Introduce: ");
            opcion = t.nextInt();
            switch(opcion){
                case 1: System.out.println("Vamos a ingresar un clinte: ");
                ;
                break;
                
                case 2: ; 
                break;
                case 3: ;
                break;
                
                case 4: ; 
                break; 
                case 5: ;
                break;
                
                default: System.out.println("Incorrecto ");
                
             }
        }while(opcion != 5);
            
            
            
            
        
    }
    
}
