/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionaria;

import java.util.Scanner;

/**
 *
 * @author UCA40413
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        VehiculoController vc= new VehiculoController();
        int sw=1;
        String rpta ="s";
        while(rpta.equalsIgnoreCase("s"))
        {
            
            Vehiculos v= new Vehiculos();
            while(sw==1)
            {
                System.out.println("INGRESE LA PLACA: ");
                String placa=sc.nextLine();
                System.out.println("*LA PLACA ES: "+placa);
                try
                {
                    v.setPlaca(placa);
                    sw=0;
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                    sw=1;
                }
            }
            sw=1;
            while(sw==1)
            {
                System.out.println("INGRESE LA MARCA: ");
                String marca=sc.nextLine();
                System.out.println("*LA MARCA ES: "+marca);
                try
                {
                    v.setMarca(marca);
                    sw=0;
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                    sw=1;
                }
            }
            sw=1;
            while(sw==1)
            {
                System.out.println("INGRESE EL PRECIO: ");
                double precio=sc.nextDouble();
                System.out.println("*LA PRECIO ES: "+precio);
                try
                {
                    v.setPrecio(precio);
                    sw=0;
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                    sw=1;
                }
            }
            sw=1;
            sc.nextLine();
            
            System.out.println("EL OBJETO CON SUS ATRIBUTOS SON: ");
            System.out.println(v);

            vc.agregar(v);
            System.out.println("DESEA AGREGAR OTRO VEHICULO: ");
            rpta=sc.nextLine();
        }
            System.out.println("LA LISTA DE VEHICULOS ES: ");
            vc.listar();
        
    }
    
}
