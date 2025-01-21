/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA03_TRIATLON;

/**
 *
 * @author DAW106
 */
public class comumain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comunidad brel = new Comunidad();
        
        System.out.println(brel.mostrar());
        System.out.println("HACEMOS UN SORTEO");
        System.out.println(brel.sorteo());
        System.out.println(brel.buscar("huesca"));
        System.out.println(brel.buscar("cuenca"));
        
    }
    
}
