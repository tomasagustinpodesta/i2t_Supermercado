/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Tomy
 * Almacena informacion de un puesto
 */
public class Puesto {
    //Variables instancia
    Integer numeroPuesto;
    boolean utilizado;
    Sucursal sucursal;
    
    //Constructor
    void Puesto(){
        
    }
    
    //Metodos
    public Integer getNombrePuesto(){
        return numeroPuesto;
    }
    
    public Sucursal getSucursal(){
        return sucursal;
    }
    
    public boolean getUtilizado(){
        return utilizado;
    }
    
    public void setNombrePuesto(Integer input){
        numeroPuesto = input;
    }
    
    public void setSucursal(Sucursal input){
        sucursal = input;
    }
    
    public void setUtilizado(boolean input){
        utilizado = input;
    }
}
