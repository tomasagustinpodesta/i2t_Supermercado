package Modelo;

import java.util.*;

/**
 *
 * @author Tomy
 * Almacena informacion de un puesto
 */
public class PuestoCobro {
    //Variables
    Supermercado supermercado;
    Cajero cajero;
    Puesto puesto;
    Sucursal sucursal;
    HashMap<String, HashMap<Double, Integer>> valoresDisponibles;
    
    //Metodos get
    
    /**
     * El metodo devuelve el supermercado responsable del puesto
     * @param No
     * @return Supermercado que maneja el puesto
     */
    public Supermercado getSupermercado(){
        return supermercado;
    }
    
    /**
     * El metodo devuelve el cajero que esta trabajando en el puesto que se esta utilizando
     * @param No
     * @return Cajero que esta trabajando en el puesto actual
     */
    public Cajero getCajero(){
        return cajero;
    }
    
    /**
     * El metodo devuelve el puesto que se esta utilizando
     * @param No
     * @return Puesto que se esta utilizando actualmente en este Objeto
     */
    public Puesto getPuesto(){
        return puesto;
    }
    
    /**
     * El metodo devuelve la Sucursal donde se encuentra el puesto
     * @param No
     * @return Sucursal donde se encuentra el puesto utilizado en este momento
     */
    public Sucursal getSucursal(){
        return sucursal;
    }
    
    /**
     * El metodo devuelve los valores posibles junto con sus cantidades disponibles en el puesto
     * @param No
     * @return Valores posibles junto con sus cantidades disponibles en el puesto
     */
    public HashMap<String, HashMap<Double, Integer>> getValoresDisponibles(){
        return valoresDisponibles;
    }
    
    //Metodos set
    
    /**
     * El metodo cambia el supermercado responsable del puesto
     * @param Supermercado responsable del puesto
     * @return No
     */
    public void setSupermercado(Supermercado superInput) {
        this.supermercado = superInput;
    }
    
    /**
     * El metodo cambia el cajero que trabaja en el puesto
     * @param cajero que esta trabajando en el puesto
     * @return No
     */
    public void setCajero(Cajero cajeroInput) {
        this.cajero = cajeroInput;
    }
    
    /**
     * El metodo cambia el puesto activo
     * @param puesto activo
     * @return No
     */
    public void setPuesto(Puesto puestoInput) {
        this.puesto = puestoInput;
    }
    
    /**
     * El metodo cambia la sucursal del puesto
     * @param sucursal donde se encuentra el puesto
     * @return No
     */
    public void setSucursal(Sucursal sucursalInput) {
        this.sucursal = sucursalInput;
    }
    
    
    /**
     * Completar metodo para establecer los valores disponibles (Necesario?)
     */
    public void setValoresDisponibles(HashMap<String, HashMap<Double, Integer>> valoresInput) {
        this.valoresDisponibles = valoresInput;
    }
    
    //Resto de metodos 
    /**
     * Este metodo sirve para registrar un ingreso de dinero en el sistema
     * @param tipoValor: Si es billete o moneda
     * @param denominacion: tamanio del billete o moneda
     * @param cantidadDineroIngresado: cantidad del dinero ingresado
     * @return true (operacion exitosa) o false (operacion fallida)
     */
    public Boolean ingresarDinero(String tipoValor, Double denominacion, Integer cantidadDineroIngresado){
        if(existeTipoValorYDeno(tipoValor, denominacion)){
            HashMap<Double, Integer> mapa = valoresDisponibles.get(tipoValor);
            mapa.put(denominacion, mapa.get(denominacion) + cantidadDineroIngresado);
            return true;
        } else return false;
        
    }
    
    /**
     * Este metodo sirve para registrar un egreso de dinero en el sistema
     * @param tipoValor: Si es billete o moneda
     * @param denominacion: tamanio del billete o moneda
     * @param cantidadDineroIngresado: cantidad del dinero ingresado
     * @return true (operacion exitosa) o false (operacion fallida)
     */
    public Boolean retirarDinero(String tipoValor, Double denominacion, Integer cantidadDineroEgresado){
        HashMap<Double, Integer> mapa = valoresDisponibles.get(tipoValor);
        if(existeTipoValorYDeno(tipoValor, denominacion)){
            if(mapa.get(denominacion) >=  cantidadDineroEgresado){
                mapa.put(denominacion, mapa.get(denominacion) - cantidadDineroEgresado);
                return true;
            } else return false;
        } else return false;
    }
    
    /**
     * Metodo resultado de refactorizacion, indica valida si se ingreso bien el tipo de valor y denominacion
     * @param tipoValor: billete o moneda
     * @param denominacion: denominacion del billete o moneda en cuestion
     * @return true (ambos son validos) o false (ambos o uno no son validos)
     */
    public Boolean existeTipoValorYDeno(String tipoValor, Double denominacion){
        Boolean result = true;
        if(tipoValor != "Billete" || tipoValor != "Moneda"){
            return false;
        }
        
        if(!valoresDisponibles.containsKey(denominacion)){
            return false;
        }
        return true;
    }
}