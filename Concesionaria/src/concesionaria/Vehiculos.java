/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionaria;

/**
 *
 * @author UCA40413
 */
public class Vehiculos 
{
    private String Placa;
    private String Marca;
    private double Precio;

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) 
    {//debe tener 7 digitos
        if(Placa.length()!=7)//excepcion
        {
            //lanzamos la excepción
            throw new IllegalArgumentException("Error la placa debe tener 7 caracteres");
        }
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca)
    {
        if(Marca.length()<3)
        {//lanzamos excepcion
           throw new IllegalArgumentException("La marca debe tener minimo 3 caracteres");
        }
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) 
    {
        if(Precio <= 0)
        {
            throw new IllegalArgumentException("Error el precio debe ser mayor a cero");
        }
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Vehiculos: " + "Placa= " + Placa + ", Marca= " + Marca + ", Precio= " + Precio ;
    }
    
    
    
}
