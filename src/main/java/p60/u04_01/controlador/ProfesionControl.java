/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.u04_01.controlador;

import java.util.InputMismatchException;
import java.util.List;
import p60.u04_01.modelo.Profesion;
import p60.u04_01.servicio.ProfesionServicio;

/**
 *
 * @author morti
 */
public class ProfesionControl {
    
    
    private final ProfesionServicio personaServicio = new ProfesionServicio();
    
    public Profesion crear(String [] params) throws RuntimeException{
        var profesion = new Profesion(this.convertirEntero(params[0]),params[1]);
        this.personaServicio.crear(profesion);
        return profesion;
    }
    
    public Profesion eliminar(String param) throws RuntimeException{
        return this.personaServicio.eliminar(this.convertirEntero(param));
    }
    
    
    private int convertirEntero(String numero)
    {
        try{
            return Integer.valueOf(numero);
        }catch(NumberFormatException e1){
            throw new RuntimeException("Valor ingresado no es un número entero"); 
        }catch(Exception e1){
            throw new RuntimeException("Error inesperado"); 
        }
    }
    
    private double convertirDecimal(String numero)
    {
        try{
            return Double.valueOf(numero);
        }catch(NumberFormatException e1){
            throw new RuntimeException("Valor ingresado no es un número entero"); 
        }catch(Exception e1){
            throw new RuntimeException("Error inesperado"); 
            
        }
    }
    

    
    public List<Profesion> listar() {
        return this.personaServicio.listar();
    }

}
