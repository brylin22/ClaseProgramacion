/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Operaciones {
    
    private int n1, n2;
    
    public void suma(){
        System.out.println("La suma es " + (n1+n2));
    }
    public void resta(){
        System.out.println("La resta es " + (n1-n2));;
    }
    public void multiplicacion(){
        System.out.println("La multiplicacion es: " + (n1*n2));
    }
    public void division(){
        if(n1 == 0 || n2 == 0){
            System.out.println("La division es: " + (n1/n2)); 
        }else{
            System.out.println("No se puede dividir entre 0: ");
            
        }
        
        
    }

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    
}
