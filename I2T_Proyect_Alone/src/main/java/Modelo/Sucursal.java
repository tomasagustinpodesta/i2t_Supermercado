package Modelo;
import java.util.*;

/**
 *
 * @author Tomy
 * Almacena informacion de una sucursal
 */
public class Sucursal {
    //Variables instancia
    String nombre;
    boolean dona;
    private Supermercado superm;
    
    //Constructor
    void Sucursal(){
        
    }
    
    //Metodos
    public String getNombre(){
        return nombre;
    }
    
    public Supermercado getSuperm(){
        return superm;
    }
    
    public boolean getDona(){
        return dona;
    }
    
    public void setNombre(String input){
        nombre = input;
    }
    
    public void setSuperm(Supermercado input){
        superm = input;
    }
    
    public void setDona(boolean input){
        dona = input;
    }
    
}
