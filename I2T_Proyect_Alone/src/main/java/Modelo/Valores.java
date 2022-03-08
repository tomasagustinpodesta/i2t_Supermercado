package Modelo;

//Imports
import java.util.*;

/**
 *
 * @author Tomy
 * Contiene los valores de los billetes y monedas
 */
public class Valores {
    
    HashMap<String, HashMap<Double, String>> valoresDisponibles;
    /**
     * Muestra en pantalla los posibles valores que tiene la moneda pesos argentinos.
     * @param No
     * @throws valores disponibles de la moneda pesos
     */
    public HashMap<String, HashMap<Double, String>> getValoresDisponiblesMapa2D(){
        return valoresDisponibles; //testear
    } //String: bille o mone, Double: denominacion, String: representacion textual de lo anterior
    
    /**
     * Este metodo devuelve los valores disponibles de billetes o monedas, segun se ingrese
     * @param: La palabra "Billete" o "Moneda"
     * @return: Todos los valores disponibles de los billetes o monedas en pesos argentinos
     */
    public HashMap<Double, String> getSegDimValoresDisponiblesMapa2D(String billeOMoneda){
        if(billeOMoneda == "Billete" || billeOMoneda == "Moneda"){
            return valoresDisponibles.get(billeOMoneda);
        } else {
            return null;
        } //Testear
    }
    
    /**
     * Metodo principal de la clase.
     * @param La palabra "Billete" o "Moneda" y una denominacion.
     * @throws La representacion escrita de la denominacion ingresada.
     */
    public String getUnaDescripcion(String inputStr, Double inputDouble){
        String result = null;
        result = getValoresDisponiblesMapa2D().get(inputStr).get(inputDouble);
        return result; //testear
    }
    
}
