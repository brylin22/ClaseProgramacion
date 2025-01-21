/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD04_HOJA_05;

/**
 *
 * @author DAW106
 */
public class Sopa {
    
   private char[][] sopa;
    
    public Sopa(){
        sopa = new char [10][20];
        for(int i = 0; i<sopa.length;i++){
            for(int j=0;j< sopa[0].length;j++){
                
                sopa[i][j] = (char) (Math.floor(Math.random()*(90 -65+1)+65));
                
            }
        }
        
    }
    public Sopa(int filas, int columnas){
        sopa = new char [filas][columnas];
        
        for(int i = 0; i<filas;i++){
            for(int j=0;j< columnas;j++){
                
                sopa[i][j] = (char) (Math.floor(Math.random()*(90 -65+1)+65));
                
            }
        }
    }
    
    public void mostrar(){
        for(int i = 0; i<sopa.length;i++){
            
            for(int j=0;j< sopa[0].length;j++){
                
                System.out.print(sopa[i][j]+ " ");
                
            }
            System.out.println("");
        }
    }
    

    public void setPalabra(String palabra, int x, int y, int D){
        
        if(D==1){
            if(palabra.length()+ y>sopa.length){
                for(int i = 0; i<palabra.length(); i++){
                    sopa[x][y++] = palabra.charAt(i);
                    
                    
                }
            }else if(D==-1){
                if(palabra.length()+x <sopa[x].length){
                    for(int j=0;j<palabra.length(); j++){
                        sopa[x++][y]=palabra.charAt(j);
                    }
                }
            }
        }
        
    }
    
    
    
}
