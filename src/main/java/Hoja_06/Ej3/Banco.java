/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_06.Ej3;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Banco {
    private Cliente [] clientes;
    private int contador;
    private int nmax;
    
    public Banco(int nmax){
        this.nmax = nmax; 
        clientes = new Cliente[nmax];
        
            
    }
    public void  ingresar(){
        
        if (contador<clientes.length){
                int codigo;
             String nombre, apellidos, telefono;
             double saldo;
             Scanner t = new Scanner(System.in);
             System.out.println("Dar de alta al usuario: ");
             codigo = contador+1;

             System.out.println("Introduce el nombre del susuario: ");
             nombre = t.nextLine();
             System.out.println("Introduce los apellidos: ");
             apellidos = t.nextLine();
             System.out.println("Introduce el numero de telefono: ");
             telefono = t.nextLine();
             System.out.println("Introduce el saldo del usuario: ");
             saldo = t.nextDouble();

             Cliente cliente = new Cliente();

             cliente.setCodigo(codigo);
             cliente.setNombre(nombre);
             cliente.setApellidos(apellidos);
             cliente.setTelefono(telefono);
             cliente.setSaldo(saldo);

             clientes[contador] = cliente;
             contador++;
             System.out.println("Cliente creado correctamente"); 
        }else{
            System.out.println("El usuario no se puede dar de alta. ");
        }
        
        
        
        
    }
    public String buscar(int codigo){
        String cadena = "";
        boolean encontrado = false;
        int i = 0;
        
        while(!encontrado && i < contador){
            if(clientes[i] !=null && clientes[i].getCodigo() == codigo){
                encontrado = true;
            }else{
                i++;
            }
        }
        if(encontrado){
            cadena += "Codigo: " + clientes[i].getCodigo() + "\n"
                    +"Nombre: " + clientes[i].getNombre() + "\n"
                    +"Apellido: " + clientes[i].getApellidos() + "\n"
                    +"Telefono: " + clientes[i].getTelefono() + "\n"
                    +"Saldo " + clientes[i].getSaldo() + "\n";
        }else {
            System.out.println("Ese cliente no esta ");
        }
        return cadena;
    }
    public void eliminar(int codigo){
                boolean encontrado = false;
        int i = 0;
        
        while(!encontrado && i < contador){
            if(clientes[i] !=null && clientes[i].getCodigo() == codigo){
                encontrado = true;
                
                for(int j = i; j<contador - 1; i++){
                    clientes[j] = clientes[j+i];
                }
                
                clientes[contador -1] = null;
                contador--;
            }else{
                i++;
            }
        }
        if(encontrado){
            System.out.println("El cliente ha sido eliminado.");
        }else {
            System.out.println("Exe cliente no existe.");
        }
     
    }
    public void mostrar(int codigo){
        if(contador>0){
            for(int i = 0; i< contador; i++){
                System.out.println(clientes[i].toString());
                
            }
        
            
        }else{
            System.out.println("NO hay clientes registrados. ");
        }
    }
        
}
