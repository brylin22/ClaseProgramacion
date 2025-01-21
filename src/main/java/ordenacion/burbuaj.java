/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacion;

/**
 *
 * @author DAW106
 */
public class burbuaj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]array = {7, 2, 4, 21, 6, 5, 7, 4};
        System.out.println("El array de partida es; ");
        
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + "\t");
        }
        
        System.out.println("El array ahora es: ");
        for(int i = 0; i<array.length ; i++){
            for(int j = 0; j < array.length - 1 -1; j++){
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }
            System.out.print(array[i] + "\t");
        }
      
                
        
    }
    
}
