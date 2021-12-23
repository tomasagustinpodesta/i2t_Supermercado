package Controlador;
import java.util.*;
import Modelo.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

/**
 *
 * @author Tomy
 * Inferfaz de usuario, presenta las 5 opciones posibles en un puesto
 */

public class Menu_UI {
    
    //Variables de instacia
    private PuestoCobro puestoCobro;
    
    //Contructor
    public void Menu_UI(){
        
    }   
    
    //Metodos
    /**
     * Este metodo representa el menu de la interfaz del software
     * @param No
     * @return No
     */
    public void procesar(){
        Boolean i = true;
        while(i){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now(); 
            System.out.print("Fecha actual: ");
            System.out.println(dtf.format(now));  
            System.out.println("Bienvenido");
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Abrir caja");
            System.out.println("2) Cerrar programa");
            
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String option = myObj.nextLine();        // Input
            
            if(option.equals("1")){
                System.out.println("Operaciones disponibles");
                Boolean j = true;
                while(j){
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1) Apertura");
                    System.out.println("2) Cobro");
                    System.out.println("3) Retiro");
                    System.out.println("4) Cambio");
                    System.out.println("5) Cierre");
                   
                    String option2 = myObj.nextLine(); // Input, Completar
                    
                }
            } else if(option.equals("2")){
                   
                  }
        }
    }
    
}
