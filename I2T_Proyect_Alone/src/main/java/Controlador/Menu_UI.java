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
            String option = myObj.nextLine();        // Input de opciones del inicio del programa
            
            //Abre un puesto
            if(option.equals("1")){
                
                Boolean bandera;
                Apertura_UI apertura_ui = new Apertura_UI();
                puestoCobro = new PuestoCobro();
                /*
                Siguiente codigo desarrollo comentado porque no tengo desarrollado apertura,
                cobro,retiro, cambio y cierre
                */
                /* bandera = apertura_ui.abrir();
                if(!bandera){
                    break;
                }
                */
                System.out.println("Operaciones disponibles");
                Boolean j = true;
                while(j){
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1) Cobro");
                    System.out.println("2) Retiro");
                    System.out.println("3) Cambio");
                    System.out.println("4) Cierre");
                   
                    String option2 = myObj.nextLine(); // Input de opciones del puesto
                    
                    //Distintas opciones
                    switch(option2){
                        //Cobro
                        case "1":
                            System.out.println("Usted selecciono cobro");
                            /* 
                            Cobro_UI cobro_ui = new Cobro_UI();
                            cobro_ui.cobrar();
                            */
                        break;
                        
                        //Retiro
                        case "2":
                            System.out.println("Usted selecciono retiro");
                            /*
                            Retiro_UI retiro_ui = new Retiro_UI();
                            retiro_ui.retirar();
                            */
                        break;
                        
                        //Cambio
                        case "3":
                            System.out.println("Usted selecciono cambio");
                            /*
                            Cambio_UI cambio_ui = new Cambio_UI();
                            cambio_ui.cambiar();
                            */
                        break;
                        
                        //Cierre
                        case "4":
                            System.out.println("Usted selecciono cierre de puesto");
                            /*
                            Cierrre_UI cierre_ui = new Cierre_UI();
                            cierre_ui.cerrar();
                            */
                            j = false;
                        break;
                    }
                }
              //Termina el ciclo y el programa
            } else if(option.equals("2")){
                   System.out.println("Usted selecciono terminar programa");
                   i = false;
                  }
        }
    }
    
    public boolean abrir(PuestoCobro puestoCobro){
        Scanner myObj = new Scanner(System.in);  // Crear objeto scanner
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // ingresar dato
        
        return true; //para que no se enoje netbeans
    }
    
}
