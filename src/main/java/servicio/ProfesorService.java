/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Profesor;

/**
 *
 * @author Juan Diego Roman
 */
public interface ProfesorService {
    
    public abstract void crear(Profesor profesor);

    public abstract void modificar(int codigo, Profesor ProfesorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Profesor> listar();
}
