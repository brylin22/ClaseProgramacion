/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length ==2){
            String nombre = args[0];
            double sueldo = Double.parseDouble(args[1]);
            Empleado juan = new Empleado();
            juan.setNombre(nombre);
            juan.setSueldo(sueldo);
            juan.imprimirDatos();
            juan.pagaImpuestos();
            
            
            
            
            
            
        }else{
            System.out.println("Numero de parámetros incorrecto. ");
        }
    }
    
}
