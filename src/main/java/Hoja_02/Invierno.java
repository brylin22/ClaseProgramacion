/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Invierno {
    private double temperaturas[];
    public Invierno(int n){
        Scanner t = new Scanner(System.in);
        
        temperaturas = new double[n];
        for(int i = 0;i<temperaturas.length;i++){
            System.out.println("Introduce la t: " + i);
            temperaturas[i] = t.nextDouble();
            
        }
    }
    public double tempMedia(){
        double suma = 0;
        for(int i = 0;i<temperaturas.length;i++){
            suma+= temperaturas[i];
            
        }        
        return ((suma)/(temperaturas.length));
    }
    public  double[] fahrenheit(){
        double f[] = new double [temperaturas.length];
        for(int i =0;i<temperaturas.length; i++){
            f[i]=temperaturas[i]*1.8+32;
        }
        Invierno.mostrar(f);
        
        return f;
    }

    public double[] getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(double[] temperaturas) {
        this.temperaturas = temperaturas;
    }
    public static void mostrar(double array[] ){
        
        for(int i = 0;i<array.length;i++){
            System.out.println("Mostrando tu array: ");
            System.out.println(array[i] + " ");
            
        }       
        
        
    }
    public String mostrarArray(double[] array){
        String msg = "";
        for(int i = 0; i < array.length; i++){
            msg=array[i] + " ºF\t";
        }
        
      return msg;  
    }
    
    
}
