/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA_05;

/**
 *
 * @author DAW106
 */
public class sopamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sopa brel = new Sopa();
        brel.mostrar();
        
        System.out.println("Con palabra");
        brel.setPalabra("BREL", 5, 5, 1);
        brel.mostrar();
    }
    
}
