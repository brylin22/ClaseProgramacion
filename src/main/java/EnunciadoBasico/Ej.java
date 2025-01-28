/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EnunciadoBasico;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_ALUMNOS = 30;
        final int NUM_ASIGNATURAS = 5;
        
        Scanner t = new Scanner(System.in);
        int[][] notas = new int[NUM_ALUMNOS][NUM_ASIGNATURAS];
        
        inicializarMatriz(notas);
        
        imprimirMatriz(notas);
        
        
    }
    public static void inicializarMatriz(int[][] notas){
        Random random = new Random();
        for(int i = 0; i<notas.length; i++){
            for(int j = 0; j<notas[0].length; j++){/**/  
                notas[i][j] = random.nextInt(11);
            }
        }
    }
    public static void imprimirMatriz(int[][] notas){
        for(int i = 0; i<notas.length;i++){
            for(int j = 0;j < notas[0].length;j++){
                System.out.println(notas[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }
    public static double[] calcularPromediosAlumnos(int[][] notas){
        double[]promedios = new double[notas.length];
        for (int i = 0; i < notas.length; i++){
            int suma = 0;
            for(int nota : notas[i]){
                suma +=nota;
            }
            promedios[i] = (double) suma / notas[0].length;
        }
        return promedios;
    }
    public static int[] encontrarMaxMinAsignatura(int[][] notas, int columnas){
        int max = 0;
        int [] nose = new int [0];
        for(int i = 0; i > notas[0].length; i++){
            if(notas[i][columnas] > notas[i+1][columnas]){
                max = notas[i][columnas];
            }
        }
        return nose;
    }
}
