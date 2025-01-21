/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA_05;

/**
 *
 * @author DAW106
 */
public class figuramain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura brel = new Figura('X', 7);
        System.out.println("Cuandrado completo");
        
        
        System.out.println(brel.cuadrado());
        System.out.println("");
        System.out.println("Cuadrado vacio");
        System.out.println(brel.cuadradoVacio());
        System.out.println("");
        System.out.println("Aspa");
        System.out.println(brel.aspa());
        
        
        
        
    }
    
}
