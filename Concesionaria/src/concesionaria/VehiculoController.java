/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionaria;

import java.util.ArrayList;

/**
 *
 * @author UCA40413
 */
public class VehiculoController 
{
    ArrayList <Vehiculos> lista= new ArrayList();
    
    public void agregar(Vehiculos nuevoVehiculos)
    {
        lista.add(nuevoVehiculos);
    }
    public void listar()
    {
        System.out.println("LA LISTA DE PERSONAS ES: ");
        for(int i=0; i<lista.size(); i++)
        {
            System.out.println(lista.get(i));
        }
    }
}
