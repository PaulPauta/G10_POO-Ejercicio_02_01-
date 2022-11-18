/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Revista;

/**
 *
 * @author Juan Diego Roman
 */
public interface RevistaService {
    
    public abstract void crear(Revista revista);

    public abstract void modificar(int codigo, Revista RevistaModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Revista> listar();
    
}
