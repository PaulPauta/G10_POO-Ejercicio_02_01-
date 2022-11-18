/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import modelo.Calificacion;
import servicio.CalificacionServicelmpl;

/**
 *
 * @author Juan Diego Roman
 */
public class Calificacioncontrol {
    
    private CalificacionServicelmpl CalificacionServicelmpl;
    

    public Calificacioncontrol() {
        this.CalificacionServicelmpl = new CalificacionServicelmpl();
    }
    
    
    public String crear(String [] deto){
        var retorno="No se pudo crear el grupo";
        var notasPruebas=Double.valueOf(deto[0]).doubleValue();
        var notasDeberes=Double.valueOf(deto[1]).doubleValue();
        var notasGrupales=Double.valueOf(deto[2]).doubleValue();
        var notaMinima=Integer.valueOf(deto[3]).intValue();
        var nroLista=Integer.valueOf(deto[4]).intValue();
        
        
        
        if(notasPruebas<0.0 || notasDeberes<0.0 || notasGrupales<0.0 || notaMinima<0 || nroLista<0){
            retorno+=" horas o dias impartidos incorrectos";
        }else{
            var calificacion = new Calificacion(notasPruebas,notasDeberes,notasGrupales,notaMinima,nroLista);
            this.CalificacionServicelmpl.crear(calificacion);
            retorno= "calicacion de "+calificacion.getNroLista()+" creado correctamente"
                    +calificacion.toString();
        }
        return retorno;
    
    }
    
    
    
}
