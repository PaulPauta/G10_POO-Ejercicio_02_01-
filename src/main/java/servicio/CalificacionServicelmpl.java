/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Calificacion;


/**
 *
 * @author Juan Diego Roman
 */
public class CalificacionServicelmpl {
    
    private List<Calificacion> calificacionList;

    public CalificacionServicelmpl() {
        this.calificacionList= new ArrayList<>();
    }

    
    public void crear(Calificacion calificacion) {
        this.calificacionList.add(calificacion);
    }

    
    public void modificar(int codigo, Calificacion calificacionModificado) {
        var indice=0;
        
        this.calificacionList.set(indice, calificacionModificado);
    
    }

    
    public void eliminar(int nroLista) {
        var indice=0;
        for(var calificacion:this.calificacionList){
            if(calificacion.getNroLista()==nroLista){
                this.calificacionList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }
    
}
