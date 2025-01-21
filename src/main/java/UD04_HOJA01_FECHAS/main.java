/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA01_FECHAS;

/**
 *
 * @author DAW106
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Veterinario mg = new Veterinario();
        
        Mascota pluto = new Mascota("pluto", 1956, 2, 1);
        Mascota abba = new Mascota("abba", 2023, 7, 2);
        
        mg.anadir(abba);
        mg.anadir(pluto);
        
        System.out.println("PROGRAMA DE PRUEBA DE VETERIANARIOS");
        System.out.println("Datos de las mascotas");
        System.out.println(mg.mostrar());
        System.out.println("------------------ ");
        
        System.out.println("Macscotas de mas de 5 anos");
        System.out.println(mg.mostrarMayores());
        System.out.println("Buscar una mascota por nombre");
        System.out.println(mg.buscarPorNombre("abba"));
    
        System.out.println(mg.buscarPorNombre("dino"));
    
    
    
    
    }   
    
    
    
}
