/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        if(args.length ==2){
            int n1  =  Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            Operaciones brel = new Operaciones(n1, n2);
            brel.suma();
            brel.resta();
            brel.division();
            brel.multiplicacion();
            
            
            
        }
        
        
    }
    
}
