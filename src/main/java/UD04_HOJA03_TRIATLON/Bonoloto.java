/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA03_TRIATLON;

import java.util.Random;

/**
 *
 * @author DAW106
 */
public class Bonoloto {
    private int[] bono = new int[6];
    int ro = 0;
    boolean resultado;
    public Bonoloto(){
        Random n = new Random();
        
        for(int i = 0; i<bono.length;i++){
            ro = n.nextInt(49)+1;
            for(int f = 0; i<bono.length;f++){
                resultado = bono[i] ==ro? true : false;
            }
            if(resultado = false){
                bono[i] = ro; 
                
            }else{
                i--;
            }
            
            
        }
        
        
    }
    public String mostrar(){
        String msg = "";
        for(int i = 0; i<bono.length; i++){
            msg+= bono[i];
        }
        return msg;
    }
    
}
