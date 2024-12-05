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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[] = {1,3,5,7,2,6,2,7,8,3};
        Scanner t = new Scanner(System.in);
        int num;
        int encontrado=0;
        int guardar = -1;
                
        for(int i = 0;i<numero.length;i++){
            numero[i]=(int) Math.round(Math.random()*10);
            
        }
        for(int i = 0;i<numero.length;i++){
            System.out.print(numero[i] + " ");
        }
                ;
        System.out.println("Introduzca un valor: ");
            num = t.nextInt();
        
        for(int i = 0;i<numero.length;i++){
            if(numero[i]==num){
                encontrado++;
                guardar=i;
                
            }
            
        }
        if(encontrado>0){
            System.out.println("El número ha sido encontrado. ");
            System.out.println("La posicion era: " + guardar);
        }else{
            System.out.println("El numero no ha sido encontrado. ");
        }
        System.out.println("El programa ha terminado. ");
    }
    
}
