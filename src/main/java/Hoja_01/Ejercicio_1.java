/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01;

/**
 *
 * @author daw106
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] brel = {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
        for(int i = 0;i<brel.length;i++){
            brel[i] = -1;
            System.out.print(brel[i]+ " ");
        }
        System.out.println("");
        for(int i = 0;i<brel.length;i++){
            int ran = (int) Math.round(Math.random()*10);
            
            brel[i] = ran;
            System.out.print(brel[i] + " ");
            
        }
     
        
    }
    
}
