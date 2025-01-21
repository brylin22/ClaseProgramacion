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
public class Articulo {
    private int codigo;
    private String descripcion;
    private int existencias;
    
    public Articulo(){
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduce los parametros del articulo: ");
        System.out.println("Introduce codigo: ");
        this.codigo = t.nextInt();
        System.out.println("Introduce la descripcion: ");
        this.descripcion = t.nextLine();
        System.out.println("Introduce las existencias: ");
        this.existencias = t.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
}
