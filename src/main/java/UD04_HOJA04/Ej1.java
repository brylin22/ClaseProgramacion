/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD04_HOJA04;

/**
 *
 * @author DAW106
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejercicio 1, número Armstrong");
        //REcibe el argumento y verifica que es un numero armstrong
        int numero = Integer.parseInt(args[0]);
        
        if(args[0].length()==3){
            System.out.println("El numero introducido es " + numero);
            if(esArmstrong(numero)){
                System.out.println("... y es de Armstrong");
            }else{
                System.out.println("... y no es de Armstrong");
                
            }
        }else{
            System.out.println("El numero introducido no es valido");
        }
        
        //Aquí irá el método que me compueba si el número es Armstrong
        

    }
    
    
    public static boolean esArmstrong(int numero){
        String numeroString = String.valueOf(numero);
        boolean resultado = false;
        int numDigitos = numeroString.length();
        int suma = 0;
        
        int copia = numero;
        while(copia!=0){
            int ultimoNumero = copia%10;
            suma +=Math.pow(ultimoNumero, numDigitos);
            copia/=10;
        }
        if(suma == numero){
            resultado = true;
        }
        
        
        return resultado;
    }
    
    
    
    
}
