/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_06;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Agenda {
    private Persona[] miPersona;
    private int contador;

    public Agenda(Persona[] miPersona, int contador) {
        this.miPersona = miPersona;
        this.contador = contador;
    }
    public void mostrarAgenda(){
        for(Persona p: miPersona){
            System.out.println(p.toString());
        }
    }
    public void insertar(Persona persona){
        int metido = 0;
        for(int i = 0; i<miPersona.length;i++){
            if(miPersona[i]==null){
                miPersona[i] = persona;
                contador++;
                metido++;
                break;
            }
            
        }
        if(metido !=1){
            System.out.println("Agenda llena. ");
        }else{
            System.out.println("La persona se ha introducido exitosamente. ");
        }
        
    }
    public void buscar(Persona persona){
        for(int i = 0; i<miPersona.length;i++){
            if(miPersona[i]==persona){
                System.out.println("La persona ha sido encontrada");
                System.out.println("Esta persona esta en el index: " + i);
                System.out.println("Numero de telefono: " + persona.getTelefono());
                System.out.println("Nombre: " + persona.getNombre());
                break;
            }
            
        }
        
    }
    public void modificar(Persona persona){
        Scanner t = new Scanner(System.in);
        for(int i = 0; i<miPersona.length;i++){
            if(miPersona[i]==persona){
                System.out.println("La persona ha sido encontrada");
                System.out.println("Esta persona esta en el index: " + i);
                System.out.println("Numero de telefono: " + persona.getTelefono());
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Ahora introduce el nuevo nombre: ");
                persona.setNombre(t.nextLine());
                
                System.out.println("Ahora introuce el nuevo numero de telefono: ");
                persona.setTelefono(t.nextInt());
                
                System.out.println("");
                System.out.println("Se ha modificado de manera exitosa");
                break;
            }
            
        }
        
    }
    
}
