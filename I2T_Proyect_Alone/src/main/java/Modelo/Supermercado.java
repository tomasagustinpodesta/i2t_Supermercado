package Modelo;
/**
 *
 * @author Tomy
 * Almacena informacion de supermercado
 */
public class Supermercado {
    //Variables instancia
    String nombre;
    Integer cuit;
    boolean dona;
    
    //Constructor
    void Supermercado(){
        
    }
    
    //Metodos
    public String getNombre(){
        return nombre;
    }
    
    public Integer getCuit(){
        return cuit;
    }
    
    public boolean getDona(){
        return dona;
    }
    
    public void setNombre(String input){
        nombre = input;
    }
    
    public void setCuit(Integer input){
        cuit = input;
    }
    
    public void setDona(boolean input){
        dona = input;
    }
}
