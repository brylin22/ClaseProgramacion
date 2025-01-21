/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio 2");
        
        
        if(args.length == 2){
            String nombre = args[0];
            int edad = Integer.parseInt(args[1]);
            Persona ejemplo = new Persona(nombre, edad);
            ejemplo.imprimir();
            
            boolean mayor = ejemplo.esMayorEdad();
            String smg = mayor ? "si": "no";
            System.out.println(nombre.toUpperCase()+ smg + " es mayor de edad");
           
        }else{
            
            System.out.println("Numeros de parametros incorrecto");
        }
        
        
        
        
        
    }

}
