/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Calificacion;

/**
 *
 * @author Juan Diego Roman
 */
public interface CalificacionService {
    
    public abstract void crear(Calificacion calificacion);

    public abstract void modificar(int nroLista, Calificacion CalificacionModificado);

    public abstract void eliminar(int nroLista);

    public abstract List<Calificacion> listar();
    
}
