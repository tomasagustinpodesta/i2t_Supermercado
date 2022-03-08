package Controlador;
import java.util.*;
import Modelo.*;
import Modelo.DB.*;
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
        System.out.println("Iniciando apertura de caja");
        
        Scanner ingreso = new Scanner(System.in);  // Crear objeto scanner
        
        //Se ingresan datos del supermercado, sucursal, puesto y cajero
        
        //Supermercado
        System.out.println("Ingresar cuit de supermercado");
        Integer cuitSuper = ingreso.nextInt();  // ingresar dato supermercado
        Supermercado superm; //crear instancia supermercado
        SupermercadoABD supermABD = new SupermercadoABD(); //crear instancia supermercadoABD
        superm = supermABD.leer(cuitSuper); //Metodo incompleto Leer
        if(Objects.isNull(superm)){ // Verificar existencia del input en BD
            System.out.println("error");
            return false;
        } 
        
        
        //Sucursal
        Sucursal sucursal; //crear instancia sucursal
        SucursalABD sucursalABD = new SucursalABD(); //crear instancia sucursalABD
        System.out.println("Ingresar nombre de sucursal");
        String numeroSucursal = ingreso.nextLine();  // Ingresar dato sucursal
        sucursal = sucursalABD.leer(numeroSucursal); //Metodo incompleto Leer
        if(Objects.isNull(sucursal)){ // Verificar existencia del input en BD
            System.out.println("error");
            return false;
        } 
        
        //Puesto
        Puesto puesto;
        PuestoABD puestoABD = new PuestoABD();
        System.out.println("Ingresar numero de puesto");
        Integer numeroPuesto = ingreso.nextInt();
        puesto = puestoABD.leer(numeroPuesto);
        if(Objects.isNull(puesto)){ // Verificar existencia del input en BD
            System.out.println("error");
            return false;
        } 
        
        if(puesto.getUtilizado() == true){ // Verificar si el puesto esta en uso actualmente
            System.out.println("Puesto en uso");
            return false;
        } 
        
        //Cajero
        Cajero cajero;
        CajeroABD cajeroABD = new CajeroABD();
        System.out.println("Ingresar numero de puesto");
        Integer dni = ingreso.nextInt();
        cajero = cajeroABD.leer(dni);
        
        if(Objects.isNull(cajero)){ // Verificar existencia del input en BD
            System.out.println("error");
            return false;
        } 
        
        if(cajero.getTrabajando() == true){ // Verificar si el cajero esta trabajando actualmente
            System.out.println("Puesto en uso");
            return false;
        } 
        
        Valores valores = new Valores();
        HashMap<String, HashMap<Double, String>> mapa = valores.getValoresDisponiblesMapa2D();
        
        for(Map.Entry<String, HashMap<Double, String>> entry : mapa.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            
            for(Map.Entry<Double, String> entry2 : entry.getValue().entrySet()) {
            String key2 = entry.getKey();
            Object value2 = entry.getValue();
            
            System.out.println("Tipo:" + key + "  " + "Denominacion: " + key2);
            System.out.println("");
            }
        }
        return true; //para que no se enoje netbeans
    }
    
}
