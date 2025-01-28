/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

import UD04_HOJA08.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DAW106
 */
public class matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int n = 0;
        int r = 0;
        int suma = 0;
        int pequeño;
        int pequeñopos;
        int mayor;
        int mayorpos;
        
        Random numero = new Random();
        Scanner t = new Scanner(System.in);
        
        
        System.out.println("Introduce el numero N: ");
        int N = Integer.parseInt(t.nextLine());

         int [][]matriz = new int [N] [N];
        for(int i = 0; i<N; i++){
            for(int j = 0; i<N;j++){
                matriz[i][j] = numero.nextInt(100)+1;
            }
        }
        
        System.out.println("Mostramos el array: ");
        for(int i = 0; i<N; i++){
            for(int j = 0; i<N; j++){
                System.out.println(matriz[i][j] + "\t");   
            }
            
        }
        System.out.println("Calculamos la suma de todos"
                + "los elementos del array.");
        for(int i = 0; i<matriz.length; i++){
            for(int f = 0; f<N;f++){
               suma+=matriz[i][f]; 
            }
            
            
        }
        System.out.println("La suma de todos los elementos es: " + suma);
        
        
        int max = matriz[0][0], min = matriz[0][0];
        int filaMax = 0, columnaMax = 0, filaMin = 0, columnaMin=0;
                
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; i<matriz.length;j++){
                if(matriz[i][j]>max){
                    max = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                    
                }
                if(matriz[i][j]<min){
                    min = matriz[i][j];
                    filaMin = i;
                    columnaMin = j;
                    
                }
            }
      
        }
        System.out.println("El número más grande es: " + max + " en la posición (" + filaMax + ", " + columnaMax + " )");
        System.out.println("El número más pequeño es: " + min );
        System.out.println("El promedio es: " + (suma/matriz.length));
        
        System.out.println("Susteitye un valor por otros pedido por el teclado: ");
        int valor = t.nextInt();
        
        for(int i = 0; i<N;i++){
            for(int f = 0; f<N;f++){
                if(matriz[i][f] == valor){
                    matriz[i][f] = valor;
                }
            }
        }
        System.out.println("Los valores se ha sustituido correctamente. ");
        
        
        
    }
    
}
