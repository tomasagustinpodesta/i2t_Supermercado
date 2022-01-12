package Modelo;

/**
 *
 * @author Tomy
 * Almacena informacion de un cajero
 */
public class Cajero {
    //Variables instancia
    Integer dni;
    String nombre;
    boolean trabajando;
    
    //Constructor
    void Cajero(){
        
    }
    
    //Constructor
    void Puesto(){
        
    }
    
    //Metodos
    public Integer getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean getTrabajando(){
        return trabajando;
    }
    
    public void setDni(Integer input){
        dni = input;
    }
    
    public void setNombre(String input){
        nombre = input;
    }
    
    public void setTrabajandoo(boolean input){
        trabajando = input;
    }
}
