/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01;

/**
 *
 * @author DAW106
 */
public class pruebaconsola3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        if(args.length>0){
             n = Integer.parseInt(args[0]);
        }
        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
            
        }
    }
    
}
