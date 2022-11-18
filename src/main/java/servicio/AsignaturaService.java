/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Asignatura;


/**
 *
 * @author Juan Diego Roman
 */
public interface AsignaturaService {
    
    public abstract void crear(Asignatura asignatura);

    public abstract void modificar(int codigo, Asignatura AsignaturaModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Asignatura> listar();
    
}
